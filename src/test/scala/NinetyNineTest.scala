import org.scalatest.{Matchers, FlatSpec}

/**
 * Created by jianfeng on 19/06/2015.
 */
class NinetyNineTest extends FlatSpec with Matchers{

  // P1
  it should "return the last element" in {
    NinetyNine.last(List(1, 1, 2, 3, 5, 8)) should be (8)
  }

  // P2
  it should "return the last but one element of a list" in {
    NinetyNine.penultimate(List(1, 1, 2, 3, 5, 8)) should be (5)
  }

  // P3
  it should "Find the Kth element of a list" in {
    NinetyNine.nth(2, List(1, 1, 2, 3, 5, 8)) should be(2)
  }

  // P4
  it should "Find the number of elements of a list" in {
    NinetyNine.length(List(1, 1, 2, 3, 5, 8)) should be(6)
  }

  // P5
  it should "Reverse a list" in {
    NinetyNine.reverse(List(1, 1, 2, 3, 5, 8)) should be (List(8, 5, 3, 2, 1, 1))
  }

  // P6
  it should "Find out whether a list is a palindrome" in {
    NinetyNine.isPalindrome(List(1, 2, 3, 2, 1)) should be (true)
    NinetyNine.isPalindrome(List(1, 2, 3, 2)) should be (false)
  }

  // P7
  it should "Flatten a nested list structure" in {
    NinetyNine.flatten(List(List(1, 1), 2, List(3, List(5, 8)))) should be (List(1, 1, 2, 3, 5, 8))
  }

  // P8
  it should "Eliminate consecutive duplicates of list elements" in {
    NinetyNine.compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) should be (List('a, 'b, 'c, 'a, 'd, 'e))
  }
}
