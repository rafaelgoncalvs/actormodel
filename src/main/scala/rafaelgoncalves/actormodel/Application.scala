package rafaelgoncalves.actormodel

import akka.actor._

object Application extends App {
  val actorSystem = ActorSystem("ActorModelApplication")
  //val processManagersRef: ActorRef = actorSystem.actorOf(Props[ProcessManagers], "processManagers")
}
