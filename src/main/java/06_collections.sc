import java.util
import scala.collection.mutable.ArrayBuffer
import scala.io.Source

val a = Array(1, 2, 3, 4, 5, 6, 7)
val l = List("A", "B", "C", "D")
val s = Set(2,45,678,564,343)
val m = Map("KR" -> "Kranj", "LJ" -> "Ljubljana")

a.sliding(2).toList

a.foldLeft(1)(_ * _)
a.foldRight(1)(_ * _)
a.dropWhile(_ < 3)
a.filter(v => v > 3)
a.sliding(2).toList.flatten
a.max
a.min
a.last
a.map(_ + 12)
a.foreach(v => { println(v) })






a.mkString("START", " ::: ", "END")
s.intersect(Set(1, 2, 3))
s.union(Set(1, 2, 3))
val buffer = ArrayBuffer[Int](1, 2, 3, 4, 5, 6)


val list = new util.ArrayList[Int]()
list.add(1)
list.add(2)
list.add(3)
list.add(4)
list.add(5)
list.add(6)

import scala.collection.JavaConversions._
list.sortWith(_ > _)

Source.fromFile("").getLines().filter(!_.startsWith("#")).
  map(_.split(";")).filter(_(0).toInt > 10).map(_(2).toInt).sum








