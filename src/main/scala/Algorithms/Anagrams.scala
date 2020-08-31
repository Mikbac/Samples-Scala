package Algorithms

import scala.collection.mutable

/**
 * Created by MikBac on 01.09.2020
 */

object Anagrams {

  def isAnagram(wordOne: String, wordTwo: String): Boolean = {

    val normalWordOne = getNormalization(wordOne)
    val normalWordTwo = getNormalization(wordTwo)

    if (normalWordOne.length.equals(normalWordTwo.length))
      getWordMap(normalWordOne).equals(getWordMap(normalWordTwo))
    else
      false

  }

  def getNormalization(word: String): String = {
    word.replaceAll("\\s+", "").toLowerCase
  }

  def getWordMap(word: String): mutable.Map[Char, Int] = {
    val wordMap = collection.mutable.Map[Char, Int]()
    word.foreach(letter => {
      if (wordMap.contains(letter))
        wordMap.update(letter, wordMap(letter) + 1)
      else wordMap += ((letter -> 1))
    })
    wordMap
  }

  def main(args: Array[String]): Unit = {
    println(isAnagram("abc", "cba")) //  true
    println(isAnagram("aaa", "bbb")) //  false
    println(isAnagram("Julian Tuwim", "Lutni ujaw mi")) //  true
    println(isAnagram("Gregory House", "Huge ego sorry")) //  true
    println(isAnagram("Jim Morrison", "Mr Mojo Risin")) //  true
  }
}
