package Algorithms.Other

/**
 * Created by MikBac on 02.09.2020
 */
object Duplicates {
  /**
   * Remove duplicates from an array in place
   *
   * * @param list : List[Int]
   * * @return list
   */
  def removeDuplicates(list: collection.mutable.ListBuffer[Int]): Unit = {

    val supp: collection.mutable.ListBuffer[Int] = list.sortWith(_.compareTo(_) < 0).clone()

    for (i <- 0 until supp.length - 1)
      if (supp(i).equals(supp(i + 1)))
        list -= supp(i)
  }

  def main(args: Array[String]): Unit = {
    val list = collection.mutable.ListBuffer(3, 2, 4, 3, 2, 4, 5, 23, 23, 5, 1, 2, 0, 1, 6, 3, 4, 2)

    removeDuplicates(list)
    println(list)

  }
}
