package Algorithms.Sorting

/**
 * Created by MikBac on 30.08.2020
 */

object BubbleSort {

  def sort(list: List[Int]): List[Int] = {
    var sortedList = list
    sortedList.foreach { case (j) =>
      for (i <- 0 until sortedList.length - 1) {
        if (sortedList(i) < sortedList(i + 1)) {
          sortedList = sortedList.updated(i, sortedList(i + 1)).updated(i + 1, sortedList(i))
        }
      }
    }
    sortedList
  }


  def main(args: Array[String]): Unit = {
    val list = List(3, 2, 4, 3, 2, 4, 5, 23, 23, 5, 1, 2, 0, 1, 6, 3, 4, 2)

    println(sort(list))

  }

}
