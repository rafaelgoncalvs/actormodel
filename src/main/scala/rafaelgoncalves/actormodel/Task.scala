package rafaelgoncalves.actormodel

import akka.actor.{Actor, ActorLogging}

case class Run(message: String)

class Task extends Actor with ActorLogging {

  override def receive = {
    case Run(message) =>
      log.info(s"Message received (from ${sender()}): $message")
  }
}
