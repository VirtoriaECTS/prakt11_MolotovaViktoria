//Days.kt
import java.util.*

enum class Days {
    Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;

        fun WorkAndWeekendDays() {
            println("Введите номер дня недели")
            try {
                val number = readLine()!!.toInt()
                when (number) {
                    1 -> println("${Days.Monday} - Рабочий день")
                    2 -> println("${Days.Tuesday} - Рабочий день")
                    3 -> println("${Days.Wednesday} - Рабочий день")
                    4 -> println("${Days.Thursday} - Рабочий день")
                    5 -> println("${Days.Friday} - Рабочий день")
                    6 -> println("${Days.Saturday} - Выходной день")
                    7 -> println("${Days.Sunday} - Выходной день")
                    else -> println("Такого дня недели нет")
                }

            } catch (e: NumberFormatException) {
                println("Необходимо ввести число")
            }
        }

        fun LastDay(day: Days){
            val index = (day.ordinal - 1) % values().size
            if(index > 0){
                println("Предыдущий день: ${values()[index]}")
            }
            else {
                println("Предыдущий день: ${values()[6]}")
            }


        }

        fun RandomDay(): Days {
            println("Случайный день недели:")
            return values().random()
        }

    fun NumberDays() {
        println("Введите номер дня недели")
        try {
            val number = readLine()!!.toInt()
            when (number) {
                1 -> {
                    println(Days.Monday)
                    LastDay(Monday)
                }

                2 -> {
                    println(Days.Tuesday)
                    LastDay(Thursday)
                }

                3 -> {
                    println(Days.Wednesday)
                    LastDay(Wednesday)
                }

                4 -> {
                    println(Days.Thursday)
                    LastDay(Thursday)
                }

                5 -> {
                    println(Days.Friday)
                    LastDay(Friday)
                }

                6 -> {
                    println(Days.Saturday)
                    LastDay(Saturday)
                }

                7 -> {
                    println(Days.Sunday)
                    LastDay(Sunday)
                }
                else -> println("Такого дня недели нет")
            }

        } catch (e: NumberFormatException) {
            println("Необходимо ввести число")
        }
    }

}