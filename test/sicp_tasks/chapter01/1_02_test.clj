(ns sicp-tasks.chapter01.1-02-test
  (:require [clojure.test :refer :all]
            [sicp-tasks.test-helper :refer :all]
            [sicp-tasks.chapter01.1-02 :refer :all]))

(deftest test-asserts
  (assert-equal -37/150 solution))
