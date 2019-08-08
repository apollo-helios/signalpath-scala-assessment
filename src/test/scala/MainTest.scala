import org.scalatest.FunSuite

class MainTest extends FunSuite {
  test("Main.specialMath") {
    assert(Main.specialMath(2) === 3)
    assert(Main.specialMath(3) === 7)
    assert(Main.specialMath(4) === 14)
    assert(Main.specialMath(5) === 26)
  }

  test("Main.specialMath, 90") {
    var specialMath90 = BigInt("19740274219868223074")
    assert(Main.specialMath(90) === specialMath90)
  }
}