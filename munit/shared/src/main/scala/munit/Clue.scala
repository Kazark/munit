package munit

import munit.internal.MacroCompat

class Clue[+T](
    val source: String,
    val value: T
) extends Serializable {
  override def toString(): String = s"Clue($source, $value)"
}
object Clue extends MacroCompat.ClueMacro {
  def empty[T](value: T): Clue[T] = new Clue("", value)
}