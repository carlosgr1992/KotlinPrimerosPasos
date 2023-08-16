package controller

var clientes = 10
var restaClientes = 5
var nombre = "Carlos"
var miLista = mutableListOf<String>()
        //METODOS
fun sumaNumeros(num1 : Int, num2 : Int) : Int {

    return num1 + num2
}
    //CREAR UNA CLASE PERSONA
class Persona(private val dni : Int, private val nombre : String)

    //CREAR UNA CLASE CON CONSTRUCTORES, EL SEGUNDO CONSTRUCTOR SOLO RECIBE IDCOCHE Y POR DEFECTO PONE QUE SIN COLOR
class Coche(var idCoche : Int, val color : String){
    constructor(idCoche: Int) : this(idCoche,"Sin color especificado")

        fun restaId() : Int{

            idCoche -= 1

            return idCoche
        }
}

fun main() {
        //INSTANCIAR UN OBJETO
    val carlos = Persona(51552182,"Carlos")
    val cocheCarlos = Coche(151251)
    cocheCarlos.restaId()
    println(cocheCarlos.idCoche)
        //INSTANCIAMOS UNA CLASE QUE CREAMOS EN EL MODELO COMO DEBERIA SER
    val persona3 = modelo.Persona("Juanito",515121)

        //Llamar a métodos desde el main
    val resultado = sumaNumeros(clientes, restaClientes)
        //PRINTS
    println("Antes había $clientes, se han ido $restaClientes, por lo que han quedado ${clientes - restaClientes} clientes")
        //PRINTS CON FORMATO
    var numDouble : Double = 5.5
    println(String.format("%.3f",numDouble))

        //condicionales
    if(nombre.equals("CaRlOS", ignoreCase = true)){
        println("Sí señor")
    }
    /*if(nombre == "Carlos"){
        println("siiuuuu")
    }   ESTE NO LO IMPRIMIRIA PORQUE EL == EQUIVALE A EQUALS, NO ES IGNORECASE POR DEFECTO
    */
    miLista.add("Carlos")
    miLista.add("Juan")
        //Mostrar la lista
    for(valor in miLista){
        println(valor)
    }
        //Diccionarios
    var miMapa = mutableMapOf<Int,String>()
    miMapa[1] = "Carlos"
    miMapa.put(8,"Juan")
    miMapa[2] = "Alfredo"

        //Recorrer el diccionario, le meti el sorted porque lo quería ordenado por clave, no por el orden en que se añadieron
    for(valor in miMapa.toSortedMap()){
        println(valor)  //valor.key o valor.value devolvería solo los valores o las claves
    }


}