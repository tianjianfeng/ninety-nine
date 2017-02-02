import java.util.NoSuchElementException

import scala.annotation.tailrec

/**
  * Created by jianfeng on 19/06/2015.
  */
object NinetyNine {

  // P1
  def last[A](l: List[A]): A = l match {
    case h :: Nil => h
    case _ :: tail => last(tail)
    case _ => throw new NoSuchElementException()
  }


  // P2
  def penultimate[A](l: List[A]): A = l match {
    case h :: _ :: Nil => h
    case _ :: tail => penultimate(tail)
    case _ => throw new NoSuchElementException()
  }

  def lastNElement[A](n: Int, l: List[A]): A =
    if (n <= 0) throw new NoSuchElementException()
    else if (n > l.length) throw new NoSuchElementException()
    else l.takeRight(n).head

  // P3
  def nth[A](n: Int, l: List[A]): A = {
    def loop(m: Int, ls: List[A]): A = {
      ls match {
        case h :: _ if (n == m) => h
        case h :: tail => loop(m + 1, tail)
        case _ => throw new NoSuchElementException()
      }
    }
    loop(0, l)
  }

  // P4
  def length[A](l: List[A]): Int = l.foldLeft[Int](0)((c, _) => c + 1)

  // P5
  def reverse[A](l: List[A]): List[A] = l.foldLeft[List[A]](Nil)((a, b) => b :: a)

  // P6
  def isPalindrome[A](l: List[A]): Boolean = {
    // In theory, we could be slightly more efficient than this.  This approach
    // traverses the list twice: once to reverse it, and once to check equality.
    // Technically, we only need to check the first half of the list for equality
    // with the first half of the reversed list.  The code to do that more
    // efficiently than this implementation is much more complicated, so we'll
    // leave things with this clear and concise implementation.

    // l == l.reverse

    val length = l.length
    val (firstHalf, secondHalf) = l.splitAt(length / 2)
    if (length % 2 == 0) firstHalf == secondHalf.reverse
    else firstHalf == secondHalf.tail.reverse
  }

  // P7
  def flatten(l: List[Any]): List[Any] = l flatMap {
    case m: List[_] => flatten(m)
    case e => List(e)
  }

  // P8
  def compress[A](l: List[A]): List[A] =
    (l.foldRight[(List[A], A)]((Nil, l.head))((a, e) => if (e._2 != a) (a :: e._1, a) else (e._1, a)))._1

}
