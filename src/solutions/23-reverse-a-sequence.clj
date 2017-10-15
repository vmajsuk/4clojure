(fn [col]
    (reduce
        #(if (list? %1) (conj %1 %2) (into [%2] %1))
        (if (vector? col) [] '())
        col))