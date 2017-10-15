(def answer #{:a :b :c :d})

(= answer (set '(:a :a :b :c :c :c :c :d :d)))

(= answer (clojure.set/union #{:a :b :c} #{:b :c :d}))