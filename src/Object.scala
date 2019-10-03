

object Object {
  
  class Cls1 {
    object Obj {
       def method() = {
         println("Cls1 method")
       }
    }
  }
  class Cls2 {
    object Obj {
      def method() = {
        println("Cls2 method")
      }
    }
  }
  
  class Email(val username: String,val domainName: String)
  object Email {
    def fromString(emailString: String) : Option[Email] = {
      emailString.split('@') match {
        case Array(a,b) => Some(new Email(a,b))
        case _ => None
      }
    }
  }
  
  def main(args : Array[String]) : Unit = {
     val c1 = new Cls1()
     val c2 = new Cls2()
     
     c1.Obj.method();
     c2.Obj.method();
  }
}