# Testquest

A Clojure library for a very simple test to encourage beginners starting to embrace TDD.

## Usage

In your project.clj

[![Clojars Project](http://clojars.org/zenedu/testquest/latest-version.svg)](http://clojars.org/zenedu/testquest)

## Testing

Only two macros available in testquest.core namespace, testing and testing-let. You might want to use lein-autoexpect for automatic testing for expectations. 

```clojure

(ns mytest.core 
  (:require [testquest.core :refer :all]))

(testing "description"
         5
         (+ 2 3))
         
(testing-let "desxription"
             [x (+ 5 5)]
             x 
             (+ 5 5))
            
```

## License

Copyright © 2014 PT Zenius Education

Distributed under the EPL v1.0
