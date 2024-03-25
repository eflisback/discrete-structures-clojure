; ; 1.3
(def A #{3 4 5 6 7 8})

(def B
  (let [pairs (for [a A
                    b A :when (not= a + b 0)]
                [a b])]
    (set (map (fn [[a b]] (/ (- a b) (+ a b))) pairs))))
    
(println "The length of B is:" (count B))

(def C
  (let [pairs (for [a A
                    b A :when (and (not= b 0) (<= a b))] [a b])]
    (set (map (fn [[a b]] (/ a b)) pairs))))

(println "The length of C is:" (count C))