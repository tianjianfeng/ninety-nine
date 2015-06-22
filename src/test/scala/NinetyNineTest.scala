import org.scalatest.{Matchers, FlatSpec}

/**
 * Created by jianfeng on 19/06/2015.
 */
class NinetyNineTest extends FlatSpec with Matchers{

  it should "return the last element" in {
    NinetyNine.last(List(1, 1, 2, 3, 5, 8)) should be (8)
  }

  it should "return the last but one element of a list" in {
    NinetyNine.penultimate(List(1, 1, 2, 3, 5, 8)) should be (5)
  }

  it should "Find the Kth element of a list" in {
    NinetyNine.nth(2, List(1, 1, 2, 3, 5, 8)) should be(2)
  }
}
