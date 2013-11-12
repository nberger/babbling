(ns babbling.concat)

(defn concat
 ([] '())
 ([x] x)
 ([x y]
  (lazy-seq
    (if-let [s (seq x)]
      (cons (first s) (concat (rest s) y))
      y)))
  ([x y & others]
   (apply concat (concat x y) others))
)
