(ns reagent-material-ui.icons.bookmark-remove
  "Imports @material-ui/icons/BookmarkRemove as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def bookmark-remove (create-svg-icon (e "path" #js {"d" "M21 7h-6V5h6v2zm-2 3.9c-.32.07-.66.1-1 .1-2.76 0-5-2.24-5-5 0-1.13.37-2.16 1-3H7c-1.1 0-2 .9-2 2v16l7-3 7 3V10.9z"})
                                      "BookmarkRemove"))