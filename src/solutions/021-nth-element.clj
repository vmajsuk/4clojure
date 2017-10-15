(defn answer
    ([seq n] (answer seq n 0))
    ([seq n passed]
      (if (= n passed)
        (first seq)
        (answer (rest seq) n (+ passed 1)))))

(= (answer '(4 5 6 7) 2) 6)

(= (answer [:a :b :c] 0) :a)

(= (answer [1 2 3 4] 1) 2)

(= (answer '([1 2] [3 4] [5 6]) 2) [5 6])