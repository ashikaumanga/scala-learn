import scala.util.Random

object Extractor {
  
    object CustomerId {
    def apply(name: String) = s"$name--${Random.nextLong}"
    def unapply(customerId: String) : Option[String]= {
      val arr: Array[String] = customerId.split("--")
      if (arr.tail.nonEmpty) Some(arr.head) else None
    }
  }
    
    case class Person(name: String,age: Int)
  
  def main(args: Array[String]) : Unit = {
    val c1 = CustomerId("ashika")
    val CustomerId(name) = c1 // val name = CustomerId.unapply(c1).get
    println(name)
    println(c1)
    
    val CustomerId(name2) = "--safdadsds"
    println(">"+name2)
    
  }
}