

object ByNameParam {
  
  def whileLoop(condition: => Boolean,body: => Unit): Unit =
  if (condition) {
    body
    whileLoop(condition,body)
  }
  
  def method(param1: Int, param2: Unit): Unit = {
    println("Param " + param1)
    param2
  }

  
  
  def main(args: Array[String]) : Unit = {
    
    method(1,{ 
      println("hello")
      })
    
    /**
    var i = 2

  whileLoop (i > 0, {
    println(i)
    i -= 1
   } )**/
    
 }
}