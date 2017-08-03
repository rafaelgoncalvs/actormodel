package rafaelgoncalves.actormodel

import akka.actor._

case class Command(message: String)

case class Query(message: String)

class TaskManager extends Actor {

  override def receive = {
    case Command(message) =>
      val command = context.actorOf(Props[Task], "command")
      command ! Run(s"Command ran: $message")

    case Query(message) =>
      val query = context.actorOf(Props[Task], "query")
      query ! Run(s"Query ran: $message")
  }
}
