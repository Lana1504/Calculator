package Calculator;

public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get ();

        int a = calc.plus.apply (1, 2);
        int b = calc.minus.apply (1, 1);
        int c = calc.devide.apply (a, b);
        //Ошибка, на 0 делить нельзя
        // Надо поправить переменную devide, класс Calculator
        calc.println.accept (c);


    }
}
