

object Currying2 {
  
  def filter(xs: List[Int], p:Int=> Boolean) : List[Int]= 
    if (xs.isEmpty) xs
    else if (p(xs.head)) xs.head :: filter(xs.tail,p)
    else filter(xs.tail,p)
    
  def modN(n: Int)(x:Int) = {println("n="+n++" x="+x); ((x % n) ==0)}
  
  def func(y: String, x: Int) = {x+":"+y}
  
  def main(args: Array[String]) = {
    val nums = List(1,2,3,4,5,6,7,8)
    val a = nums.foldLeft("Val") {
      (v,i) => v+""+i 
    }
    
  }
}