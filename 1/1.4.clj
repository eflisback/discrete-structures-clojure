; ; 1.4
(def A #{1 2 3 4 5 6})

(def B
  (let [pairs (for [a A
                    b A]
                    [a b])]
    (set (map (fn [[a b]] (/ a b)) pairs))))

(println "The length of B is:" (count B))

(def C
  (let [pairs (for [a A
                    b A :when (= (rem a b) 0)]
                [a b])]
    (set (map (fn [[a b]] (/ a b)) pairs))))

(println "The length of C is:" (count C))


(def D
  (let [pairs (for [a A
                    b A :when (= (rem b a) 0)]
                [a b])]
    (set (map (fn [[a b]] (/ a b)) pairs))))

(println "The length of D is:" (count D))