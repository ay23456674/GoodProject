import org.junit.Before

import org.junit.Assert.*
import org.junit.Test
import translator.Language
import translator.TranslationManager

class TestTranslationManager {

    @Test
    fun translationManager() {
        val translationManager = TranslationManager()
        assert("Translate (Some text) from English to German" == translationManager.translate("Some text", Language.English, Language.German))
        assert("Translate (überraschung) from German to English" == translationManager.translate("überraschung", Language.German, Language.English))
    }
}