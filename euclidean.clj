;;; The Euclidean Algorithm as implemented for MATH 540
(defn gcd [a b]
  (if (= b 0)
    a
    (gcd b (mod a b))))
