(ns nameslice.core-test
  (:use clojure.test
        nameslice.core))

(deftest firstname-test
  (testing "Firstname is James"
    (is (= "James" (first (slice-name "James Polera"))))))

(deftest firstname-test-aka
  (testing "Firstname is James"
    (is (= "James" (first (slice-name "James Polera a/k/a Batman"))))))

