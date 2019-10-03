
trait Buffer {
  type T
  val element: T
}

abstract class SeqBuffer extends Buffer {
  type U
  type T <: Seq[U]
  def length = element.length
}

abstract class IntSeqBuffer extends SeqBuffer {
  type U = Int
  }

class Animal
class Cat extends Animal
class Dog extends Animal

abstract class ABuffer[+T] {
  val element : T
}
abstract class ASeqBuffer[U,+T <: Seq[U]] extends ABuffer[T] {
  def length = element.length
}





object AbstractTypeMembers {
  
  def newAnimalSeqBuf(e1: Animal,e2: Animal) : ASeqBuffer[Animal,Seq[Animal]] =
  new ASeqBuffer[Animal,List[Animal]] {
    val element = List(e1,e2)
}
  
  def newIntSeqBuf(elm1: Int, elm2: Int) : IntSeqBuffer = 
  new IntSeqBuffer {
    type T = List[U]
    val element = List(elm1,elm2)
}
  
  def main(args: Array[String]) : Unit = {
    
    val buf = newIntSeqBuf(7,8)
    println("content ="+buf.element)
    println("length ="+buf.length)
    
    val aBuf = newAnimalSeqBuf(new Cat(),new Dog())
     println("content ="+aBuf.element)
    println("length ="+aBuf.length)
    
  }
}