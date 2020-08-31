package Algorithms

/**
 * Created by MikBac on 31.08.2020
 */
object CountingSort {

  /**
   * Generates an array [0, max]
   *
   * @param list : List[Int]
   * @return sorted list
   */
  def sort(list: List[Int]): List[Int] = {
    val max = list.max
    val h = Array.fill(max + 1) {
      0
    }
    var ans: List[Int] = List()

    list.foreach(numb => h(numb) = h(numb) + 1)

    h.zipWithIndex.foreach((numb) => for (i <- 0 until numb._1) ans = numb._2 :: ans)

    ans
  }

  /**
   * Generates an array [min, max]
   *
   * @param list : List[Int]
   * @return sorted list
   */
  def sortSmallArray(list: List[Int]): List[Int] = {
    val min = list.min
    val max = list.max
    val h = Array.fill(max + 1 - min) {
      0
    }
    var ans: List[Int] = List()

    list.foreach(numb => h(numb - min) = h(numb - min) + 1)

    h.zipWithIndex.foreach((numb) => for (i <- 0 until numb._1) ans = numb._2 + min :: ans)

    ans
  }

  def main(args: Array[String]): Unit = {
    val list = List(3, 2, 4, 3, 2, 4, 5, 23, 23, 5, 232, 2, 100, 11, 6, 3, 4, 2)

    println(sort(list))
    println(sortSmallArray(list))
  }

}
