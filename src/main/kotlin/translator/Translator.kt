package translator

interface Translator {
    fun translate(text: String, language: Language): String
}