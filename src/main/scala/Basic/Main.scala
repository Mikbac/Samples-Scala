package Basic

/**
 * Created by MikBac on 27.08.2020
 */

import java.text.DateFormat._
import java.time.LocalDate
import java.util.{Date, Locale}

object Main {

    def createDate(): Unit = {
        val now = new Date()
        val df = getDateInstance(LONG, Locale.FRANCE)

        println(now) // Thu Aug 27 19:41:04 CEST 2020
        println(df) // java.text.SimpleDateFormat@f8749a64

        println(df format now) // 27 août 2020
        println(df.format(now)) // 27 août 2020
    }

    def createObject(): Unit = {
        // val <- creates an immutable variable (like final in Java)
        // var <- creates a mutable variable
        val employee = new Employee("John", "Red", 33, 2000, LocalDate.of(2000, 11, 11))
        println(employee)
    }

    def createVariables(): Unit = {
        val b: Byte = 1
        val x: Int = 1
        val l: Long = 1
        val s: Short = 1
        val d: Double = 2.0
        val f: Float = (3.0).toFloat

        val a: Boolean = true

        val c: Char = 'a'
        val e: String = "Sample text"

        var bigInt = BigInt(1234567890)
        var bigDecimal = BigDecimal(123456.789)
    }

    def concatString(): Unit = {
        val a = "AAA"
        val b = 'B'
        val c = "CCC"

        val s1 = a + " " + b + " " + c
        val s2 = s"$a $b $c"

        println(s1)
        println(s2)
    }

    def getInput(): Unit = {
        print("Enter your first name: ")
        val firstName = readLine()

        print("Enter your last name: ")
        val lastName = readLine()

        println(s"Your name is $firstName $lastName")
    }

    def getOutput(): Unit = {
        println("Hello, world")
        print("Hello without newline")
        System.err.println("Hello, world")

    }

    def main(args: Array[String]): Unit = {

        //getOutput()
        //getInput()

        createDate()
        createObject()
        concatString()
    }
}
