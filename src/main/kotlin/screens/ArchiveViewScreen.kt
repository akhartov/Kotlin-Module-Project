package screens

class ArchiveViewScreen(previous: Screen, val archive: Archive): ItemSelectionScreen(previous, archive.name) {

    fun createItems(): List<Command> {
        val items = mutableListOf<Command>()
        items.add(NoteCreateScreen(this, archive))
        archive.items.forEach { name, note ->
            items.add(NoteViewScreen(this, name, note))
        }

        items.add(Back(previous))

        return items
    }

    override fun perform(app: NotesApplication) {
        val items = createItems()
        selectItem(app, items)
    }

    override fun getTitle(): String {
        return "Заметки архива '${archive.name}'"
    }
}