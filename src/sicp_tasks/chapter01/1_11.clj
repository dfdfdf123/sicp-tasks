(ns sicp-tasks.chapter01.1-11)

(defn f-recur [x]
  (if (< x 3) x
    (+ (f-recur (- x 1))
       (f-recur (- x 2))
       (f-recur (- x 3)))))

(defn f-iter [n]
  (loop [a 2 b 1 c 0 n n]
    (if (zero? n)
      c
      (recur (+ a b c)
             a
             b
             (dec n)))))
