package screens

import java.util.Scanner

abstract class ItemSelectionScreen(previous: Command, name: String): Screen(previous, name) {
    fun selectItem(app: NotesApplication, items: List<Command>) {
        val scanner = Scanner(System.`in`)
        do {
            println(getTitle())
            items.forEachIndexed { index, value ->
                println("${index}. ${value.name}")
            }
            println("Введите число от 0 до ${items.size - 1}")
            if(scanner.hasNextInt()) {
                val menuIndex = scanner.nextInt()
                if(menuIndex < 0)
                    println("Вы ввели слишком маленькое число")
                else if(menuIndex >= items.size)
                    println("Вы ввели слишком большое число")
                else {
                    app.selectScreen(items[menuIndex])
                    break
                }
            } else {
                scanner.next()
                println("Нужно ввести число от 0 до ${items.size - 1}, а не это вот все...")
            }
        } while(true)
    }

    abstract fun getTitle(): String
}