(ns sicp-tasks.chapter01.1-03)

(defn square [x] (* x x))

(defn solution [x y z]
  (cond
    (and (> x z) (> y z) (+ (square x) (square y)))
    (and (> x y) (> z y) (+ (square x) (square z)))
    :else (+ (square y) (square z))))

