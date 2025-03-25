package screens

class NoteViewScreen(previous: Screen, title: String, val note: Note): Screen(previous, title) {
    override fun perform(app: NotesApplication) {
        println("Заметка: ${note.title}")
        println("Содержимое: ${note.text}")
        app.selectScreen(previous)
    }
}