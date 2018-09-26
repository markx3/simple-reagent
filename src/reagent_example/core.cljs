(ns reagent-example.core
    (:require
      [reagent.core :as r]))

;; -------------------------
;; Views

;; State
(defonce app-state
  (r/atom
   {:message "App State"
    :items (range 3)}))

;; Components
(defn header [message]
  [:div
   [:h2
    {:style
     {:color "red"}}
    "Hello from "
    message]])

(defn home-page []
  [:div
   [header (:message @app-state)]
   (for [item (:items @app-state)]
     ^{:key item} [:li "Item " item])])

;; Render
(defn mount-root []
  (r/render [home-page "Reagent"] (.getElementById js/document "app")))

(defn init! []
  (mount-root))
