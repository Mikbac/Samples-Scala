package Algorithms.Other

/**
 * Created by MikBac on 04.09.2020
 */
object MatrixTransposition {

  def transposition(matrix: Array[Array[Int]]): Array[Array[Int]] = {
    var ans: Array[Array[Int]] = Array.fill(matrix(0).length) {
      Array.fill(matrix.length) {
        0
      }
    }
    for (i <- matrix(0).indices) {
      for (j <- matrix.indices) {
        ans(i)(j) = matrix(j)(i)
      }
    }
    ans
  }

  def printMatrix(matrix: Array[Array[Int]]): Unit = {
    var matrixVal: Int = 0
    for (i <- matrix.indices) {
      for (j <- matrix(0).indices) {
        matrixVal = matrix(i)(j)
        print(s"$matrixVal ")
      }
      println("")
    }
  }

  def main(args: Array[String]): Unit = {
    val matrix = Array(Array(7, 2, 8, -1), Array(1, 3, 2, 0), Array(-5, 9, 5, -7))

    val transMatrix = transposition(matrix)
    printMatrix(transMatrix)

  }
}
