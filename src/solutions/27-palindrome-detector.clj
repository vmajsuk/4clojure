(fn palindrome?
    ([] true)
    ([col]
        (if (empty? col)
            true
            (if (= (first col) (last col))
                (palindrome? (rest (butlast col)))
                false))))