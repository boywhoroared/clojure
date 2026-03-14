(ns example.jobs
  (:require [clojure.tools.logging :as log]
            [proletarian.worker :as-alias worker]))

(defn log-level [x]
  (case x
    ::worker/queue-worker-shutdown-error :error
    ::worker/handle-job-exception-with-interrupt :error
    ::worker/handle-job-exception :error
    ::worker/job-worker-error :error
    ::worker/polling-for-jobs :debug
    :proletarian.retry/not-retryin :error
    :info))

(defn logger [x data]
  (log/logp (log-level x) x data))

(defn- handlers [] {})

(defn process-job
  [system job-type payload]
  (if-let [handler (get (handlers) job-type)] ; Why use if-let?
    (handler system job-type payload)
    (throw (ex-info "Unhandler Job Type" {:job-type job-type}))))
