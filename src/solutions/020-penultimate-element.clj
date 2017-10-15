(defn answer [seq]
    (if (= 2 (count seq))
      (first seq)
      (answer (rest seq))))

(= (answer (list 1 2 3 4 5)) 4)

(= (answer ["a" "b" "c"]) "b")

(= (answer [[1 2] [3 4]]) [1 2])