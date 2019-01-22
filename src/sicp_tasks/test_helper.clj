(ns sicp.test-helper
  (:require [clojure.test :refer [is]]))

(defmacro assert-equal 
  [expected actual] 
  `(assert-true (= ~expected ~actual)))

(defmacro assert-true
  [expected actual] 
  `(assert-true (= ~expected ~actual)))

(defmacro assert-false 
  [expected actual]
  `(assert-true (not ~expr)))
