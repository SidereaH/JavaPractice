package org.javapractice.sep5.programmer;

public class Programmer {
    private String name;
    private String lang;
    private String about;
    public Programmer (String lang){
        this.name = "empty";
        this.lang = lang;
        this.about = "empty";
    }
    public Programmer(String name, String lang){
        this.name = name;
        this.lang = lang;
        this.about = "empty";
    }
    public Programmer(String name, String lang, String about){
        this.name = name;
        this.lang = lang;
        this.about = about;
    }

    @Override
    public String toString(){
        return String.format("""
                Name: %s,
                Language: %s.
                About: %s.
                """, this.name, this.lang, this.about);
    }
    public static void main(String[] args) {
        var prog1 = new Programmer("Java");
        var ivan = new Programmer("Иван", "Python");
        var nikita = new Programmer("Никита", "JavaScript", "пишет сайты");
        System.out.println(prog1 + "\n" + ivan + "\n" + nikita  );
    }
}
