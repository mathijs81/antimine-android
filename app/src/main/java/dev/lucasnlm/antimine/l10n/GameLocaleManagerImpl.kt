package dev.lucasnlm.antimine.l10n

import androidx.appcompat.app.AppCompatDelegate
import androidx.core.os.LocaleListCompat
import dev.lucasnlm.antimine.preferences.PreferencesRepository
import java.util.*

class GameLocaleManagerImpl(
    private val preferencesRepository: PreferencesRepository,
) : GameLocaleManager {
    override fun getAllGameLocaleTags(): List<String> {
        return listOf(
            "af", "ar", "bg", "ca", "cs", "da", "de", "el", "en", "eo", "es", "fa", "fi", "fr", "hi", "hu",
            "in", "it", "iw", "ja", "ko", "ku", "it", "lv", "nl", "no", "pl", "pt-PT", "pt-BR", "ro", "ru",
            "si", "sk", "sl", "sv", "ta", "th", "tr", "uk", "vec", "vi", "zh",
        ).distinct()
    }

    override fun setGameLocale(tag: String) {
        preferencesRepository.setPreferredLocale(tag)
    }

    override fun getGameLocale(): Locale? {
        return preferencesRepository.getPreferredLocale()?.let { tag ->
            Locale.Builder().setLanguageTag(tag).build()
        }
    }

    override fun applyPreferredLocaleIfNeeded() {
        preferencesRepository.getPreferredLocale()?.let { tag ->
            val appLocale: LocaleListCompat = LocaleListCompat.forLanguageTags(tag)
            AppCompatDelegate.setApplicationLocales(appLocale)
        }
    }
}
