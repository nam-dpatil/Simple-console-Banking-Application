fun main() {
    println("Hello World!")
    val account=Account()
    var user:User=User(1,"namzy","12345890", account.toString())
    println(user.toString())

}