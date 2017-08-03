package rafaelgoncalves.actormodel

import akka.actor._

object Application extends App {
  val actorSystem = ActorSystem("ActorModelApplication")

  val taskManagerRef: ActorRef = actorSystem.actorOf(Props[TaskManager], "taskManager")

  taskManagerRef ! Command("Some command")
  taskManagerRef ! Query("Some query")
}