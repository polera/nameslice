(ns nameslice.core-test
  (:use clojure.test
        nameslice.core))

(deftest firstname-test
  (testing "Firstname is James"
    (is (= "James" (first (split-name "James Polera"))))))
