(defn answer [seq]
    (if (empty? (rest seq))
      (first seq)
      (tmp (rest seq))))

(= (answer [1 2 3 4 5]) 5)

(= (answer '(5 4 3)) 3)

(= (answer ["b" "c" "d"]) "d")