//fun main(args: Array<String>) : String {

// Global Variable
var domain = "www.google.com"
val pi = 3.14

////
fun main(args: Array<String>) {

    var name: String = "Ekawat" // Local Variable

    println(sayHello(name))
    println(sayGoodBye("Ake"))

}

//return
fun sayHello(name: String): String {
    var hello = "Hello $name"
    return hello
}

//void function
fun sayGoodBye(name: String) {
    println("$domain Bye Bye  ! $name")
}
//fun sayGoodBye(name :String) : Unit{
//    println("Bye Bye  ! $name")
//}


