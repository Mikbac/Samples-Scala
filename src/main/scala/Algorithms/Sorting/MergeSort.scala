package Algorithms.Sorting

/**
 * Created by MikBac on 03.09.2020
 */

object MergeSort {

  def sort(array: Array[Int], left: Int, right: Int) {

    if (left < right) {
      val medium = (left + right) / 2

      sort(array, left, medium)
      sort(array, medium + 1, right)

      val arrayOneSize = medium - left + 1
      val arrayTwoSize = right - medium

      val arrayOne = array.slice(left, left + arrayOneSize)
      val arrayTwo = array.slice(medium + 1, medium + 1 + arrayTwoSize)

      var (arrayOneCurrentSize, arrayTwoCurrentSize) = (0, 0)
      var arrayCurrentSize = left

      while (arrayOneCurrentSize < arrayOneSize && arrayTwoCurrentSize < arrayTwoSize) {
        if (arrayOne(arrayOneCurrentSize) <= arrayTwo(arrayTwoCurrentSize)) {
          array(arrayCurrentSize) = arrayOne(arrayOneCurrentSize)
          arrayOneCurrentSize += 1
        }
        else {
          array(arrayCurrentSize) = arrayTwo(arrayTwoCurrentSize)
          arrayTwoCurrentSize += 1
        }
        arrayCurrentSize += 1
      }

      while (arrayOneCurrentSize < arrayOneSize || arrayTwoCurrentSize < arrayTwoSize) {
        if (arrayOneCurrentSize < arrayOneSize) {
          array(arrayCurrentSize) = arrayOne(arrayOneCurrentSize)
          arrayOneCurrentSize += 1
        }
        if (arrayTwoCurrentSize < arrayTwoSize) {
          array(arrayCurrentSize) = arrayTwo(arrayTwoCurrentSize)
          arrayTwoCurrentSize += 1
        }
        arrayCurrentSize += 1
      }
    }
  }

  def main(args: Array[String]): Unit = {
    val array = Array(3, 2, 4, 3, 2, 4, 5, 23, 23, 5, 232, 239, 2, 100, 11, 6, 3, 4, 2)

    sort(array, 0, array.length - 1)
    array.foreach(numb => print(s"$numb "))
  }
}
