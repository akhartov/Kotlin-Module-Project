package screens

import java.util.Scanner

abstract class InputScreen (previous: Command, name: String): Screen(previous, name) {
    fun userInputLine(header: String): String {
        do {
            try {
                println(header)
                val value = Scanner(System.`in`).nextLine()
                if (value.isEmpty())
                    throw Exception("Текст не может быть пустым")

                if (value.isBlank())
                    throw Exception("Используйте печатные символы")

                return value
            } catch (e: Exception) {
                println(e.message)
            }

        } while(true)
    }
}