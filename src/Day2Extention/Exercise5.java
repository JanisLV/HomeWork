package Day2Extention;

public class Exercise5 {
    // Cēzara šifrs
    // Uzrakstiet programmu, kas:
    // 1. Prasa lietotājam ievadīt vienu teksta rindiņu, kas sastāv TIKAI NO MAZAJIEM ANGĻU BURTIEM
    // 2. Pārbaudīt, vai rindiņa satur citus simbolus NEVAJAG, pieņemsim, ka rindiņa tiks ievadīta pareizi
    // 3. Katru burtu no oriģinālās rindiņas NOBĪDA par 3 pozcīcijām alfabetā tālākL
    // a --> d
    // b --> e
    // c --> f
    // ...
    // 4. Bīdot pēdējos 3 alfabēta burtus (x, y, un z), jātgriežas alfabēta sākumā:
    // x --> a
    // y --> b
    // z --> c
    // 5. Rezultātu salīmēt jaunajā rindiņā.
    // Piemēram:
    // abcd --> defg
    // hello --> khoor
    // wwxxyyzz --> zzaabbcc
    //
    // Padomi:
    // 1. Nobīdīt char mainīgo par 3 pozīcijām alfabetā var ar comandu:
    //      c += 3;
    // vai  c = (char)(c + 3)
    // 2. - (mīnuss) arī strādā (nobīda alfabētā atpakaļ)
    // 3. Pārbaudīt vai nobīdītais simbols izkrita aiz alfabeta var ar c >= 'z'
}
