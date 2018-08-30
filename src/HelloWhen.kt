fun main(args: Array<String>) {
    var number = 18

    when(number){
        17 -> println("Too low")
        18 -> {
            println("Yeah!")
        }
        19 -> println("Too High")
        else -> println("Don't Know")
    }
}