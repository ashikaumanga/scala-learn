

object PolymorphicMethod {
  
  def listOfDup[A](x: A, length: Int) : List[A] = {
    if (length <1)
      Nil
    else
      x :: listOfDup(x, length-1)
  }
  
  def whileLoop(condition: => Boolean)(body: => Unit): Unit =
  if (condition) {
    body
    whileLoop(condition)(body)
  }

  
  def main(args: Array[String]) : Unit = {
    //println(listOfDup(3,4))
    //println(listOfDup("x",4))
    var i = 2
    whileLoop (i > 0)( {
      println(i)
      i -= 1
    } )
  }
}