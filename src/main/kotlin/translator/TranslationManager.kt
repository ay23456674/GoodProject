package translator

class TranslationManager {
    private val germanTranslator = GermanTranslator()
    private val englishTranslator = EnglishTranslator()

    fun translate(text: String, translateFrom: Language, translateTo: Language): String {
        return when (translateTo) {
            Language.German -> germanTranslator.translate(text, translateFrom)
            Language.English -> englishTranslator.translate(text, translateFrom)
        }
    }
}