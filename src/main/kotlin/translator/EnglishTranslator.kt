package translator

class EnglishTranslator : Translator {
        override fun translate(text: String, language: Language): String {
            return "Translate ($text) from ${language.name} to English"
        }
}