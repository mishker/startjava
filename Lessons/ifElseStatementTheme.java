public class ifElseStatementTheme {

    public static void main(String[] args) {
        System.out.println("1. Перевод псевдокода на язык Java\n");
        int age = 18;
        String gender = "женский";
        float height = 1.82f;
        char firstletter;
        if (age>20) {
            System.out.println("Вам разрешен проход в клуб");
        } else {
            System.out.println("Вам запрещён проход в клуб");
        }
        if (gender != "мужской") {
            System.out.println("Вы можете работать в этом заведении");
        } else {
            System.out.println("Вы не можете работать в этом заведении");
        }
        if (height < 1.80) {
            System.out.println("Вам запрещён проход на аттракцион");
        } else {
            System.out.println("Вам разрешен проход на аттракцион");
        }
        firstletter = "Mikhail".charAt(0);
        if (firstletter == 'M') {
            System.out.println("Вас зовут Михаил");
        } else if (firstletter == 'I') {
            System.out.println("Вас зовут Игорь");
        } else {
            System.out.println("Введите своё имя");
        }

        System.out.println("\n2. Поиск max и min числа\n");
        int num1 = 25;
        int num2 = 50;
        int max,min;
        if (num2 > num1) {
            max = num2;
            min = num1;
            System.out.println("Максимальное число: " + max);
            System.out.println("Минимальное число: " + min);
        } else if (num1 > num2) {
            max = num1;
            min = num2;
            System.out.println("Максимальное число: " + max);
            System.out.println("Минимальное число: " + min);
        }

        System.out.println("\n3. Работа с числом\n");
        int num = 56;
        if (num == 0) {
            System.out.println("Число является 0");
        } else if (num!=0) {
        if (num % 2 == 0) {
            System.out.println("Число чётное");
        } else {
            System.out.println("Число нечётное");
        }
        if (num % 2!=0) { 
            System.out.println("Число");}
    }
}
}