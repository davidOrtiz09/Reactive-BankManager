
import sbt._
import Keys._


object Build extends Build {

  lazy val root = Project(id = "reactiveBankManager",
    base = file(".")) aggregate(query, command) dependsOn(query, command)

  lazy val query = Project(id = "reactiveBankManager-query",
    base = file("ReactiveBankManager-Query"))


  lazy val command = Project(id = "reactiveBankManager-command",
    base = file("ReactiveBankManager-Command"))
}