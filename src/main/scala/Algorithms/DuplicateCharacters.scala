package Algorithms

/**
 * Created by MikBac on 30.08.2020
 */

object DuplicateCharacters {

  def printDuplicateCharacters(word: String): Unit = {
    val letterMap = collection.mutable.Map[Char, Int]()
    word.foreach(letter => {
      if (letterMap.contains(letter))
        letterMap.update(letter, letterMap(letter) + 1)
      else letterMap += ((letter -> 1))
    })
    println(s"The word $word contains duplicates:")
    letterMap.foreach((m) => if (m._2 > 1) println(m))
  }

  def main(args: Array[String]): Unit = {
    printDuplicateCharacters("abc")
    printDuplicateCharacters("aabbccc")
    printDuplicateCharacters("Programming")
  }
}
