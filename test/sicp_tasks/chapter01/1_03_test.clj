(ns sicp-tasks.chapter01.1-03-test
  (:require [clojure.test :refer :all]
            [sicp-tasks.test-helper :refer :all]
            [sicp-tasks.chapter01.1-03 :refer :all]))

(deftest test-asserts
  (assert-equal 13 (solution 1 2 3))
  (assert-equal 61 (solution 4 6 5)))
