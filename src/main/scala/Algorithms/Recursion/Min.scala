package Algorithms.Recursion

/**
 * Created by MikBac on 29.09.2020
 */
object Min {

  def min(xs: List[Int]): Int = {
    if (xs.length != 1) {
      min(xs.head, min(xs.tail))
    } else {
      xs.head
    }
  }

  def min(numb1: Int, numb2: Int): Int = {
    if (numb1 < numb2) {
      numb1
    } else {
      numb2
    }
  }

  def main(args: Array[String]): Unit = {
    println(min(List(1, 2, 6, 0, 9, 1, 2)))
    println(min(List(1, 2, 3, 4)))
    println(min(List(6, 4, 6)))
  }
}
