//ColorType.kt
import java.util.*

enum class ColorType(val rgb: String, val number:Int) {

    RED("255, 0, 0", 1),
    ORANGE("255, 127, 0", 2),
    YELLOW("255, 255, 0", 3),
    GREEN("0, 255, 0", 4),
    BLUE("0, 0, 255", 5),
    INDOGO("75, 0, 130", 6),
    VIOLET("143, 0, 255", 7);

    fun colot_list_info() : List<ColorType>{
        println("Вот все возможные цвета, которые добавлены в программу")
        return  values().toList()
    }

    fun rgb_color(){
        println("Введите номер цвета и узнайте как он защифрован в ргб")
        println("1 - красный\n2 - оранжевый\n3 - желтый\n4- зеленый\n5- синий\n6-голубой\n7-фиолетовый")

        try {
            val number :Int = readln()!!.toInt()
            when(number){
                1 -> println(RED.rgb)
                2 -> println(ORANGE.rgb)
                3 -> println(YELLOW.rgb)
                4 -> println(GREEN.rgb)
                5 -> println(BLUE.rgb)
                6 -> println(INDOGO.rgb)
                7 -> println(VIOLET.rgb)
                else -> println("Такого цвета нет")
            }
        }
        catch (e: NumberFormatException){
            println("Необходимо ввести число")
        }

    }

    fun game (){
        val color : ColorType = values().random()
        val anwers = color.number
        println("Каким по счету в радуге является этот $color цвет?")
        try {
            val player :Int = readln()!!.toInt()
            if(player == anwers) println("Правильно!")
            else println("Вы ответили неверно. Этот цвет $anwers по счете в радуге")
        }
        catch (e: NumberFormatException){
            println("Необходимо ввести число")
        }
    }

    fun random_color(){
        println("Рандомный цвет: ${values().random()}")
    }

}