(ns nameslice.core
  (:require [clojure.string :as str :only (split replace upper-case trim)]))

;; Characters to strip
(def unwanted #"(?i)\.|\,|\/|the")

;; Non-name values
(def non-name #"(?i)A\.K\.A|AKA|A\/K\/A|FKA|F\/K\/A|N\/K\/A|FICTITIOUS")

;; Constant character with which to replace unwanted
(def replacement-char "")

(defn get-non-name [fullname]
  (re-find non-name fullname))

;; Drop anything after a non-name value in our fullname
(defn drop-non-name [fullname]
  (let [temp-name fullname]
    (str/trim (first
      (str/split temp-name 
        (re-pattern 
          (get-non-name temp-name)))))))

;; Get location of any commas
(defn comma-index [fullname]
  (.indexOf "," fullname))

(defn split-name [fullname]
  (str/split fullname #"\s+"))

(defn clean-name [fullname]
  (let [valid-name (drop-non-name fullname)]
    (str/replace valid-name unwanted replacement-char)))

(defn slice-name [fullname]
  (split-name (clean-name fullname)))