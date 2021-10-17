package pfrClasss1

import pfrClasss1.clase1Scala.fibonaci

object clase1Scala extends App {

  //metodo main
  //def main(args: Array[String]): Unit = {

  println("Hola Mundo")
  //}
  println(1 + 1)

  val x: Int = 2
  val y: Int = 3

  println(x+y)

  //Inumatables vs Mutables

  val inmutable = 1
  // inmutable = inmutable+1 Error inmutables

  var mutables = 3
  println(mutables)
  var mutables1 = 2.0
  var mutables2 = "Valor Mutable"

  mutables = mutables + 1
  println(mutables)

  //  val p2 = new Persona
  //  println(p2.strNombre = "Israel")
  //  println(p2.intEdad = 2)

  var variable = 2
  variable + 3
  println(variable)

  //if
  val acondicion = true
  val acondicionValue = if (acondicion) 5 else 3
  println(acondicionValue)
  println(if (acondicion) 5 else 3)
  print(1 + 3)


  var i = 0
  var aWhile = while (i < 100) {
    println(i)
    i += 1
  }

  //poo

  val p3 = new Persona("Israel", 2)
  println(p3.intEdad)
  p3.great("DAniel")


  //factorial implicito
  def factorial(n: Int): Int = (1 to n).product

  println(factorial(5))


  def factorial2(n: Int): Int =
    if (n <= 0) 1
    else n * factorial(n - 1)

  println(factorial2(5))
  //______________________________________________________

  //Validar es primo

  def esPrimo(n: Int): Boolean = {
    (2 until n).forall(k => n % k != 0)
  }

  println(esPrimo(8))

  def esPrimo1(n: Int): Boolean = {
    def esPrimo1Until(t: Int): Boolean =
      if (t <= 1) true
      else n % t != 0 && esPrimo1Until(t - 1)

    esPrimo1Until(n / 2)

  }

  println(esPrimo(8))
  //______________________________________________________

  //Fibonacci

  def fibonaci(n: Int): Int =
    if (n <= 1) 1
    else fibonaci(n - 1) + fibonaci(n - 2)

  println(fibonaci(4))

  //______________________________________________________

  //

}