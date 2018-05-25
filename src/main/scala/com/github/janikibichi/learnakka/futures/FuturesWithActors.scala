package com.github.janikibichi.learnakka.futures

import akka.actor.{ActorSystem,Actor,Props}
import akka.pattern.ask
import akka.util.Timeout
import scala.concurrent.Await
import scala.concurrent.duration._

object FuturesWithActors extends App {
  implicit val timeout = Timeout(10 seconds)

  val actorSystem = ActorSystem("FutureActors")

  //Create and Define the Actor in the ActorSystem
  val computationActor = actorSystem.actorOf(Props[ComputationActor])

  //Ask the Computation Actor to deliver calculation result
  val future = (computationActor ? (2,3)).mapTo[Int]
  val sum = Await.result(future, 10 seconds)

  //Print the result
  println(s"Future Result $sum")
}

//Create an Actor that calculates the sum of two integers and delivers it back to sender
class ComputationActor extends Actor{
  def receive = {
    case (a: Int, b: Int) => sender ! (a+b)
  }
}