

object Params {
  
  def exec(arg:Int)(implicit ec: scala.concurrent.ExecutionContext) : Unit = {
     println("Num "+arg)
     println("Ec " + ec);
  }
  
  //partial applications
  def partialApp() = {
    val numbers = List(1,2,3,4,5,6,7,8,9,10)
    val numberFunc = numbers.foldLeft(List[Int]())_
    
    val squares = numberFunc((xs,x) => xs:+ x*x)
    
  }
   def main(args: Array[String]): Unit = {
       //exec(100)
   }
}