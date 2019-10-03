
trait TraitA {
  def foo : Foo = ???
}

trait TraitB {
  def bar : Unit
}

trait InterfaceA {
  def methodA() : String
}
trait InterfaceB {
  this: InterfaceA =>
  def methodB(): String

}
class ClzAB extends InterfaceB with InterfaceA{
  override def methodA() : String = { "methodA"}
  override def methodB() : String = {"methodB"}
}

object CompundTypes {
  
  def cloneAndRest(obj : TraitA with TraitB) : Unit = {
    val ret = obj.foo
    obj.bar
  }
  
  def main(args: Array[String]) : Unit = {
    //cloneAndRest(Nil)
    val v = new ClzAB
    //v.
    
  }
}