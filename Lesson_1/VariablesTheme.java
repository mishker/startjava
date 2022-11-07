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

        System.out.println("\n4. Вывод min и max значений целых числовых типов\n");
        System.out.println("Переменная - byte\n");
        byte maxByte = 127;
        System.out.println("Первоначальное значение переменной " + maxByte);
        maxByte ++;
        System.out.println("Значение после инкремента: " + maxByte);
        maxByte --;
        System.out.println("Значение после декремента: " + maxByte + '\n');
        System.out.println("Переменная - short\n");
        short maxShort = 32767;
        System.out.println("Первоначальное значение переменной " + maxShort);
        maxShort ++;
        System.out.println("Значение после инкремента: " + maxShort);
        maxShort --;
        System.out.println("Значение после декремента: " + maxShort + '\n');
        System.out.println("Переменная - int\n");
        int maxInt = 2147483647;
        System.out.println("Первоначальное значение переменной " + maxInt);
        maxInt ++;
        System.out.println("Значение после инкремента: " + maxInt);
        maxInt --;
        System.out.println("Значение после декремента: " + maxInt + '\n');
        System.out.println("Переменная - long\n");
        long maxLong = 9223372036854775807L;
        System.out.println("Первоначальное значение переменной " + maxLong);
        maxLong ++;
        System.out.println("Значение после инкремента: " + maxLong);
        maxLong --;
        System.out.println("Значение после декремента: " + maxLong + '\n');

        System.out.println("\n5. Перестановка значений переменных\n");
        System.out.println("С помощью третьей переменной\n");
        int num5 = 2;
        int num6 = 5;
        System.out.println("Исходные значения переменных: " + num5 + " " + num6);
        int num7 = num5;
        num5 = num6;
        num6 = num7;
        System.out.println("Новые значения переменных: " + num5 + " " + num6 + '\n');
        System.out.println("С помощью арифметических операций\n");
        int num8 = 2;
        int num9 = 5;
        System.out.println("Исходные значения переменных: " + num8 + " " + num9);
        num8 = num8 + num9;
        num9 = num8 - num9;
        num8 = num8 - num9;
        System.out.println("Новые значения переменных: " + num8 + " " + num9 + '\n');
        System.out.println("С помощью побитовой операции\n");
        int num10 = 2;
        int num11 = 5;
        System.out.println("Исходные значения переменных: " + num10 + " " + num11);
        num10 = num10 ^ num11;
        num11 = num10 ^ num11;
        num10 = num10 ^ num11;
        System.out.println("Новые значения переменных: " + num10 + " " + num11 + '\n');

        System.out.println("\n6. Вывод символов и их кодов\n");
        char nums1 = '#';
        System.out.println((int) nums1 + " " + nums1);
        char nums2 = '&';
        System.out.println((int) nums2 + " " + nums2);
        char nums3 = '@';
        System.out.println((int) nums3 + " " + nums3);
        char nums4 = '^';
        System.out.println((int) nums4 + " " + nums4);
        char nums5 = '_';
        System.out.println((int) nums5 + " " + nums5);

        System.out.println("\n7. Вывод количества сотен, десятков и единиц числа\n");
        int num = 123;
        System.out.println("Число N содержит: ");
        System.out.println(num / 100 + " сотен");
        System.out.println(num / 10 % 10 + " десятков");
        System.out.println(num % 10 + " единиц");

        System.out.println("\n8. Вывод в консоль ASCII-арт Дюка\n");
        char forwardSlash = '/';
        char underScore = '_';
        char leftParentheses = '(';
        char rightParentheses = ')';
        char backwardSlash = '\\';
        System.out.println("     " + forwardSlash + backwardSlash + "     ");
        System.out.println("    " + forwardSlash + "  " + backwardSlash + "    ");
        System.out.println("   " + forwardSlash + underScore + leftParentheses + " " + rightParentheses + backwardSlash + "   ");
        System.out.println("  " + forwardSlash + "      " + backwardSlash + "  ");
        System.out.println(" " + forwardSlash + underScore + underScore + underScore + underScore + forwardSlash + backwardSlash + underScore + underScore + backwardSlash + ' ');

        System.out.println("\n9. Вывод произведения и суммы цифр числа\n");
        int nums6 = 345;
        int hundreds = nums6 / 100;
        int tens = nums6 / 10 % 10;
        int ones = nums6 % 10;
        int sumDigits = hundreds + tens + ones;
        int multiDigits = hundreds * tens * ones;
        System.out.println("Сумма цифр числа "+ nums6 + " = " + sumDigits);
        System.out.println("Их произведение = " + multiDigits);

        System.out.println("\n10. Вывод времени\n");
        int totalSeconds= 86399;
        int totalHours = totalSeconds / 3600;
        int totalMinutes = totalSeconds / 60;
        System.out.println(totalHours + ":" + totalMinutes + ":" + totalSeconds);
    }
}