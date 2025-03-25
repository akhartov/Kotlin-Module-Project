package screens

class NotesApplication {
    private var currentScreen = Command.Exit

    var archives = mutableMapOf<String, Archive>()

    fun selectScreen(command: Command) {
        currentScreen = command
    }

    fun start() {
        currentScreen = ArchiveSelectScreen(archives)
        do {
            currentScreen.perform(this)
        } while (currentScreen != Command.Exit)
    }
}