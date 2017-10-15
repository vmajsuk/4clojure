(fn only-capitals [str]
    (clojure.string/join
        ""
        (filter (fn [x] (java.lang.Character/isUpperCase x)) str)))