(ns microblog-api.core)
;(use 'microblog-api.core :reload-all)

(def last-id (atom 0))
(def storage (atom {}))

(defn gen-post-id []
  (swap! last-id inc))

(defn save-post [post]
    (swap! storage (fn [storage]
                     (update-in storage [:id-index] assoc (:id post) post)
                     ))
  post
)
    

(defn create-post [user text]
  (let [post {:id (gen-post-id)  :current-time (System/currentTimeMillis) :user user :text text}]
    (save-post post))
)

(defn get-post [post-id]
)

(defn timeline [offset n]
)
