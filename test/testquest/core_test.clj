(ns testquest.core-test
  (:require [expectations :refer :all]
            [testquest.core :refer :all]))


(expect (do (println "1. Testing the first case of 2+3=5")
            5)
        (+ 2 3))

(expect (do (println "2. Testing the equality of 2")
            true)
        (= 2 2))

(expect (do (println "3. Testing the inequality of 3")
            false)
        (not= 3 3))

(expect-let [x (* 5 5 5)]
            (do (println "4. Another testing, and we're typing a lot of do println")
                x)
            (* 5 5 5))


(testing "5. This one is using the testing macro"
  5
  (+ 2 3))

(testing-let "6. Testing the testing-let macro"
             [x (* 3 3 3 3 3 3 3)]
             x 
             (* 3 3 3 3 3 3 3))
