package pfrClasss1

object ClassList extends App {

  val lista: List[Int] = List(1,2,3,4)
  println(lista)

  println(lista.head)
  println(lista(0))
  println(lista ++ List(5,6,7))
  println(lista.sorted)

  // lista de cadenas
  val listaString: List[String] = List("Runoob", "Google", "Baidu")
  println(listaString)

  // lista de enteros
  val listaEnteros: List[Int] = List(1, 2, 3, 4)
  println(listaEnteros)

  // lista vacía
  val listaVacia: List[Nothing] = List()
  println(listaVacia)

  // Lista bidimensional
  val matriz: List[List[Int]] = List( List(1, 0, 0), List(0, 1, 0), List(0, 0, 1) )
  println(matriz)

  //Otra Forma de Crear Listas

  // lista de cadenas
  val listaString2 = "Runoob" :: ("Google" :: ("Baidu" :: Nil))
  println(listaString2)

  // lista de enteros
  val listaEnteros2 = 1 :: (2 :: (3 :: (4 :: Nil)))
  println(listaEnteros2)

  // lista vacía
  val listaVacia2 = Nil
  println(listaVacia2)

  // Lista bidimensional
  val matriz2 = (1 :: (0 :: (0 :: Nil))) :: (0 :: (1 :: (0 :: Nil))) :: (0 :: (0 :: (1 :: Nil))) :: Nil
  println(matriz2)

  //Operaciones Básicas Fundamentales

  val listaString4 = "Runoob" :: ("Google" :: ("Baidu" :: ("Bing" :: Nil)))
  println(listaString4.head)
  println(listaString4.tail)
  println(listaString4.empty)

  //Lista de conexiones
  var fruDulces: List[String] = List("Uva", "Manzana", "Mandarinas")
  var fruAgrias = "Limon" :: ("Naranjas" :: ("Ciruela" :: Nil))

  var frutas = fruDulces ::: fruAgrias
  println(frutas)

  frutas = fruDulces.:::(fruAgrias)
  println(frutas)

  //metodo fill, llena las veces necesarias con el paràmetro enviado

  val listaString3: List[String] = List.fill(3)("Google")
  println(listaString3)

  val listaEntero3: List[Int] = List.fill(3)(2)
  println(listaEntero3)

  //metodo tabular

  val raizCuadrada = List.tabulate(6)(n => n * n)
  println(raizCuadrada)

  val dupliMatriz = List.tabulate(4,5)( _ * _ )
  println(dupliMatriz)

  //reverso
  println(listaString)
  println(listaString.reverse)

  //Listas en algunos Lenguajes y formas

  println("Create a Scala List:")
  println("Lisp style:")
  val lisp_list = 100 :: 200 :: 300 :: Nil :: 400 :: Nil
  println(lisp_list)
  println("Java style:")
  val nums = List(1,2,3,4,5,6,7)
  println(nums)
  println("Mixed type values in a list:")
  val x = List[Number](100, 200, 110.20, 45d, 0x1)
  println(x)
  println("Range List:")
  val y = List.range(1, 20)
  println(y)
  val z = List.range(0, 30, 3)
  println(z)
  println("Uniform  List:")
  val s = List.fill(5)("Scala")
  println(s)
  val n = List.fill(3)(4)
  println(n)
  println("Tabulate List:")
  val t = List.tabulate(10)(n => n * n * n)
  println(t)

  //Promedio Lita

  def proArrayScala(intArray: List[Int]) =
  {
    val suma = intArray.sum
    val promedio = (suma)/intArray.length
    (promedio)
  }

  val intArrayAgregar = List(1,4,8)
  val promFinal = proArrayScala(intArrayAgregar)
    println(promFinal)


  - metodos de listas fill range
    - Lista(1,2,3,4) promedio de la misma. 
  
}