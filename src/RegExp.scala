import scala.util.Random

object RegExp {
  
  import scala.util.matching.Regex
  
  //example 1
  val numberPattern: Regex = "[0-9]".r
  
  numberPattern.findFirstMatchIn("awesomepassord") match {
    case Some(_) => println("Password ok")
    case None => println("Not good")
  }
  
  //example 2
  val  keyValPattern : Regex = "([0-9a-zA-Z- ]+): ([0-9a-zA-Z-#()/. ]+)".r
  
  
  def main(args: Array[String]) : Unit = {
    
    
    //c1.ap
    
    val input: String =
  """background-color: #A03300;
    |background-image: url(img/header100.png);
    |background-position: top center;
    |background-repeat: repeat-x;
    |background-size: 2160px 108px;
    |margin: 0;
    |height: 108px;
    |width: 100%;""".stripMargin
    
   // for (patternMatch <- keyValPattern.findAllMatchIn(input))
    //    println(s"key ${patternMatch.group(1)} val ${patternMatch.group(2)}")
  }
  
}