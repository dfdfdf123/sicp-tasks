(ns sicp-tasks.chapter01.1-12)

(defn pascal-triangle [row col]
  (cond (or (< col 1) (< row col)) 0
        (or (= col 1) (= row col)) 1
        :else (+ (pascal-triangle (- row 1) (- col 1))
                 (pascal-triangle (- row 1) col))))
