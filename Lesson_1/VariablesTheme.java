public class VariablesTheme {

    public static void main(String[] args) {
        System.out.println("1. Вывод значения переменных на консоль\n");
        byte core = 6;
        System.out.println("Количество ядер: " + core);
        short streams = 12;
        System.out.println("Количество потоков: " + streams);
        int cpuLine = 5600;
        System.out.println("Линейка процессора: Ryzen 5 " + cpuLine);
        long memory = 1717986918;
        System.out.println("Количество оперативной памяти в байтах: " + memory);
        float cpuFrequency = 2.30f;
        System.out.println("Частота процессора в Ghz: " + cpuFrequency);
        double cpuFrequency2 = 0.0023d;
        System.out.println("Частота процессора в Gz: " + cpuFrequency2);
        char cpuSeries = 'U';
        System.out.println("Серия процессора: Ryzen 5 5600" + cpuSeries);
        boolean typeSystem = true;
        System.out.println("Тип ситсемы: x64 - " + typeSystem);

        System.out.println("\n2. Расчет стоимости товара со скидкой\n");
        float penPrice = 100.0f;
        float bookPrice = 200.0f;
        float discountPercent = 0.11f; // Перевод скидки из процентов в целое число
        float sumGoods = penPrice + bookPrice;
        int sumDiscount = (int) (sumGoods * discountPercent);
        System.out.println("Сумма скидки: " + sumDiscount + " руб");
        int result = (int) (sumGoods - sumDiscount);
        System.out.println("Общая стоимость товаров со скидкой: " + result + " руб");

        System.out.println("\n3. Вывод слова JAVA\n");
        System.out.println("   " + "J" + "    " + "a" + "  " + "v" + "     " + "v" + "  " + "a");
        System.out.println("   "  + "J" + "   "  + "a" + " " + "a"+ "  "  + "v"+ "   "  + "v" + "  "  + "a" + " " + "a");
        System.out.println("J" + "  " + "J" + "  " + "a" + "a" + "a" + "a" + "a" + "  "  + "V" + " " + "V" + "  " + "a" + "a" + "a" + "a" + "a");
        System.out.println(" " + "J" + "J" + "  " + "a" + "     " + "a" + "  " + "V" + "  " + "a" + "     " + "a");

         System.out.println("\n4. Отображение min и max значений числовых типов данных\n");
        byte maxByte = 127;
        short maxShort = 32767;
        int maxInt = 2147483647;
        long maxLong = 9223372036854775807L;
        System.out.println("Первоначальные значения целочисленных переменных:\n" +
                "\tbyte: " + maxByte + "; short: " + maxShort + "; int: "
                + maxInt + "; long: " + maxLong);
        System.out.println("Значения целочисленных переменных после инкремента:\n" +
                "\tbyte: " + ++maxByte + "; short: " + ++maxShort + "; int: " +
                ++maxInt + "; long: " + ++maxLong);
        System.out.println("Значения целочисленных переменных после декремента:\n" +
                "\tbyte: " + --maxByte + "; short: " + --maxShort + "; int: " +
                --maxInt + "; long: " + --maxLong);

        System.out.println("\n5. Перестановка значений переменных");
        int num1 = 2;
        int num2 = 5;
        System.out.println("\nПерестановка с помощью третьей переменной");
        System.out.println("Исходные значения переменных: num1=" + num1 + ", num2=" + num2);
        int num3 = num1;
        num1 = num2;
        num2 = num3;
        System.out.println("Значения переменных после перестановки: num1=" + num1 + ", num2=" + num2);
        System.out.println("\nПерестановка с помощью арифметических операций");
        System.out.println("Исходные значения переменных: num1=" + num1 + ", num2=" + num2);
        num1 += num2;
        num2 = num1 - num2;
        num1 -= num2;
        System.out.println("Значения переменных после перестановки: num1=" + num1 + ", num2=" + num2);
        System.out.println("\nПерестановка с помощью побитовой операции ^");
        System.out.println("Исходные значения переменных: num1=" + num1 + ", num2=" + num2);
        num1 ^= num2;
        num2 ^= num1;
        num1 ^= num2;
        System.out.println("Значения переменных после перестановки: num1=" + num1 + ", num2=" + num2);

        System.out.println("\n6. Вывод символов и их кодов\n");
        char ch1 = '#';
        System.out.println((int) ch1 + " " + ch1);
        char ch2 = '&';
        System.out.println((int) ch2 + " " + ch2);
        char ch3 = '@';
        System.out.println((int) ch3 + " " + ch3);
        char ch4 = '^';
        System.out.println((int) ch4 + " " + ch4);
        char ch5 = '_';
        System.out.println((int) ch5 + " " + ch5);

        System.out.println("\n7. Вывод количества сотен, десятков и единиц числа\n");
        int num = 123;
        System.out.println("Число N содержит: ");
        System.out.println(num / 100 + " сотен");
        System.out.println(num / 10 % 10 + " десятков");
        System.out.println(num % 10 + " единиц");

        System.out.println("\n8. Вывод в консоль ASCII-арт Дюка\n");
        char slash = '/';
        char underScore = '_';
        char leftParentheses = '(';
        char rightParentheses = ')';
        char backSlash = '\\';
        System.out.println("     " + slash + backSlash + "     ");
        System.out.println("    " + slash + "  " + backSlash + "    ");
        System.out.println("   " + slash + underScore + leftParentheses + " " + rightParentheses + backSlash + "   ");
        System.out.println("  " + slash + "      " + backSlash + "  ");
        System.out.println(" " + slash + underScore + underScore + underScore + underScore + slash + 
            backSlash + underScore + underScore + backSlash + " ");

        System.out.println("\n9. Вывод произведения и суммы цифр числа\n");
        int num4 = 345;
        int hundreds = num4 / 100;
        int tens = num4 / 10 % 10;
        int ones = num4 % 10;
        int sumDigits = hundreds + tens + ones;
        int multiDigits = hundreds * tens * ones;
        System.out.println("Сумма цифр числа "+ num4 + " = " + sumDigits);
        System.out.println("Их произведение = " + multiDigits);

        System.out.println("\n10. Вывод времени\n");
        int totalSeconds = 86399;
        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;
        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}