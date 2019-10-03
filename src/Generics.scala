


class Reference[T] {
  private var contents: T = _
  def set(value: T) {contents = value}
  def get: T = contents
}

object Generics {
  def main(args: Array[String]): Unit = {
    val r = new Reference[Int]
    
    //function list
    val fnList =  List[(Int,Int)=>Int]();
    var elm: List[Int] = Nil
   
        
  }
}