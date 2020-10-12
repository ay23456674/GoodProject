import translator.Language
import translator.TranslationManager

fun main() {
    val translationManager = TranslationManager()
    println(translationManager.translate("Some text", Language.English, Language.German))
}