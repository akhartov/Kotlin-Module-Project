package screens

class NoteCreateScreen(previous: Screen, val archive: Archive): InputScreen(previous, "Создать заметку") {
    override fun perform(app: NotesApplication) {
        val title = userInputLine("Введите название заметки")
        val text = userInputLine("Введите содержимое заметки")
        archive.add(title, Note(title, text))
        app.selectScreen(previous)
    }
}