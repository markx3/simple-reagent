(ns ^:figwheel-no-load reagent-example.dev
  (:require
    [reagent-example.core :as core]
    [devtools.core :as devtools]))


(enable-console-print!)

(devtools/install!)

(core/init!)
