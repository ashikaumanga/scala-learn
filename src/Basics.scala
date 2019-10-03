

object Basics {
  
  
  abstract class A {
    val msg : String
  }
  class B extends A {
    val msg = "I am an instance of class B"
  }
  trait C extends A {
    def loudMsg = msg.toUpperCase()
  }
  class D extends B with C
  
  
  // type ans traitts
  abstract class AbsIterator {
    type T
    def hasNext: Boolean
    def next() : T
  }
  
  class StringIterator(s: String) extends AbsIterator {
    type T = Char
    private var i =0 
    def hasNext = i < s.length
    def next() = {
      val ch = s charAt i
      i +=1
      ch
    }
  }
  
  trait RichIterator extends AbsIterator {
    def foreach(f: T => Unit): Unit = while (hasNext) f(next())
  }
  
  
  
  def main(args: Array[String]): Unit = {
    
    //mixing
    val d = new D
    println(d.msg)
    println(d.loudMsg)
    
    
    
    //Tuples
    val tuple1= ("Super",25)
    val v = tuple1._1
    
    val (a1,a2) = tuple1;
    
    val planets = List(("Mercury",57.9),("Earch",60.5))
    
    planets.foreach{
        case ("Earth",distance) =>
          println(s"Out planet is $distance")
        case _ =>    
    }
    
    for ((a,b) <- planets) {
      println(a + b);
    }
    
  }
}