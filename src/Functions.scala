

object Functions {
  
  def printAll(strings: String*) {
    strings.map(println)
  }
  
  def method1(x: Int, y: Int = 7) = x+ y
  
  def name: String = System.getProperty("user.name")
  
  def method2(x: Int, y: Int) : Int = ???
  
  //nested methods
  def factorial(x: Int) : Int = {
    def fact(x: Int, accum: Int) : Int = {
      if (x<=1) accum
      else fact(x-1, x*accum)
    }
    fact(x,1);
  }
  
  case class WeeklyWeatherForecast(temps: Seq[Double]) {
    private def convertCToF(temp: Double) = temp+1.8+32
    def forecastInFarenheit: Seq[Double] = temps.map(convertCToF);
  }
  
  
  
  // Main
  def main(args: Array[String]): Unit = {
    
   val f = (i:Int) => { i * 2}
   //implicit
   val f2 = (x: Int,y:Int) => {x+y}
   //explicit
   val f3 : (Int, Int) => Int = (x,y) => { x + y}
   
   //val a
   
   //val tmp = f3(1)
   //println(tmp)
  }
}