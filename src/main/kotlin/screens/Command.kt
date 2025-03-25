package screens

abstract class Command(val name: String) {
    abstract fun perform(app: NotesApplication)

    companion object {
        val Exit = object : Command("Выход") {
            override fun perform(app: NotesApplication) {
                app.selectScreen(this)
            }
        }
    }
}