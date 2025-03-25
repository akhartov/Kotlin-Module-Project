package screens

class ArchiveSelectScreen(val archives: Map<String, Archive>): ItemSelectionScreen(Exit, "Список архивов") {

    fun createItems(archives: Map<String, Archive>): List<Command> {
        val items = mutableListOf<Command>()
        items.add(ArchiveCreateScreen(this))
        archives.forEach { name, archive ->
            items.add(ArchiveViewScreen(this, archive))
        }

        items.add(Exit)

        return items
    }

    override fun perform(app: NotesApplication) {
        val items = createItems(archives)
        selectItem(app, items)
    }

    override fun getTitle(): String {
        return "Список архивов (${archives.size})"
    }
}