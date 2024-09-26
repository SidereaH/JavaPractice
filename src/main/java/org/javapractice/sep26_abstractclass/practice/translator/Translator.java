package org.javapractice.sep26_abstractclass.practice.translator;

public abstract class Translator {
    private String languageFrom;
    private String languageTo;

    public abstract void translate();

    public abstract String getLanguage();

    public abstract void setLanguage(String languages);

    public abstract String  getLanguageTo();

    public abstract void setLanguageTo(String languageTo);

    public abstract void presentation();
}
