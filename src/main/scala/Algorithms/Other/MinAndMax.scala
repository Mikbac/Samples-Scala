package Algorithms.Other

/**
 * Created by MikBac on 01.09.2020
 */
object MinAndMax {

  /**
   * The largest and smallest number in an unsorted integer array
   *
   * @param list : List[Int]
   * */
  def min(list: List[Int]): Int = {
    var min: Int = list.head
    list.foreach(numb => if (min > numb) min = numb)
    min
  }

  def max(list: List[Int]): Int = {
    var max: Int = list.head
    list.foreach(numb => if (max < numb) max = numb)
    max
  }

  def main(args: Array[String]): Unit = {
    val list = List(3, 2, 4, 3, 2, 4, 5, 23, 23, 5, 1, 2, 0, 1, 6, 3, 4, 2)

    println(min(list))
    println(max(list))

  }
}
