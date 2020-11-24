package cl.ravenhill.memegram

object MemegramServer {
  val users = mutableMapOf<String, User>()
  fun addUser(user: User) {
    users[user.name] = user
  }
}

fun main() {
  println(MemegramServer.users)
  MemegramServer.addUser(User("r8vnhill"))
  println(MemegramServer.users)
}