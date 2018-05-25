# Futures
When work is sent to actors for processing, to be delivered later when the work is complete, we use a future(like a promise) to collect the results when they become available (or the error is any.)
Futures are used to process work on other threads concurrently.

<br><br>
- Branch out to explore simple use of a future
````
git checkout -b create_future master
````
- Create the file to handle the actor system: <b>com.github.janikibichi.learnakka.future.SimpleFuture.scala</b>
- Run the App to [create a simple future.](https://asciinema.org/a/VPrP6wkSHZjDlb81ZDDoTQdJH)