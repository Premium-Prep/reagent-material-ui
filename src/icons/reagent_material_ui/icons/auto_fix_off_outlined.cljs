(ns reagent-material-ui.icons.auto-fix-off-outlined
  "Imports @material-ui/icons/AutoFixOffOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def auto-fix-off-outlined (create-svg-icon (e "path" #js {"d" "M20 7l.94-2.06L23 4l-2.06-.94L20 1l-.94 2.06L17 4l2.06.94zm-5.83 1.42l1.41 1.41-1.46 1.46 1.41 1.41 2.17-2.17c.39-.39.39-1.02 0-1.41l-2.83-2.83c-.19-.19-.44-.29-.7-.29-.26 0-.51.1-.71.29l-2.17 2.17 1.41 1.41 1.47-1.45zM1.39 4.22l7.07 7.07-6.17 6.17c-.39.39-.39 1.02 0 1.41l2.83 2.83c.2.2.45.3.71.3s.51-.1.71-.29l6.17-6.17 7.07 7.07 1.41-1.41L2.81 2.81 1.39 4.22zm9.9 9.9l-5.46 5.46-1.41-1.41 5.46-5.46 1.41 1.41z"})
                                            "AutoFixOffOutlined"))