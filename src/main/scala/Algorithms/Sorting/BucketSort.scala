package Algorithms.Sorting

/**
 * Created by MikBac on 01.09.2020
 */

object BucketSort {

  def sort(list: List[Int]): List[Int] = {
    val max = list.max
    val buckets = Array.fill((max / 10) + 1) {
      collection.mutable.MutableList[Int]()
    }
    val ans = collection.mutable.MutableList[Int]()

    list.foreach(numb => buckets(numb / 10) += numb)

    buckets.foreach(b => b.sortWith(_.compareTo(_) < 0).foreach(bb => ans += bb))

    ans.toList
  }


  def main(args: Array[String]): Unit = {
    val list = List(3, 2, 4, 3, 2, 4, 5, 23, 23, 5, 232, 239, 2, 100, 11, 6, 3, 4, 2)

    println(sort(list))

  }
}
