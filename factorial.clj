(defn fact [x]
  (if (= x 1)
    x
    (* x (fact (- x 1)))
  )
)
