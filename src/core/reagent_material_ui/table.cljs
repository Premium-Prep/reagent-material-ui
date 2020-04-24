(ns reagent-material-ui.table
  "Import material-table from material-table as Reagent component.
   Original documentation is at https://material-table-com/ ."
  (:require-macros [reagent-material-ui.macro :refer [forward-ref]])
  (:require [reagent.core :as r]
            [reagent-material-ui.util :refer
             [adapt-react-class
              js->clj']]
            [reagent-material-ui.icons.add-box :refer [add-box]]
            [reagent-material-ui.icons.arrow-downward :refer [arrow-downward]]
            [reagent-material-ui.icons.check :refer [check]]
            [reagent-material-ui.icons.chevron-left :refer [chevron-left]]
            [reagent-material-ui.icons.chevron-right :refer [chevron-right]]
            [reagent-material-ui.icons.clear :refer [clear]]
            [reagent-material-ui.icons.delete-outline :refer [delete-outline]]
            [reagent-material-ui.icons.edit :refer [edit]]
            [reagent-material-ui.icons.filter-list :refer [filter-list]]
            [reagent-material-ui.icons.first-page :refer [first-page]]
            [reagent-material-ui.icons.last-page :refer [last-page]]
            [reagent-material-ui.icons.remove :refer [remove]]
            [reagent-material-ui.icons.save-alt :refer [save-alt]]
            [reagent-material-ui.icons.search :refer [search]]
            [reagent-material-ui.icons.view-column :refer [view-column]]
            [material-table]))

(defn forward-icon [icon]
  (forward-ref [props ref]
    (r/as-element
      [icon (merge (js->clj' props) {:ref ref})])))

(def table-icons
  {:Add (forward-icon add-box)
   :Check (forward-icon check)
   :Clear (forward-icon clear)
   :Delete (forward-icon delete-outline)
   :DetailPanel (forward-icon chevron-right)
   :Edit (forward-icon edit)
   :Export (forward-icon save-alt)
   :Filter (forward-icon filter-list)
   :FirstPage (forward-icon first-page)
   :LastPage (forward-icon last-page)
   :NextPage (forward-icon chevron-right)
   :PreviousPage (forward-icon chevron-left)
   :ResetSearch (forward-icon clear)
   :Search (forward-icon search)
   :SortArrow (forward-icon arrow-downward)
   :ThirdStateCheck (forward-icon remove)
   :ViewColumn (forward-icon view-column)})

(def m-table-default (adapt-react-class (.-default js/MaterialTable) "mui-material-table"))

(defn m-table [props]
  (fn [props]
    [m-table-default
     (merge {:icons table-icons} props)]))

(def m-table-pure (adapt-react-class (.-MTable js/MaterialTable) "mui-material-table"))
(def m-table-action (adapt-react-class (.-MTableAction js/MaterialTable) "mui-material-table-action"))
(def m-table-actions (adapt-react-class (.-MTableActions js/MaterialTable) "mui-material-table-actions"))
(def m-table-body (adapt-react-class (.-MTableBody js/MaterialTable) "mui-material-table-body"))
(def m-table-body-row (adapt-react-class (.-MTableBodyRow js/MaterialTable) "mui-material-table-body-row"))
(def m-table-groupbar (adapt-react-class (.-MTableGroupbar js/MaterialTable) "mui-material-table-groupbar"))
(def m-table-group-row (adapt-react-class (.-MTableGroupRow js/MaterialTable) "mui-material-table-group-row"))
(def m-table-cell (adapt-react-class (.-MTableCell js/MaterialTable) "mui-material-table-cell"))
(def m-table-edit-row (adapt-react-class (.-MTableEditRow js/MaterialTable) "mui-material-table-edit-row"))
(def m-table-edit-field (adapt-react-class (.-MTableEditField js/MaterialTable) "mui-material-table-edit-field"))
(def m-table-filter-row (adapt-react-class (.-MTableFilterRow js/MaterialTable) "mui-material-table-filter-row"))
(def m-table-header (adapt-react-class (.-MTableHeader js/MaterialTable) "mui-material-table-header"))
(def m-table-pagination (adapt-react-class (.-MTablePagination js/MaterialTable) "mui-material-table-pagination"))
(def m-table-stepped-pagination (adapt-react-class (.-MTableSteppedPagination js/MaterialTable) "mui-material-table-stepped-pagination"))
(def m-table-toolbar (adapt-react-class (.-MTableToolbar js/MaterialTable) "mui-material-table-toolbar"))
