(ns reagent-material-ui.icons.auto-fix-high-sharp
  "Imports @material-ui/icons/AutoFixHighSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def auto-fix-high-sharp (create-svg-icon (e "path" #js {"d" "M20 7l.94-2.06L23 4l-2.06-.94L20 1l-.94 2.06L17 4l2.06.94zM8.5 7l.94-2.06L11.5 4l-2.06-.94L8.5 1l-.94 2.06L5.5 4l2.06.94zM20 12.5l-.94 2.06-2.06.94 2.06.94.94 2.06.94-2.06L23 15.5l-2.06-.94zm-1.59-2.67l-4.24-4.24L1.59 18.17l4.24 4.24L18.41 9.83zm-4.2 1.38L12.8 9.8l1.38-1.38 1.41 1.41-1.38 1.38z"})
                                          "AutoFixHighSharp"))