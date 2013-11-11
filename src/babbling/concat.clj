(ns babbling.concat)

(defn concat
 ([] '())
 ([x] x)
 ([x y]
  (cons
    (first x)
    (lazy-seq
      (if (empty? (rest x))
        (concat y)
        (concat (rest x) y)))))
)
