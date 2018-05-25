package com.github.janikibichi.learnakka.futures

import akka.actor.{Props, ActorSystem,Actor}
import scala.concurrent.{Await,Future}
import scala.concurrent.duration._

object FuturesInsideActors extends App {
  val actorSystem = ActorSystem("FutureInside")

  //Create and define the Actor in ActorSystem
  val fActor = actorSystem.actorOf(Props[FutureInsideActor])

  //Send Message to Actor
  fActor ! (10,20)
}

//Create and Actor that uses a future inside
class FutureInsideActor extends Actor{
  import context.dispatcher

  def receive ={
    case(a: Int, b: Int) =>
      val f = Future(a+b)
      (Await.result(f,10 seconds))
      println(s"Value generated $f")
  }
}