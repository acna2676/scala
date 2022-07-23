object main {
  def hello(): Unit = println("Hello")
  def doFunc(n: Int, fn: () => Unit): Unit = {
    for (i <- 1 to n) fn()
  }

  def main(args: Array[String]) {
    doFunc(5, hello)
  }
}
