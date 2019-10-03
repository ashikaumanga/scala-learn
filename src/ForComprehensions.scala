

object ForComprehensions {
  
  case class User(name: String, age: Int)
  
  //example 1
  def foo(n: Int,v: Int) =
    for (i <- 0 until n;
         j <- 0 until n if i+j == v )
    yield (i,j)
    
 //example 3
 def foo3(n: Int, v: Int) =
   for(i <- 0 until n;
       j <- 0 until n if i+j == v)
   println(s"($i,$j)")
  
  def main(args: Array[String]) : Unit = {
    
      val userBase = List(User("Travis",28),
          User("Kelly",33),
          User("Jennifer",44),
          User("Dennis",23))
          
      //example 2
          val twentyUsers = for (user <- userBase if (user.age >=30))
        yield user.name
        
      twentyUsers.foreach(println(_))
      
      //example 3 -- produce side-effect
      foo3(10,10)
      
  }
}