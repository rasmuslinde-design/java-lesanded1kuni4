package iseseisev;

public class Main {
    public static void main(String[] args) {
        // Loo kolm erinevat iseseisev.Question objekti
        Question question1 = new Question(
                1,
                "Which of these is a Java data type?",
                "String",
                "System",
                "Scanner",
                "iseseisev.Main",
                "String"
        );

        Question question2 = new Question(
                2,
                "Which keyword is used to create a class in Java?",
                "class",
                "public",
                "new",
                "void",
                "class"
        );

        Question question3 = new Question(
                3,
                "Which symbol is used for comments in Java?",
                "//",
                "<!-- -->",
                "#",
                "**",
                "//"
        );

        // Kutsu välja iga objekti printInfo() meetod
        question1.printInfo();
        question2.printInfo();
        question3.printInfo();
    }
}