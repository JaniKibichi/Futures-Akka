# Futures
When work is sent to actors for processing, to be delivered later when the work is complete, we use a future(like a promise) to collect the results when they become available (or the error is any.)
Futures are used to process work on other threads concurrently.
<br><br>
- Branch out to explore simple use of a future
````
git checkout -b create_future master
````
- Create the file to handle the actor system: <b>com.github.janikibichi.learnakka.futures.SimpleFuture.scala</b>
- Run the App to [create a simple future.](https://asciinema.org/a/FiIuXpGjBlxk6qcEeMsriFct1)
<br><br>
- Branch out to explore use futures with actors
````
git checkout -b futures_with_actors create_future
````
- Create the file to handle the actor system: <b>com.github.janikibichi.learnakka.futures.FuturesWithActors.scala</b>
- Run the App to [futures with actors.](https://asciinema.org/a/qE79GcrEny7fM0vmsM4e7afUN)
<br><br>
- Branch out to explore use futures inside actors
````
git checkout -b futures_inside_actors futures_with_actors 
````
- Create the file to handle the actor system: <b>com.github.janikibichi.learnakka.futures.FuturesInsideActors.scala</b>
- Run the App to [futures inside actors.](https://asciinema.org/a/7Q0pJZIO7kjtmo82j0xlNGXgL)
<br><br>
- Branch out to explore for-comprehensions for futures
````
git checkout -b for_comprehensions_for_futures futures_inside_actors
````
- Create the file to handle the actor system: <b>com.github.janikibichi.learnakka.futures.ForComprehensionsForFutures.scala</b>
- Run the App to [see ForComprehensionsForFutures.](https://asciinema.org/a/7Q0pJZIO7kjtmo82j0xlNGXgL)