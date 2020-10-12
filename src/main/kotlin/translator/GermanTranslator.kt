package translator

class GermanTranslator : Translator {
    override fun translate(text: String, language: Language): String {
        return "Translate ($text) from ${language.name} to German"
    }
}