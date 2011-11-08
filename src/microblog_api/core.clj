(ns microblog-api.core)

(def last-id (atom 0))

(defn gen-post-id []
  (swap! last-id inc))

(defn save-post [post]
  post
)

(defn create-post [user text]
  (let [post {:post-id (gen-post-id)  :current-time (System/currentTimeMillis) :user user :text text}]
    (save-post post))
)

(defn get-post [post-id]
)

(defn timeline [offset n]
)
