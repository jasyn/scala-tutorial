val a = if (true) 10 else 8

val b = for (i <- 1 to 10) i

val c = for (i <- 1 to 10) yield i

//FOR
for (i <- 1 to 10) println(i)










for (i <- 1 until 10) println(i)








for (i <- Array("Slavko", "Robi", "Kris").zipWithIndex) {
  println(i._1, i._2)
}



for ((ime, idx) <- Array("Slavko", "Robi", "Kris").zipWithIndex) {
  println(ime, idx)
}


for ((ime1, ime2) <- Array("Slavko", "Robi", "Kris").zip(Array("Mojca", "Anja", "Tadeja"))) {
  println(ime1, ime2)
}


for {
  ime1 <- Array("Slavko", "Robi", "Kris")
  ime2 <- Array("Mojca", "Anja", "Tadeja")
  if ime1.equals("Slavko")
} {
  println(ime1, ime2)
}

//BREAKS
import scala.util.control.Breaks._

breakable {
  while (true) {
    println("Burek")
    break
  }
}



















