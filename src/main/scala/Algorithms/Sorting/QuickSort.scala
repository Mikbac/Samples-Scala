package Algorithms.Sorting

/**
 * Created by MikBac on 01.09.2020
 */
object QuickSort {

  def partition(array: Array[Int], low: Int, high: Int): Int = {
    var i = (low - 1)
    val pivot = array(high)
    for (j <- low until high) {
      if (array(j) < pivot) {
        i = i + 1
        val temp = array(i)
        array(i) = array(j)
        array(j) = temp
      }
    }
    val temp = array(i + 1)
    array(i + 1) = array(high)
    array(high) = temp

    i + 1
  }

  def sort(array: Array[Int], low: Int, high: Int): Unit = {
    if (low < high) {
      val pi: Int = partition(array, low, high)
      sort(array, low, pi - 1)
      sort(array, pi + 1, high)
    }
  }


  def main(args: Array[String]): Unit = {
    val array = Array(3, 2, 4, 3, 2, 4, 5, 23, 23, 5, 232, 239, 2, 100, 11, 6, 3, 4, 2)
    val n = array.length
    sort(array, 0, n - 1)
    array.foreach(numb => print(s"$numb "))
  }

}
