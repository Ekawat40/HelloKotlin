fun main(args: Array<String>) {

    //วิธีการทำให้เป็นnull ใช้ Question mark (?)
//    var firstName: String? = "Ake"
////    firstName = null
//    var lastName: String? = null
//    การเรียกใช้งานตัวแปร nullable ด้วย ? และ !!
//    println(firstName?.length)
//    println(lastName!!.length) //การใช้เครื่องหมาย!!เเป็นการการันตีว่าตัวแปรที่ใช้จะไม่เป็นnullแน่นอน ถึงมีnullก็จะทำงานต่อ และถ้ามีคำสั่งไม่รองรับก็จะแสดงError
//    var nickName = "eie" ;
//    println(nickName?.length)
//    println(firstName!!.length)
//    println(lastName!!.length)
//

    //-------------------
    val listWithNull: List<String?> = listOf("First", "Second", null)
    val listWithNotNull: List<String> = listWithNull.filterNotNull()
//    for (item in listWithNull){
//        item?.let { println(item.length)}
//    }

    for (item in listWithNotNull) {
        println(item.length)
    }


    var something: Any = "Hello"
    var number: Int? = 0

    number = something as? Int
    println(number)

}