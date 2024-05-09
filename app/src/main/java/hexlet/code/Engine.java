package hexlet.code;

import hexlet.code.games.Games;
import hexlet.code.games.Calc;

public class Engine {
    private String description;
    private int number1;
    private int number2;
    private String expression;
    private int result;
    private boolean isCorrect;
    private int[] numbers;
    public Engine() {

    }
    //конструктор для данных калькулятора, НОД
    public Engine(String description, String expression, int result){
        this.description = description;
        this.expression = expression;
        this.result = result;
    }
    //конструктор для игры в чет/нечет,постое число
    Engine(String description, int number1, boolean isCorrect){
        this.description = description;
        this.number1 = number1;
        this.isCorrect = isCorrect;
    }
    //конструктор для игры в прогрессию
    Engine(String description, int[] numbers, int step){
        this.description = description;
        this.numbers = numbers;
        this.result = step;
    }

    public static void runGame(Engine eng) {

        int tryCount = 3;
        // Cli client = new Cli();
        String nameClient = Cli.askUserName();
        //client.setName(nameClient);
        //System.out.println(game.getDescription());

        System.out.println(getData(eng,true));
        String sucessMessage = "Congratulations, " + nameClient + "!";
        String failureMessage = "Let's try again, " + nameClient + "!";
        boolean isWin = false;

        System.out.println(isWin ? sucessMessage : failureMessage);
    }



    public static String getData(Engine eng, boolean showDescription ) {

            String message = (showDescription ? eng.getDescription() + "\n" : "") +
                    "Question : " + eng.getExpression() + " testre" + eng.getResult();
            return message;
    }



    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public boolean isCorrect() {
        return isCorrect;
    }

    public void setCorrect(boolean correct) {
        isCorrect = correct;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }




}
