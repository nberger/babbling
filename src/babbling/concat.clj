(ns babbling.concat)

(defn concat
 ([] '())
 ([x] x)
 ([x y]
  (lazy-seq
    (if-let [s (seq x)]
      (cons (first s) (concat (rest s) y))
      y)))
  ([x y & zs]
     (let [cat (fn cat [xys zs]
                 (lazy-seq
                   (if-let [xys (seq xys)]
                       (cons (first xys) (cat (rest xys) zs))
                       (when zs
                         (cat (first zs) (next zs))))))]
       (cat (concat x y) zs))))
