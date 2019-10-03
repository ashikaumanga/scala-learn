
trait Node[+B] {
  def prepend[U >: B](elm: U) : Node[U]
}

object LowerTypeBounda {
  def main(args: Array[String]) : Unit = {
    
  }
}