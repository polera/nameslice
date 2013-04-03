(ns nameslice.core)

(use '[clojure.string  :only (split replace)])

(def unwanted #"(?i)\.|\,|\/|the")

(def replacement-char "")

(defn split-name [fullname]
  (split fullname #"\s+"))

(defn clean-name [fullname]
  (replace fullname unwanted replacement-char))

(defn slice-name [fullname]
  (split-name (clean-name fullname)))