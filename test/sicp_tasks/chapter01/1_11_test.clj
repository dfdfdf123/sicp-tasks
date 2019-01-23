(ns sicp-tasks.chapter01.1-11-test
  (:require [clojure.test :refer :all]
            [sicp-tasks.test-helper :refer :all]
            [sicp-tasks.chapter01.1-11 :refer :all]))

(deftest test-f-recur
  (assert-equal 1 (f-recur 1))
  (assert-equal 2 (f-recur 2))
  (assert-equal 3 (f-recur 3))
  (assert-equal 6 (f-recur 4)))

(deftest test-f-iter
  (assert-equal 2 (f-iter 2))
  (assert-equal 3 (f-iter 3))
  (assert-equal 1 (f-iter 1))
  (assert-equal 6 (f-iter 4)))
