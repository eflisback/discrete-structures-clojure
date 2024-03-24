; ; 1.3
(def A #{3 4 5 6 7 8})

(defn calculate-b [set-A]
  (let [pairs (for [a set-A
                    b set-A
                    :when (not= a + b 0)]
                [a b])]
    (set (map (fn [[a b]] (/ (- a b) (+ a b))) pairs))))

(def B (calculate-b A))
(println "The length of B is: " (count B))

(defn calculate-c [set-A]
  (let [pairs (for [a set-A
                    b set-A
                    :when (and (not= b 0) (<= a b))] [a b])]
    (set (map (fn [[a b]] (/ a b)) pairs))))

(def C (calculate-c A))
(println "The length of C is: " (count C))