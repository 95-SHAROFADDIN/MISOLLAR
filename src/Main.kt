import java.util.Scanner
import kotlin.math.sqrt

fun main() {
//
//
//    val a = 5
//    val b = 6
//    val c = 9
//    var count = 0
//    if (a > 0) {
//        count++
//    }
//    if (b > 0) {
//        count++
//    }
//    if (c > 0) {
//        count++
//    }
//    if (count == 2) {
//        println(a + b + c)
//    } else {
//        println(a * b * c)
//    }
//
//
//    val a = 9
//    val b = 9
//
//    if (a != b) {
//        println(a + b)
//    } else {
//        println(0)
//    }
//
//
//    val oy = 1
//    val kunlar = when (oy) {
//        1, 3, 5, 7, 8, 10, 12 -> "31"
//        4, 6, 9, 11 -> "30"
//        2 -> "28 yoki 29"
//        else -> "Bunday oy yoq"
//    }
//    println(kunlar)
//    val day= 1
//
//    val result = when (day) {
//
//
//
//        1 -> "Monday"
//        2 -> "Tusday"
//        3 -> "wednstey"
//        4 -> "Thursday"
//        5 -> "Friday"
//        6 -> "Saturday"
//        7 -> "Sunday"
//        else -> "Invalid day."
//    }
//
//
//    println(result)
//    val month = 1
//    var result = when (month){
//        1 -> ""
//        2 ->
//            3 ->
//            4 ->
//            5 ->
//            6 ->
//            7 ->
//            8 ->
//            9 ->
//            10 ->
//            11 ->
//            12 ->
//        else ->
//    }
//    println(result)
//
//
//    val number = 15
//    val result = when (number){
//        0, 1, 2, 3, 4, 5, 6, 7, 8, 9, -> "1 xonali"
//
//        in 10..99 -> "2 xonali"
//        else -> "boshqa honali"
//    }
//    println(result)
//
//
//
//    val cars = arrayOf("Chevralet","BMW","MERS","Fort")
//    cars[1]="Tesla"
//    println(cars[0])
//    println(cars[2])
//    println(cars[1])
//
//
//    val week=arrayOf("    ","Monday","Tusday","Wednstey","Thursday","Friday","Saturday","Sunday")
//    println(week[5])
//    val oy = arrayOf(
//        "   ",
//        "January",
//        "februvary",
//        "March",
//        "April",
//        "May",
//        "Jiun",
//        "July",
//        "Avgust",
//        "September",
//        "Oktomber",
//        "November",
//        "Desember"
//    )
//    println(oy[7])
//    println()
//
//
//
//    val Bahor = arrayOf(2, 3, 4)
//    val yoz = arrayOf(5, 6, 7)
//    val kuz =arrayOf(8,9,10)
//    val Qish=arrayOf(11,12,1)
//    println(5)
//
//
//
//    for ( i in 1..100 step  2){
//        println(i)
//    }
//    for (i in 2..100 step  2){
//        println(i)
//    }
//
//
//
//    val a = 5
//    val b = 3
//    for (i in 1..b){
//        println(a)
//
//    }
//
//
//
//    val a = 5
//    val b = 8
//    var pul = 0
//    for (i in a +1 until b ){
//        pul+=i
//
//    }
//    println(pul)
//
//
//
//    val a=12
//    val  b= 24
//    for (i in a+1 until b){
//        if (i%4==0){
//            println(i)
//        }
//
//
//
//        for (i in 9 until 100) {
//            if (i / 10 == 8 || i % 10 == 8) {
//                println(i)
//            }
//
//        }
//        for (i in 100 until 1000) {
//            var on = i % 100
//            on = on / 10
//            if (on == 7) {
//                println(i)
//            }
//
//        }
//
//
//
//        for (i in 100 until 1000) {
//            val yuz = i / 100
//            val bir = i % 10
//            if (yuz == bir) {
//                println(i)
//            }
//        }
//
//
//
//        for (i in 10 until 100){
//            if (i/10+i%10==9||i/10+i%10==15){
//                println(i)
//            }
//        }
//        var count = 0
//        for (i in 100 until 1000) {
//            val yuz = i / 100
//            val on = i % 100 / 10
//            val bir = i % 10
//            var sum = yuz + on + bir
//            if (sum / 5 == 0 || sum / 3 == 0) {
//                count++
//
//            }
//
//        }
//        println(count)
//
//
//
//        for (i in 10 until 100) {
//            if (i / 10 + i % 10 > 12){
//                println(i)
//            }
//        }
//
//
//
//        for (i in 100 until 1000) {
//            if (i % 3 == 0 || i % 5 == 0) {
//                println(i)
//            }
//        }
//        for (i in 10 until 100) {
//            if (i / 10 + i % 10 == 12) {
//                println(i)
//            }
//        }
//        val a = 1200
//        var narxi = 1
//        for (i in 1 until 2 step 0.1.toInt()) {
//            val narxi = i *= a
//
//
//        var a = 123456789
//        var count = 0
//        while (a > 0) {
//            a /= 10
//            count++
//        }
//          println(count)
////
//
//
//
//
//        var a = 2
//        var b = 8
//        for (i in a untel b) {
//            for (j in 1 .. i) {
//                print(i)
//            }
//        }
//
//
//
//        val a = 1234
//        var count = 0
//        while (a > 0) {
//            count = count * 10 + a % 10
//        }
//        println(count)
//
//
//
//        val a = 5
//        for (i in 1 until a+1){
//            print(a)
//        }
//
//
//
//        for (i in 10..99){
//            if (i /10 +1%10 ==9 || i / 10 + i % 10 == 15){
//                println(i)
//            }
//        }
//
//
//
//        for (i in 100..999){
//            if (i /100 + i / 10 % 10 + i % 10 + i % 10 == 20){
//                println(i)
//            }
//        }
//
//
//
//
//        var count = 0
//
//        for (i in 100..999) {
//            // Agar son 3 ga ham, 5 ga ham qoldiqsiz bo'linsa
//            if (i % 3 == 0 && i % 5 == 0) {
//                count++
//            }
//        }
//
//        println(count) // Natija: 60
//
//
//
//        for (i in 10..99) {
//            if ((i / 10 + i % 10) > 12) {
//                println(i)
//            }
//        }
//
//
//
//        val price = 10000
//        for (i in 10..20){
//            println(price * i / 10.toDouble())
//        }
//
//        sqrt
//
//
//
//        val n = 10
//        for (i in 0..n){
//            println("$i = ${sqrt(i.toDouble())}")
//        }
//
//
//
//        val a = 2
//        val b = 6
//        var c = 1L
//        for (i in a + 1 until b ){
//            c*=i
//        }
//        println(c)
//
//
//
//        var i = 0
////    do {
////        println(i)
////        i++
////    } while (i < 5)
//
//        do {
//            println("salom")
//        } while (4 < 5)
//        val i1 = i++
//
//
//
//        val a = 123456
//        var count = 0
//        while (a > 0) {
//            a / 10
//            count = a % 10
//        }
//        print(count)
//
//
//
//        val a = -2
//        val b = +6
//        for (i in a .. b) {
//            for (j in 0 until i) {
//                print(i)
//            }
//        }
//
//
//        var a = 1234
//        var count = 0
//        while (a > 0) {
//            count = count * 10 + a % 10
//            a /= 10
//        }
//        println(count)
//
//
//        var i = 0
//        while (i < 11){
//            println(i)
//            i++
//        }
//
//        var number = 100078
//        var count = 0
//        while (number > 0) {
//          count++
//       number /= 10
//        }
//        print(count)
//
//
//    val a = 1
//    val b = +6
//    for (i in a .. b) {
//        for (j in 0 until i) {
//            print(i)
//        }
//    }
//
//    var a = 102
//    var count = 0
//    while (a > 0) {
//        count = count * 10 + a % 10
//        a /= 10
//    }


}

fun helloPrint() {
    println("Hello World")
    println("hello a Teacher")
}

fun sayHello(name: String) {
    println("Hello $name")

}

fun neeting(name: String, age: Int) {
    println("Your name is $name.Your age $age")
}

fun sum(a: Int, b: Int): Int {
    return a + b
}