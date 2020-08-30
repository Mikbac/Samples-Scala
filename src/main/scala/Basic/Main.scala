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
    //readLine is deprecated
    print("Enter your first name: ")
    val firstName = scala.io.StdIn

    print("Enter your last name: ")
    val lastName = scala.io.StdIn

    println(s"Your name is $firstName $lastName")
  }

  def getOutput(): Unit = {
    println("Hello, world")
    print("Hello without newline")
    System.err.println("Hello, world")

  }

  def getConditions(): Unit = {
    val a = if (true) "a" else "b"
    // val b = (true) ? "a": "b"
  }

  def getLoops(): Unit = {
    val nums1 = Seq(1, 2, 3, 4, 5)
    for (n <- nums1) println(n)

    val word1 = List(
      "aaa",
      "bbb",
      "ccc",
      "ddd"
    )
    for (w <- word1) println(w)
    word1.foreach(println)

    val sampleMap = Map(
      "aaa" -> 1.0,
      "bbb" -> 2.0,
      "ccc" -> 3.0)
    for ((word, numb) <- sampleMap) println(s"word: $word, numb: $numb")
    sampleMap.foreach {
      case (word, numb) => println(s"key: $word, value: $numb")
    }

  }

  def getExpression(): Unit = {
    val nums = Seq(1, 2, 3, 4, 5)
    val doubledNums = for (n <- nums) yield n * 2
    println(doubledNums)

    val words = List("aaa", "bbb", "ccc")
    val ucWords = for (word <- words) yield word.capitalize
    println(ucWords)

    val newWords = for (word <- words) yield {
      word.drop(1)
      word.addString(new StringBuilder("New_"))
    }
    println(newWords)
  }

  def getMatch1(): String = {
    val i = 10
    //    val monthName = i match {
    i match {
      case 1 => "January"
      case 2 => "February"
      case 3 => "March"
      case 4 => "April"
      case 5 => "May"
      case 6 => "June"
      case 7 => "July"
      case 8 => "August"
      case 9 => "September"
      case 10 => "October"
      case 11 => "November"
      case 12 => "December"
      case _ => "Invalid month"
    }
  }

  def getMatch2(bool: Boolean): String = bool match {
    case true => "you said true"
    case false => "you said false"
  }

  def main(args: Array[String]): Unit = {

    //getOutput()
    //getInput()

    createDate()
    createObject()
    concatString()

    getConditions()
    getLoops()
    getExpression()
    println(getMatch1())
    println(getMatch2(true))
  }
}
