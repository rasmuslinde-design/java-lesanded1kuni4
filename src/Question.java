public class Question {
    // Isendiväljad (private)
    private int id;
    private String question;
    private String opt1;
    private String opt2;
    private String opt3;
    private String opt4;
    private String answer;

    // Konstruktor väärtuste määramiseks
    public Question(int id, String question, String opt1, String opt2, String opt3, String opt4, String answer) {
        this.id = id;
        this.question = question;
        this.opt1 = opt1;
        this.opt2 = opt2;
        this.opt3 = opt3;
        this.opt4 = opt4;
        this.answer = answer;
    }

    // Meetod küsimuse info kuvamiseks
    public void printInfo() {
        System.out.println("Question " + id + ": " + question);
        System.out.println("1. " + opt1);
        System.out.println("2. " + opt2);
        System.out.println("3. " + opt3);
        System.out.println("4. " + opt4);
        System.out.println("Correct answer: " + answer);
        System.out.println();
    }
}