(ns reagent-material-ui.icons.south-two-tone
  "Imports @material-ui/icons/SouthTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def south-two-tone (create-svg-icon (e "path" #js {"d" "M19 15l-1.41-1.41L13 18.17V2h-2v16.17l-4.59-4.59L5 15l7 7 7-7z"})
                                     "SouthTwoTone"))