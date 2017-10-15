(fn remove-cons-duplicates [col]
    (reverse (reduce
        #(if (= (first %1) %2) %1 (conj %1 %2))
        '()
        col)))