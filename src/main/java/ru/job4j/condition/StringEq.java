package ru.job4j.condition;

public class StringEq {
    public static void main(String[] args) {
        String first = new String("one");
        String one = new String("one");
        /* Так как мы сдесь пытаемся сравнить ссылочные типы, то в первом варианте у нас false */
        if (first == one) {
            System.out.println("first equals one");
        } else {
            System.out.println("first does not equal one");
        }
        if (first.equals(one)) {
            System.out.println("first equals one");
        } else {
            System.out.println("first does not equal one");
        }
        /* Здесь ниже приведено правильное разположение элементов при проверке. Ниже приведено более подробное объяснение */
        if ("one".equals(one)) {
            System.out.println("first equals one");
        } else {
            System.out.println("first does not equal one");
        }
        /* Кроме того, необходимо отметить особенность при сравнении строк.
        Хотя результаты сравнения name.equals("Вася") и "Вася".equals(name) в целом идентичны,
        в случае первого варианта возможен выброс исключения NullPointerException и остановка программы
        если переменная name окажется незаданной (будет равняться null).
        В случае же второго способа если переменная name окажется равной null,
        метод equals вернёт false, что соответствует обычной человеческой логике. */
    }
}