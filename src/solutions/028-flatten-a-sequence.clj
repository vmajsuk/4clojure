(defn enflat [col]
    (reverse
        (reduce
            (fn mapper [acc val]
                (if (coll? val)
                    (into acc (reverse (reduce mapper '() val)))
                    (conj acc val)))
            '()
            col)))