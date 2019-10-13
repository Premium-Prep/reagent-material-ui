(ns reagent-material-ui.icons.text-fields
  "Imports @material-ui/icons/TextFields as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def text-fields (create-svg-icon (e (.-Fragment js/React) nil (e "defs" nil (e "path" #js {"d" "M24 24H0V0h24v24z", "id" "a"})) (e "path" #js {"d" "M2.5 4v3h5v12h3V7h5V4h-13zm19 5h-9v3h3v7h3v-7h3V9z"}))
                                  "TextFields"))