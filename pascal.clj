;;; Calculates an element of Pascal's Triangle for a given row and column
(defn pascal [row col]
  (if (or (= col 1) (= row col)) 
    1
    (+ (pascal (- row 1) col) (pascal (- row 1) (- col 1)))))
