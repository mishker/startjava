public class ifElseStatementTheme {

    public static void main(String[] args) {
        System.out.println("1. Перевод псевдокода на язык Java\n");
        int age = 18;
        String gender = "женский";
        float height = 1.82f;
        char firstLetter;
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
        firstLetter = "Mikhail".charAt(0);
        if (firstLetter == 'M') {
            System.out.println("Вас зовут Михаил");
        } else if (firstLetter == 'I') {
            System.out.println("Вас зовут Игорь");
        } else {
            System.out.println("Вас зовут не Михаил и не Игорь");
        }

        System.out.println("\n2. Поиск max и min числа\n");
        int num1 = 25;
        int num2 = 50;
        if (num2 > num1) {
            System.out.println("max:" + num2 + '\t' + "min:" + num1);
        } else if (num1 > num2) {
            System.out.println("max: " + num1 + '\t' + "min" + num2);
        } else {
            System.out.println("Числа равны");
        }

        System.out.println("\n3. Работа с числом\n");
        int num = 56;
        if (num == 0) {
            System.out.println("Число является 0");
        } else {
        if (num % 2 == 0) {
            System.out.println("Число чётное");
        } else {
            System.out.println("Число нечётное");
        }
        if (num > 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

        System.out.println("\n4. Поиск одинаковых цифр в числах\n");
        int num3 = 526;
        int num4 = 126;
        int hundredsNum3 = num3 / 100;
        int tensNum3 = num3 / 10 % 10;
        int onesNum3 = num3 % 10;
        int hundredsNum4 = num4 / 100;
        int tensNum4 = num4 / 10 % 10;
        int onesNum4 = num4 % 10;
        if (hundredsNum3 == hundredsNum4) {
            System.out.println("Найдены одниаковые цифры в 1 разряде: " + hundredsNum3 + " = " + hundredsNum4);
        }
        if (tensNum3 == tensNum4) {
            System.out.println("Найдены одинаковые цифры во 2 разряде: " + tensNum3 + " = " + tensNum4);
        }
        if (onesNum3 == onesNum4) {
            System.out.println("Найдены одинаковые цифры в 3 разряде: " + onesNum3 + " = " + onesNum4);
        }

        System.out.println("\n5. Определение буквы, числа или символа по их коду\n");
        char somechar = '\u0057';
        if (somechar >= 'a' && somechar <= 'z') {
            System.out.println("Маленькая буква: " + somechar);
        } else if (somechar >= 'A' && somechar <= 'Z') {
            System.out.println("Большая буква: " + somechar);
        } else if (somechar >= 0 && somechar <= 9) {
            System.out.println("Число: " + somechar);
        } else {
            System.out.println("Не буква и не число");
        }

        System.out.println("\n6. Определение суммы вклада и начисленных банком %\n");
        int contribution = 300000;
        int contributionPercent;
        System.out.println("Сумма вклада = " + contribution + " рублей");
        if (contribution < 100000) {
            int sumPercent1 = 5;
            contributionPercent = (int) ((contribution * sumPercent1) / 100);
            System.out.println("Начисленный процент = " + sumPercent1 + "%");
            System.out.println("Итоговая сумма = " + (contribution + contributionPercent) + " рублей");
        } else if (100000 <= contribution && contribution <= 300000) {
            int sumPercent2 = 7;
            contributionPercent = (int) ((contribution * sumPercent2) / 100);
            System.out.println("Начисленный процент = " + sumPercent2 + "%");
            System.out.println("Итоговая сумма = " + (contribution + contributionPercent) + " рублей");
        } else if (contribution > 300000) { 
            int sumPercent3 = 10;
            contributionPercent = (int) ((contribution * sumPercent3) / 100);
            System.out.println("Начисленный процент = " + sumPercent3 + "%");
            System.out.println("Итоговая сумма = " + (contribution + contributionPercent) + " рублей");
        }

        System.out.println("\n7. Определение оценки по предметам\n");
        int percentHistory = 59;
        int percentProgramming = 91;
        int scoreHistory;
        int scoreProgramming;
        if (percentHistory > 91) {
            scoreHistory = 5;
        } else if (percentHistory > 73) {
            scoreHistory = 4;
        } else if (percentHistory > 60) {
            scoreHistory = 3;
        } else {
            scoreHistory = 2;
        }
        if (percentProgramming > 91) {
            scoreProgramming = 5;
        } else if (percentProgramming > 73) {
            scoreProgramming = 4;
        } else if (percentProgramming > 60) {
            scoreProgramming = 3;
        } else {
            scoreProgramming = 2;
        }
        System.out.println(scoreHistory + " - История");
        System.out.println(scoreProgramming + " - Программирование");
        System.out.println("Средний балл оценок по предметам = " + ((scoreHistory + scoreProgramming) /2));
        System.out.println("Средний % по предметам = " + ((percentHistory + percentProgramming) / 2));

        System.out.println("\n8. Расчёт прибыли\n");
        int costGoods = 9000;
        int salesPerMonth = 13000;
        int rentPricePerMonth = 5000;
        int profitPerYear = (13000 - 5000 - 9000) * 12;
        if (profitPerYear > 0) {
            System.out.println("Прибыль за год: +" + profitPerYear + " рублей\n");
        } else {
            System.out.println("Прибыль за год: " + profitPerYear + " рублей\n");
        }

        System.out.println("\n9. Подсчёт количества банкнот\n");
        int sum = 567;
        int maxBanknote100 = 10;
        int maxBanknote10 = 5;
        int maxBanknote1 = 50;
        int requiredBanknote100 = sum / 100;
        int requiredBanknote10 = sum / 10 % 10;
        int requiredBanknote1 = sum % 10;
        if (requiredBanknote10 > maxBanknote10) {
            requiredBanknote1 += (requiredBanknote10 - maxBanknote10) * 10;
            requiredBanknote10 = maxBanknote10;
        }
        System.out.print("Требуемое количество банкнот: ");
        System.out.print(" 100(" + requiredBanknote100 + ")" +
            '\t' + "10(" + requiredBanknote10 + ")" + 
            '\t' + "1(" + requiredBanknote1 + ")");
        System.out.println("\nПосчитанная исходная сумма: " + 
            ((100 * requiredBanknote100) + (10 * requiredBanknote10) + (requiredBanknote1)));
}
}
