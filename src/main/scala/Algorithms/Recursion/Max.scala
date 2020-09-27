package Algorithms.Recursion

/**
 * Created by MikBac on 27.09.2020
 */
object Max {

  def max(xs: List[Int]): Int = {
    if (xs.length != 1) {
      max(xs.head, max(xs.tail))
    } else {
      xs.head
    }
  }

  def max(numb1: Int, numb2: Int): Int = {
    if (numb1 > numb2) {
      numb1
    } else {
      numb2
    }
  }

  def main(args: Array[String]): Unit = {
    println(max(List(1, 2, 6, 0, 9, 1, 2)))
    println(max(List()))
  }
}
