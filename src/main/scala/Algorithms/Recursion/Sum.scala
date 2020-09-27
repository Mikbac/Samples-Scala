package Algorithms.Recursion

/**
 * Created by MikBac on 27.09.2020
 */
object Sum {

  def sum(xs: List[Int]): Int = {
    if (xs.nonEmpty) {
      xs.head + sum(xs.tail)
    } else {
      0
    }
  }

  def main(args: Array[String]): Unit = {
    println(sum(List(1, 3, 5, 7, 9)))
  }
}
