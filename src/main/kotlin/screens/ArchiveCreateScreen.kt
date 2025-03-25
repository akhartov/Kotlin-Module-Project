package screens

class ArchiveCreateScreen(previous: Screen): InputScreen(previous, "Создать архив") {
    override fun perform(app: NotesApplication) {
        val title = userInputLine("Введите имя архива")
        val archive = Archive(title)
        app.archives.put(title, archive)
        app.selectScreen(previous)
    }
}