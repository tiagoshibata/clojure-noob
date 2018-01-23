(ns clojure-noob.core
  (:gen-class))

(defn favorites
  [name & favorites]
  (str name "'s favorites are: " (clojure.string/join ", " favorites)))

(defn recursive-destructuring
  [{:keys [start stop]}]
  (println start)
  (if (< start stop) (recursive-destructuring {:start (+ start 1) :stop stop})))

(defn -main
  "main function."
  [& args]
  (recursive-destructuring {:start 1 :stop 10})
  (println (favorites "Bob" "ice cream" "toys" "coding")))
