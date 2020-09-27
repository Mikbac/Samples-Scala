package Basic

/**
 * Created by MikBac on 27.09.2020
 */
object EvaluationRules {

  def doSomething(): Int = {
    println("Works")
    123
  }

  def callByValue(x: Int): Unit = {
    println("x1=" + x)
    println("x2=" + x)
    println("x3=" + x)
  }

  def callByName(x: => Int): Unit = {
    println("x1=" + x)
    println("x2=" + x)
    println("x3=" + x)
  }

  def main(args: Array[String]): Unit = {
    callByValue(doSomething())
    callByName(doSomething())
  }
}
