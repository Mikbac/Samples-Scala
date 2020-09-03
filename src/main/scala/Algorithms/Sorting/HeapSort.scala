package Algorithms.Sorting

/**
 * Created by MikBac on 03.09.2020
 */
object HeapSort {

  def getHeap(array: Array[Int], arrayLength: Int, j: Int): Unit = {

    var largest = j
    val (k, i) = (2 * j + 1, 2 * j + 2)

    if (k < arrayLength && array(k) > array(largest))
      largest = k

    if (i < arrayLength && array(i) > array(largest))
      largest = i

    if (largest != j) {
      val swap = array(j)
      array(j) = array(largest)
      array(largest) = swap

      getHeap(array, arrayLength, largest)
    }

  }

  def sort(array: Array[Int]) {

    val arrayLength = array.length

    for (i <- 0 until arrayLength / 2)
      getHeap(array, arrayLength, (arrayLength / 2) - 1 - i)

    for (i <- 0 until arrayLength - 1) {
      val temp = array(0)
      array(0) = array(arrayLength - 1 - i)
      array(arrayLength - 1 - i) = temp
      getHeap(array, arrayLength - 1 - i, 0)
    }

  }

  def main(args: Array[String]): Unit = {
    val array = Array(3, 2, 4, 3, 2, 4, 5, 23, 23, 5, 232, 239, 2, 100, 11, 6, 3, 4, 2)

    sort(array)
    array.foreach(numb => print(s"$numb "))
  }
}
