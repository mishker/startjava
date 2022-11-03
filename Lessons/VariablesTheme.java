public class VariablesTheme {

    public static void main(String[] args) {
        System.out.println("1. Вывод значения переменных на консоль\n");
        byte core = 6;
        System.out.println("Количество ядер: " + core);
        short streams = 12;
        System.out.println("Количество потоков: " + streams);
        int processorLine = 5600;
        System.out.println("Линейка процессора: Ryzen 5 " + processorLine);
        long memory = 1717986918;
        System.out.println("Количество оперативной памяти в байтах: " + memory);
        float processorFrequency = 2.30f;
        System.out.println("Частота процессора в Ghz: " + processorFrequency);
        double processorFrequency2 = 0.0023d;
        System.out.println("Частота процессора в Gz: " + processorFrequency2);
        char processorSeries = 'U';
        System.out.println("Серия процессора: Ryzen 5 5600" + processorSeries);
        boolean typeSystem = true;
        System.out.println("Тип ситсемы: x64 - " + typeSystem);

        System.out.println("\n2. Расчет стоимости товара со скидкой\n");
        float penPrice = 100.0f;
        float bookPrice = 200.0f;
        float discount2 = 0.11f; // Перевод скидки из процентов в целое число
        float sumThings = penPrice + bookPrice;
        float sumDiscount = sumThings * discount2;
        int sumDiscount1 = (int) sumDiscount;
        System.out.println("Сумма скидки: " + sumDiscount1 + " руб");
        float result = sumThings - sumDiscount;
        int result1 = (int) result;
        System.out.println("Общая стоимость товаров со скидкой: " + result1 + " руб");

        System.out.println("\n3. Вывод слова JAVA\n");
        System.out.println("   " + "J" + "    " + "a" + "  " + "v" + "     " + "v" + "  " + "a");
        System.out.println("   "  + "J" + "   "  + "a" + " " + "a"+ "  "  + "v"+ "   "  + "v" + "  "  + "a" + " " + "a");
        System.out.println("J" + "  " + "J" + "  " + "a" + "a" + "a" + "a" + "a" + "  "  + "V" + " " + "V" + "  " + "a" + "a" + "a" + "a" + "a");
        System.out.println(" " + "J" + "J" + "  " + "a" + "     " + "a" + "  " + "V" + "  " + "a" + "     " + "a");

        System.out.println("\n4. Вывод min и max значений целых числовых типов\n");
        System.out.println("Переменная - byte\n");
        byte num1 = 127;
        System.out.println("Первоначальное значение переменной " + num1);
        num1 += 1;
        System.out.println("Значение после инкремента: " + num1);
        byte numFirst = 127;
        numFirst -= 1;
        System.out.println("Значение после декремента: " + numFirst + '\n');
        System.out.println("Переменная - short\n");
        short num2 = 32767;
        System.out.println("Первоначальное значение переменной " + num2);
        num2 += 1;
        System.out.println("Значение после инкремента: " + num2);
        short numSecond = 32767;
        numSecond -= 1;
        System.out.println("Значение после декремента: " + numSecond + '\n');
        System.out.println("Переменная - int\n");
        int num3 = 2147483647;
        System.out.println("Первоначальное значение переменной " + num3);
        num3 += 1;
        System.out.println("Значение после инкремента: " + num3);
        int numThird = 2147483647;
        numThird -= 1;
        System.out.println("Значение после декремента: " + numThird + '\n');
        System.out.println("Переменная - long\n");
        long num4 = 9223372036854775807L;
        System.out.println("Первоначальное значение переменной " + num4);
        num4 += 1;
        System.out.println("Значение после инкремента: " + num4);
        long numFourth = 9223372036854775807L;
        numFourth -= 1;
        System.out.println("Значение после декремента: " + numFourth + '\n');

        System.out.println("\n5. Перестановка значений переменных\n");
        System.out.println("С помощью третьей переменной\n");
        int number1 = 2;
        int number2 = 5;
        System.out.println("Исходные значения переменных: " + number1 + " " + number2);
        int number3;
        number3 = number1;
        number1 = number2;
        number2 = number3;
        System.out.println("Новые значения переменных: " + number1 + " " + number2 + '\n');
        System.out.println("С помощью арифметических операций\n");
        int y1 = 2;
        int y2 = 5;
        System.out.println("Исходные значения переменных: " + y1 + " " + y2);
        y1 +=3 ;
        y2 -= 3;
        System.out.println("Новые значения переменных: " + y1 + " " + y2 + '\n');
        System.out.println("С помощью побитовой операции\n");
        int x = 2;
        int y = 5;
        System.out.println("Исходные значения переменных: " + x + " " + y);
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
        System.out.println("Новые значения переменных: " + x + " " + y + '\n');

        System.out.println("\n6. Вывод символов и их кодов\n");
        char u = '#';
        int u1 = (int) u;
        System.out.println(u1 + " " + u);
        char b = '&';
        int b1 = (int) b;
        System.out.println(b1 + " " + b);
        char k = '@';
        int k1 = (int) k;
        System.out.println(k1 + " " + k);
        char m = '^';
        int m1 = (int) m;
        System.out.println(m1 + " " + m);
        char r = '_';
        int r1 = (int) r;
        System.out.println(r1 + " " + r);

        System.out.println("\n7. Вывод количества сотен, десятков и единиц числа\n");
        int num = 123;
        System.out.println("Число N содержит: ");
        System.out.println(num / 100 + " сотен");
        System.out.println(num / 10 % 10 + " десятков");
        System.out.println(num % 10 + " единиц");

        System.out.println("\n8. Вывод в консоль ASCII-арт Дюка");
        char v1 = '/';
        char v2 = '_';
        char v3 = '(';
        char v4 = ')';
        char v5 = '\\';
        System.out.println("     " + v1 + v5 + "     ");
        System.out.println("    " + v1 + "  " + v5 + "    ");
        System.out.println("   " + v1 + v2 + v3 + " " + v4 + v5 + "   ");
        System.out.println("  " + v1 + "      " + v5 + "  ");
        System.out.println(" " + v1 + v2 + v2 + v2 + v2 + v1 + v5 + v2 + v2 + v5 + ' ');

        System.out.println("\n9. Вывод произведения и суммы цифр числа");
        int c = 345;
        int hundreds = c / 100;
        int tens = c / 10 % 10;
        int units = c % 10;
        int sum = hundreds + tens + units;
        int multi = hundreds * tens * units;
        System.out.println("их произведение = " + multi);
        System.out.println("их сумма = " + sum);

        System.out.println("\n10. Вывод времени\n");
        int sec = 86399;
        double hour = sec / 3600.0;
        int hours = (int) Math.round(hour);
        double minute = sec / 60.0;
        int minutes = (int) Math.round(minute);
        System.out.println(hours + ":" + minutes + ":" + sec);
    }
}