public class HomeWork {


    public static void main(String[] args) {

        int minValue = Integer.MIN_VALUE;
        int maxValue = Integer.MAX_VALUE;

        int i = 150;
        double d = 25.5;

        // Проверка переполнения при вычислениях
        System.out.println("Проверка переполнения при вычислениях");
        System.out.println("Минимальное значение Integer: " + minValue);
        System.out.println("Максимальное значение Integer: " + maxValue);

        System.out.println("Вычитаем от минимального значени 1: " + (minValue - 1));
        System.out.println("Прибавляем к максимальному значению 1: " + (maxValue + 1));

        // Вычисления комбинаций типов данных (int и double)
        System.out.println("Вычисления комбинаций типов данных (int и double)");
        System.out.println("int = " + i + " double = " + d);
        System.out.println("Сложение int & double: " + (i+d));
        System.out.println("Вычитание int & double: " + (i-d));
        System.out.println("Умножение int & double: " + (i*d));
        System.out.println("Деление int & double: " + (i/d));

    }
}
