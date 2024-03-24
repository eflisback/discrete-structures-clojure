; ; 1.4
(def A #{1 2 3 4 5 6})
(defn calculate-b [set-A]
  (let [pairs (for [a set-A
                    b set-A
                    ][a b])]
    (set (map (fn [[a b]] (/ a b)) pairs))))

(def B (calculate-b A))
(println "The length of B is: " (count B))

(defn calculate-c [set-A]
  (let [pairs (for [a set-A
                    b set-A :when (= (rem a b) 0)]
                [a b])]
    (set (map (fn [[a b]] (/ a b)) pairs))))

(def C (calculate-c A))
(println "The length of C is: " (count C))


(defn calculate-d [set-A]
  (let [pairs (for [a set-A
                    b set-A :when (= (rem b a) 0)]
                [a b])]
    (set (map (fn [[a b]] (/ a b)) pairs))))

(def D (calculate-d A))
(println "The length of D is: " (count D))