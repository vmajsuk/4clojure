(fn fib
    ([rem-count] (fib (- rem-count 2) [1 1]))
    ([rem-count generated-numbers]
        (if (= rem-count 0)
            generated-numbers
            (fib
                (- rem-count 1)
                (conj
                    generated-numbers
                    (reduce + (take-last 2 generated-numbers)))))))