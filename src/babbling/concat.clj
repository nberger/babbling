(ns babbling.concat)

(defn concat
 ([] '())
 ([x] x)
 ([x y]
  (lazy-seq
    (let [s (seq x)]
      (if s
        (cons (first s) (concat (rest s) y))
        y))))
  ([x y & others]
   (apply concat (concat x y) others))
)
