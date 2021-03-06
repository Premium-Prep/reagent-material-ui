(ns reagent-material-ui.icons.system-security-update-good-sharp
  "Imports @material-ui/icons/SystemSecurityUpdateGoodSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def system-security-update-good-sharp (create-svg-icon (e "path" #js {"d" "M5 1v22h14V1H5zm12 17H7V6h10v12zm-1-7.95l-1.41-1.41-3.54 3.54-1.41-1.41-1.41 1.41L11.05 15 16 10.05z"})
                                                        "SystemSecurityUpdateGoodSharp"))