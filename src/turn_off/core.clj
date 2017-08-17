(ns turn-off.core
  (:use [toledohue.hue])
  (:gen-class))

(defn -main
  "I don't do a whole lot."
  []
  (turn-off 1 (get-user)))
