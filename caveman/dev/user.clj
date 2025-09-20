;; While doing interactive development, it's important to have a 
;; place to put code which is useful for that purpose, but maybe not 
;; appropriate for software you ultimately ship (production)

;; Most REPLs will automatically load in any `user` namespace. 
;; This makes it the easiest place to put "development only" code.
(ns user)
