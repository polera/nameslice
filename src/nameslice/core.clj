(ns nameslice.core
  (:require [clojure.string :as str :only (split replace upper-case trim)]
            [nameslice.constants :as const]))

;; Characters to strip
(def unwanted #"(?i)\.|\,|\/")


;; Get a non-name value to split on (if any)
(defn get-non-name [fullname]
  (let [non-name-val (re-find const/non-name fullname) ]
  (if-not (nil? non-name-val) non-name-val "w")))

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
    (str/replace valid-name unwanted const/replacement-char)))

(defn slice-name [fullname]
  (split-name 
   (clean-name fullname)))