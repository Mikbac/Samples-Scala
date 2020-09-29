package Algorithms.Recursion

/**
 * Created by MikBac on 29.09.2020
 */
object Factorial {

  def product(f: Int => Int)(a: Int, b: Int): Int =
    if (a > b) 1
    else f(a) * product(f)(a + 1, b)

  def factorial(n: Int): Int = product(x => x)(1, n)

  def main(args: Array[String]): Unit = {

    println(factorial(3)) // 6
    println(factorial(5)) // 120

  }
}
