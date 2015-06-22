import java.util.NoSuchElementException

import scala.annotation.tailrec

/**
 * Created by jianfeng on 19/06/2015.
 */
object NinetyNine {

  // P1
  def last(l: List[Int]): Int = {
    l match {
      case Nil => throw new NoSuchElementException
      case h :: Nil => h
      case _ :: tail => last(tail)
    }
  }

  // P2
  def penultimate(l: List[Int]): Int = {
    l match {
      case Nil => throw new NoSuchElementException
      case h :: Nil => throw new NoSuchElementException
      case h :: p :: Nil => h
      case _ :: tail => penultimate(tail)
    }
  }

  // P3
  def nth(n: Int, l: List[Int]): Int = {
    if (n >= l.size || n < 0) throw new scala.NoSuchElementException
    else {
      @tailrec
      def loop(m: Int, k: List[Int]): Int = {
        if (m == n) k.head
        else loop(m + 1, k.tail)
      }
      loop(0, l)
    }
  }

  // P4
  def length(l: List[Int]) = {
    l.foldLeft(0)((acc, a) => acc + 1)
  }

  // P5
  def reverse(l: List[Int]) = {
    l.foldLeft(List[Int]())((acc, a) => List(a) ::: acc)
  }

  // P6
  def isPalindrome(l: List[Int]): Boolean = {
    l == reverse(l)
  }

}
