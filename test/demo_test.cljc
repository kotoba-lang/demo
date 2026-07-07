(ns demo-test
  (:require [clojure.test :refer [deftest is testing]]
            [demo]))
(deftest namespace-loads
  (testing "the restored CLJC namespace loads"
    (is (some? (the-ns 'demo)))))
