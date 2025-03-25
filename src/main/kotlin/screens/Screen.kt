package screens

abstract class Screen(val previous: Command, name: String): Command(name)

class Back(previous: Command): Screen(previous, "Назад") {
    override fun perform(app: NotesApplication) {
        app.selectScreen(previous)
    }
}