(ns reagent-material-ui.icons.takeout-dining-outlined
  "Imports @material-ui/icons/TakeoutDiningOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def takeout-dining-outlined (create-svg-icon (e "path" #js {"d" "M7.79 18l-.51-7h9.46l-.51 7H7.79zM9.83 5h4.33l2.8 2.73L16.87 9H7.12l-.09-1.27L9.83 5zM22 7.46l-1.41-1.41L19 7.63l.03-.56L14.98 3H9.02L4.97 7.07l.03.5-1.59-1.56L2 7.44l3.23 3.11.7 9.45h12.14l.7-9.44L22 7.46z"})
                                              "TakeoutDiningOutlined"))