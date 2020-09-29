package Basic

/**
 * Created by MikBac on 29.09.2020
 */
abstract class AbstractClass {

  def filter(p: Int => Boolean): Int

  def isEmpty: Boolean

}

class Empty extends AbstractClass {

  override def filter(p: Int => Boolean): Int = 99

  override def isEmpty: Boolean = true

}
