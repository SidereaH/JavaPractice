package org.javapractice.sep26_abstractclass.practice.translator;

public class EnglishTranslator extends  Translator{
    private String languageFrom ="English";
    private String languageTo;
    public EnglishTranslator(String languageTo) {
        this.languageTo = languageTo;
    }

    @Override
    public void translate() {
        System.out.printf("Перевел с %s на %s\n", this.languageFrom, this.languageTo);
//        GoogleAPI.setKey(/* Enter your API key here */);
//
//        String translatedText = Translate.DEFAULT.execute("Bonjour le monde", Language.FRENCH, Language.ENGLISH);
//
//        System.out.println(translatedText);

    }
    public String getLanguage() {
        return this.languageFrom;
    }

    public void setLanguage(String languages) {
        this.languageFrom = languages;
    }

    public String getLanguageTo() {
        return languageTo;
    }

    public void setLanguageTo(String languageTo) {
        this.languageTo = languageTo;
    }

    @Override
    public void presentation() {
        System.out.printf("I am %s translator", languageFrom);
    }

    // Set the Google Translate API key
// See: http://code.google.com/apis/language/translate/v2/getting_started.html




}
