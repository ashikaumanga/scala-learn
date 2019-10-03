

object Currying {
  
  def foldLeft[B](z: B)(op: (B ,A) => B): B = ???
  
  def main(args: Array[String]): Unit = {
    def addNonCurr(x: Int,y:Int) = x+ y
    def addCur(x:Int)(y:Int) = x + y
    
    val tmp1 = addCur(3) _
    val tmp2 = (addNonCurr _).curried(3)
    
    //println(tmp1 (5))
    //println(tmp2(5))
    
    val s = List(2,4,3,5,7)
    val res = s.foldRight(0)((m,n) => {println("- "+m+ " "+n+" ret:"+(m+n)); m+n})
    val res2 = s.foldRight(0)(_ + _)
    println(res)
    
    
  }
}