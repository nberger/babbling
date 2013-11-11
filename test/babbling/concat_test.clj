(ns babbling.concat-test
  (:require [clojure.test :refer :all]
            [babbling.concat :refer :all]))

(deftest concat-test
  (testing "concat with no args"
    (is (= '() (concat))))
  
  (testing "concat with an empty list"
    (is (= '() (concat '()))))

  (testing "concat with a 1 element list"
    (is (= '(1) (concat '(1)))))

  (testing "concat with 2 lists"
    (is (= '(1 2) (concat '(1) '(2)))))

  (testing "concat with 2 empty lists"
    (is (= '() (concat '() '()))))
)
