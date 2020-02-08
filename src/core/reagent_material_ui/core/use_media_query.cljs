(ns reagent-material-ui.core.use-media-query
  "Imports @material-ui/core/useMediaQuery as a React hook.
   Note: React hooks can't be used in regular Reagent components: http://reagent-project.github.io/docs/master/ReactFeatures.html#hooks
   Original documentation is at https://material-ui.com/api/use-media-query/ ."
  (:require [reagent-material-ui.util :refer [js->clj']]
            [material-ui]))

(def use-media-query (js->clj' (.-useMediaQuery js/MaterialUI)))
