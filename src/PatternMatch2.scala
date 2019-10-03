import scala.util.Random

object PatternMatch2 {
  
  //example 1
  def method1() = {
    val x: Int = Random.nextInt(10)
    
    x match {
      case 0 => "zero"
      case 1 => "one"
      case _ => "other"
    }
  }
  
  //pattern guards
  def showImporantNot(noti: Notification, importantPeople: Seq[String]) : String = {
    noti match {
      case Email(sender, _, _) if importantPeople.contains(sender) => "Special"
      case SMS(number, _) if importantPeople.contains(number) => "SMS Special"
      case other => showNotification(other)
    }
  }
  
  //matching on type
  abstract class Device
  case class Phone(model: String) extends Device {
    def screenOff = "Turning screen off"
  }
  case class Computer(model: String) extends Device {
    def screenSaverOn = "turning screen saver on"
  }
  def goIdle(device: Device) = device match {
    case p: Phone => p.screenOff
    case c: Computer => c.screenSaverOn
  }
  
  //example 2
  sealed abstract class Notification
  case class Email(sender: String, title: String, body:String) extends Notification
  case class SMS(caller: String, message: String) extends Notification
  case class VoiceRec(contactName: String, link: String) extends Notification
  
  def showNotification(notification: Notification): String = {
    notification match {
      case Email(sender,title,_) => "email"
      case SMS(number, msg) => s"Number $number"
      case VoiceRec(name, link) => s"$link"
    }
  }
  
  def main(args: Array[String]) : Unit = {
     println( method1())
  }
}