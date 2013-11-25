//Functions

def sqr(x: Int): Int = x*x

val sqr1 = new Function[Int, Int] {
  def apply(x: Int) = x*x
}

//Anonymous functions

val sqr2 = (x: Int) => x*x

val sqr3 = {
  class AnonFun extends Function[Int, Int] {
    def apply(x: Int) = x*x
  }
  new AnonFun
}

sqr(2)
sqr1(2)
sqr2(2)
sqr3(2)


