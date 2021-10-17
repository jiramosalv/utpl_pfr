package pfrClasss1

class Persona(strName: String, val intEdad: Int) {
  def great(strName: String): Unit = println(s"${this.strName} says: Hi, $strName")
    
}