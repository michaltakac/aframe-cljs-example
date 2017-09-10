(ns ^:figwheel-no-load aframecljs.dev
  (:require
    [aframecljs.core :as core]
    [devtools.core :as devtools]))


(enable-console-print!)

(devtools/install!)

(core/init!)
