(ns reagent-material-ui.icons.shield-rounded
  "Imports @material-ui/icons/ShieldRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def shield-rounded (create-svg-icon (e "path" #js {"d" "M11.3 2.26l-6 2.25C4.52 4.81 4 5.55 4 6.39v4.7c0 4.83 3.13 9.37 7.43 10.75.37.12.77.12 1.14 0 4.3-1.38 7.43-5.91 7.43-10.75v-4.7c0-.83-.52-1.58-1.3-1.87l-6-2.25c-.45-.18-.95-.18-1.4-.01z"})
                                     "ShieldRounded"))