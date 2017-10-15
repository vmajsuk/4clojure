(defn answer
    ([seq] (answer seq 0))
    ([seq passed]
      (if (empty? seq)
        passed
        (answer (rest seq) (+ passed 1)))))

(= (answer '(1 2 3 3 1)) 5)

(= (answer "Hello World") 11)

(= (answer [[1 2] [3 4] [5 6]]) 3)

(= (answer '(13)) 1)

(= (answer '(:a :b :c)) 3)