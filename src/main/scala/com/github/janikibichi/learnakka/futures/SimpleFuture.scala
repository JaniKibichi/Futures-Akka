package com.github.janikibichi.learnakka.futures

import scala.concurrent.duration._
import scala.concurrent.{Await,Future}
import scala.concurrent.ExecutionContext.Implicits.global

object SimpleFuture extends App {
  val future = Future(1+2).mapTo[Int]

  val sum = Await.result(future, 10 seconds)

  println(s"Future Result $sum")
}