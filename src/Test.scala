
final case class A(b: Int,c: Int)
sealed trait Z
final case class Y() extends Z
final case class C() extends Z



sealed trait Calculation {
  def add(value: Int) : Calculation = ???
}
final case class Success(value: Int) extends Calculation
final case class Failure(msg: String) extends Calculation 

sealed trait Visitor {
  def id : String
  def doSomething : Int
}
final case class Anony(id : String) extends Visitor {
  def doSomething : Int  = {
    2
  }
}
final case class User(id : String, email : String) extends Visitor {
  def doSomething : Int  = {
    10
  }
}

case class Foo(v:Int)
class Bar(v: Int, val x: Int) extends Foo(v)

class Utility[F,A] {
  def map[B](f: A=> B): F = ???
}

class Utility2[F[_],A] {
  def map[B](f: A=> B): F[B] = ???
}
class Complex(real: Double, imgaginary : Double) {
  def re = real;
  def img = imgaginary;
}






object Test {
  

type Environment = String => Int
 
 def eval(t: Tree, env: Environment):Int = t match {
  case Sum(l,r) => eval(l,env) + eval(r,env)
  case Var(n) => env(n)
  case Const(v) => v
}
  
  def main(args: Array[String]): Unit = {
    
     val v = (1 to 10) toStream;
     
     val b = for {
       i: Int <- 1 to 10
       j: Int <-1 to 10
       //println(i + " "+j)
     } yield (i,j,i*j)
     
     println(b)
     
     val r = (1 to 10) reduceLeft { (x,y) => x }
     println(r)
     
     val c = new Complex(1.2,1.3)
     println(c.img)
     println(c.re)
     
     //val env: Environment = { case "x" => 5 case "y" => 7}
     val env: (String  => Int) = { case "x" => 5 case "y" => 7}
   
  
  }
  
}