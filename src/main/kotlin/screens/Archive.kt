package screens

class Archive(val name: String) {
    val items = mutableMapOf<String, Note>()

    fun add(title: String, note: Note) {
        items.put(title, note)
    }
}