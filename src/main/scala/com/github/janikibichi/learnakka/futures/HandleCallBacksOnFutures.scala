package com.github.janikibichi.learnakka.futures

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future
import scala.util.{Failure, Success}


object HandleCallBacksOnFutures extends App{
  val future = Future(1+2).mapTo[Int]

  //Callback
  future onComplete {
    case Success(result) =>
      println(s"result id $result")

    case Failure(fail) =>
      fail.printStackTrace()
  }

  //Print
  println("This is executed before callback")
}
