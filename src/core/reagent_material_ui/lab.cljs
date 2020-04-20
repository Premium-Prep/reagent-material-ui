(ns reagent-material-ui.lab
  "Imports all components from @material-ui/lab as Reagent components.
   Original documentation is at https://material-ui.com/api/ ."
  (:require [reagent-material-ui.util :refer
             [adapt-react-class
              wrap-js-function]]
            [material-ui-lab]))

(def alert (adapt-react-class (.-Alert js/MaterialUILab) "mui-alert"))
(def alert-title (adapt-react-class (.-Alert js/MaterialUILab) "mui-alert-title"))
(def autocomplete (adapt-react-class (.-Autocomplete js/MaterialUILab) "mui-autocomplete"))
(def avatar-group (adapt-react-class (.-AvatarGroup js/MaterialUILab) "mui-avatar-group"))
(def pagination (adapt-react-class (.-Pagination js/MaterialUILab) "mui-pagination"))
(def pagination-item (adapt-react-class (.-PaginationItem js/MaterialUILab) "mui-pagination-item"))
(def rating (adapt-react-class (.-Rating js/MaterialUILab) "mui-rating"))
(def skeleton (adapt-react-class (.-Skeleton js/MaterialUILab) "mui-skeleton"))
(def speed-dial (adapt-react-class (.-SpeedDial js/MaterialUILab) "mui-speed-dial"))
(def speed-dial-action (adapt-react-class (.-SpeedDialAction js/MaterialUILab) "mui-speed-dial-action"))
(def speed-dial-icon (adapt-react-class (.-SpeedDialIcon js/MaterialUILab) "mui-speed-dial-icon"))
(def toggle-button (adapt-react-class (.-ToggleButton js/MaterialUILab) "mui-toggle-button"))
(def toggle-button-group (adapt-react-class (.-ToggleButtonGroup js/MaterialUILab) "mui-toggle-button-group"))
(def tree-item (adapt-react-class (.-TreeItem js/MaterialUILab) "mui-tree-item"))
(def tree-view (adapt-react-class (.-TreeView js/MaterialUILab) "mui-tree-view"))
(def use-autocomplete (wrap-js-function (.-useAutocomplete js/MaterialUI)))
