object Main extends App {
  def specialMath(n: Int): BigInt = {
    var specialMathn1 = BigInt(1)
    var specialMathn2 = BigInt(0)
    var result = BigInt(0)
    if (n == 0) 0
    else if (n == 1) 1
    else {
      for(i <- 2 to n) {
        result = i + specialMathn1 + specialMathn2
        specialMathn2 = specialMathn1
        specialMathn1 = result
        println(result)
      }
      result
    }
  }

  println(specialMath(90))
}
