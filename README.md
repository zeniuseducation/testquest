# Testquest

A Clojure micro test-framework based on expectations, only provide a simple tweak to expectations so the running tests show some test descriptions. Written to encourage beginners to embrace TDD.

## Usage

In your project.clj

[![Clojars Project](http://clojars.org/zenedu/testquest/latest-version.svg)](http://clojars.org/zenedu/testquest)

## Testing

Only two macros available in testquest.core namespace, testing and testing-let. You might want to use [lein-autoexpect] (https://github.com/jakemcc/lein-autoexpect) for automatic testing using expectations. 



```clojure

(ns mytest.core 
  (:require [testquest.core :refer :all]
            [expectations :refer :all]))

(testing "description"
         5 ; expected
         (+ 2 3)) ; testing form
         
(testing-let "desxription"
             [x (+ 5 5)]  ; binding (let)
             x  ; expected
             (+ 5 5))  ; testing form
            
```

## License

Copyright © 2014 PT Zenius Education

Distributed under the EPL v1.0
