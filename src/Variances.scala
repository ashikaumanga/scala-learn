

object Variances {
  
  class Foo[+A] //A covariant
  class Bar[-A] //A contravariant
  class Baz[A] //an invariant class
  
  abstract class Animal {
    def name: String
  }
  case class Cat(name: String) extends Animal
  case class Dog(name: String) extends Animal
  
  
  //contravariant
  abstract class Printer[-A] {
    def print(value: A): Unit
  }
  
  class AnimalPrinter extends Printer[Animal] {
    def print(animal : Animal) : Unit = {
      println("Animal is "+animal.name)
    }
  }
  
  class CatPrinter extends Printer[Cat] {
    def print(cat: Cat): Unit = {
      println("Cat is "+cat.name)
    }
  }
  
  object Contravariance extends App {
    val myCat: Cat = Cat("Boots")
    
    def printMyCat(printer: Printer[Cat]) : Unit = {
      printer.print(myCat)
    }
    
    val catPrinter : Printer[Cat] = new CatPrinter
    val animalPrinter : Printer[Animal] = new AnimalPrinter
    
    printMyCat(catPrinter)
    printMyCat(animalPrinter)
    
  }
  
  //Invariant
  class Container[A](value: A) {
    private var _value : A = value
    def getValue: A = value
    def setValue(value:A) : Unit = {
      _value = value
    }
  }
  
  
  
  def main(args: Array[String]) : Unit = {
    
    //A covariant
    var v1 : List[Animal] = List()
    val v10 : List[Cat] = List()
    val v20 : List[Dog] = List()
    
    v1 = v10
    v1 = v20
    
    //Invariant test
    val catContainer: Container[Cat] = new Container(Cat("Felix"))
    //val animalContainer: Container[Animal] = catContainer
    
    
  }
  

}