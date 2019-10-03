

object CaseClass {
  
  case class Message(sender: String, recp: String)
  
  def main(args: Array[String]): Unit = {
    val msg1 = Message("sender", "recp")
    //copy
    val msg2 = msg1.copy()
  }
}