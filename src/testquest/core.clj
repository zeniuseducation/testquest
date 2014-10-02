(ns testquest.core
  (:require [expectations :refer :all]))

(defmacro testing
  [description expected testform]
  (list 'expect `(do (println ~description)
                     ~expected)
        testform))

(defmacro testing-let
  [description letbinding expected testform]
  (list 'expect-let
        letbinding
        `(do (println ~description)
             ~expected)
        testform))
