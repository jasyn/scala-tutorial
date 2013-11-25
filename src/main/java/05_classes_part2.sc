import com.typesafe.scalalogging.slf4j.Logging

trait Philosophical {
  def philosophize() {
    println("I consume memory, therefore I am.")
  }
}

abstract class Animal(n: String) {
  val name = n
  def makeSound;
  def philosophize() {
    println("I am animal.")
  }
}

case class Frog(n: String) extends Animal(n) with Philosophical with Logging {
  def makeSound() = {
    logger.info("Rega, rega")
  }
  override def philosophize() {
    super[Animal].philosophize()
  }
}



case class Cat(n: String) extends Animal(n) {
  def makeSound() = {
    println("Mijav")
  }
}


val f = Frog("Zaba")
val c = Cat("Muc")
c.asInstanceOf[Animal] match {
  case Cat("Muc") => println("We got cat named Muc!")
  case Frog(n) => println("Name of frog is %s".format(n))
  case _ => println("Not matched")
}


















