def fun(a: Int, b: Int): Int = a + b

val fun1 = fun(30, _: Int)

fun1(10)

//Higher Order Functions
def sumInts(a: Int, b: Int): Int =
  if (a > b) 0 else a + sumInts(a + 1, b)
def sumCubes(a: Int, b: Int): Int =
  if (a > b) 0 else a*a*a + sumInts(a + 1, b)
/////////
//General function
def sum(f: Int => Int, a: Int, b: Int): Int =
  if (a > b) 0 else f(a) + sum(f, a + 1, b)
def cube(x: Int) = x*x*x
def sumCubes1(a: Int, b: Int) = sum(cube, a, b)
//Anonymous function
def sumInts1(a: Int, b: Int) = sum((x:Int)=>x, a, b)

////////////

//Currying (name by Haskell Brooks Curry)

//a) Function that returns a function
//b) Multiple parameter list
def sum1(f: Int => Int)(a: Int, b: Int): Int =
  if (a > b) 0 else f(a) + sum1(f)(a + 1, b)
def sumCubes2 = sum1(cube) _
def sumInts2 = sum1((x: Int) => x) _




