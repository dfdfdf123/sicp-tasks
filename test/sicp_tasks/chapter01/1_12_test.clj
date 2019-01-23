(ns sicp-tasks.chapter01.1-12-test
  (:require [clojure.test :refer :all]
            [sicp-tasks.test-helper :refer :all]
            [sicp-tasks.chapter01.1-12 :refer :all]))

(deftest test-pascal-triangle
  (assert-equal 6 (pascal-triangle 5 3))
  (assert-equal 0 (pascal-triangle -1 -1)))