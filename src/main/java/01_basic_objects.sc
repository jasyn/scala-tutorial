class Rational(val x: Int, val y: Int) {
  require(y != 0, "Denominator must not be equal to zero!")

  def this(x: Int) = this(x, 1)

  def add(that: Rational): Rational = {
    new Rational(this.x*that.y + that.x*this.y, this.y*that.y)
  }

  def +(that: Rational) = new Rational(this.x*that.y + that.x*this.y, this.y*that.y)

  def toString1():String = {
    return x + "/" + y;
  }

  //override def toString = String.format("%d/%d", x, y)
  override def toString = "%d/%d".format(x, y)
}

new Rational(2, 3)
try {
  new Rational(2,0)
} catch {
  case ex: Exception => println(ex.getMessage)
}

new Rational(1)
new Rational(1).add(new Rational(2,3))
new Rational(1) + new Rational(2,3)
new Rational(1).+(new Rational(2,3))

implicit def rationalToDouble(r: Rational) =
  r.x.toDouble / r.y

3.4 + new Rational(2, 3)











