// scalac main.scala
// scala main

class Year(year: Int) {
  def add(n: Int): Int = this.year + n
  def +(n: Int): Int = this.year + n
}
object main {
  def main(args: Array[String]) {
    var y = new Year(2000)
    println(y.add(21))  // => 2021
    println(y add 21)   // => 2021
    println(y.+(21))    // => 2021
    println(y + 21)     // => 2021
  }
}
