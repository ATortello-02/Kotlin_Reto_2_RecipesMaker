fun main(args: Array<String>)
{
//  Aquí defino el menú a mostrar
    val menu_principal: String = """
    :: Bienvenido a Recipe Maker ::
    
    Selecciona la opción deseada
    1. Hacer una receta
    2. Ver mis recetas
    3. Salir
    
  """.trimIndent()

//  Aquí defino la variable que guardará la respuesta del usuario
    var responseMenu:String?
    var r:String? = ""

//  Definición de Cantidad de Recetas (Rango)
    //val noRecetas: IntRange = 1..3
    var i:Int = 0

//  Con el do while muestro el menú y recibo del usuario la opción a manejar
    do
    {
//  Aquí muestro el menú
        println(menu_principal)
        responseMenu = readLine()

        if (responseMenu!!.equals("1"))
        { /*println("Opción $responseMenu seleccionada")*/
           r = makeRecipe()
        }
        else if (responseMenu.equals("2"))
        { /*println("Opción $responseMenu seleccionada")*/
            viewRecipe(r)
        }

    }while (responseMenu!! != "3") //Salida del ciclo
    println("Opción $responseMenu seleccionada: Saliendo de programa...")
}

fun makeRecipe(): String?
{
//  Declaro la lista de ingredientes y recetas
val ingredientes: List<String> = listOf<String>("Agua", "Leche", "Carne", "Verduras", "Frutas", "Cereal", "Huevos", "Aceite")

//  Aquí defino la variable que guardará la respuesta del usuario
var responseIngr:String?

val menu_makeRecipe: String = """
    Hacer receta
    Selecciona por categoría el ingrediente que buscas
    1. Agua
    2. Leche
    3. Carne
    4. Verduras
    5. Frutas
    6. Cereal
    7. Huevos
    8. Aceites
    
  """.trimIndent()

    var receta:String = ""

//  Imprimo el menú
    println(menu_makeRecipe)
    responseIngr = readLine()

    when (responseIngr!!.toInt())
    {
        1 -> receta += "Agua\n"
        2 -> receta += "Leche\n"
        3 -> receta += "Carne\n"
        4 -> receta += "Verduras\n"
        5 -> receta += "Frutas\n"
        6 -> receta += "Cereal\n"
        7 -> receta += "Huevos\n"
        8 -> receta += "Aceites\n"
        else -> println("\nÉsta opción no existe")
    }
    return receta
}

fun viewRecipe(receta: String?)
{
    println("La categoría seleccionada es: $receta")
}