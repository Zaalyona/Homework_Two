public class Main {
    public static void main(String[] args) {
        //основные задачи
        //первая
        byte firstVariable = 5;
        short secondVariable = 256;
        int thirdVariable = 1000000;
        long fourthVariable = 20000000000L;

        float fifthVariable = 1.5684F;
        double sixthVariable = 5.87965354D;

        char seventhVariable = 'a';

        boolean eighthVariable = secondVariable < 78;

        System.out.println("Первая переменная = " + firstVariable);
        System.out.println("Вторая переменная = " + secondVariable);
        System.out.println("Третья переменная = " + thirdVariable);
        System.out.println("Четвертая переменная = " + fourthVariable);
        System.out.println("Пятая переменная = " + fifthVariable);
        System.out.println("Шестая переменная = " + sixthVariable);
        System.out.println("Седьмая переменная = " + seventhVariable);
        System.out.println("Восьмая переменная = " + eighthVariable);

        //вторая
        float firstBoxer = 78.2F;
        float secondBoxer = 82.7F;
        float totalWeight = firstBoxer + secondBoxer;
        System.out.println("Общий вес боксёров = " + totalWeight + " кг");
        float differenceWeight = firstBoxer - secondBoxer;
        System.out.println("Разница веса у боксёров = " + Math.abs (differenceWeight) + " кг");

        //третья
        short bananasWeight = 5 * 80;
        short milkWeight = 2 * 105;
        short iceCreamWeight = 2 * 100;
        short eggsWeight = 4 * 70;
        short mixAllProductsWeight = (short) (bananasWeight + milkWeight + iceCreamWeight + eggsWeight);
        System.out.println("Вес чудо-коктейля = " + mixAllProductsWeight + " гр");
        float cocktailWeightKg = (float) mixAllProductsWeight / 1000;
        System.out.println("Вес коктейля в кг = " + cocktailWeightKg + ". Но я б такое есть не стала)");

        //четвёртая
        short droppedWeight = 7 * 1000;
        short droppedWeightInDay = 250;
        short howMuchDays1 = (short) Math.ceil(droppedWeight / droppedWeightInDay);
        System.out.println("Сбрасывая по 250 гр в день, спортсмен похудеет за " + howMuchDays1 + " дней");
        short howMuchDays2 = (short) Math.ceil(droppedWeight / (droppedWeightInDay * 2));
        System.out.println("Сбрасывая по 500 гр в день, спортсмен похудеет за " + howMuchDays2 + " дней");
        short averageDays = (short) ((howMuchDays1 + howMuchDays2) / 2);
        System.out.println("Среднее количество дней похудения = " + averageDays);

        //пятая
        int mashaSalary = 67760;
        int denisSalary = 83690;
        int kristinaSalary = 76230;
        int mashaSalaryIncrease = (int) (mashaSalary * 1.1);
        int denisSalaryIncrease = (int) (denisSalary * 1.1);
        int kristinaSalaryIncrease = (int) (kristinaSalary * 1.1);
        int mashaSalaryDifference = (int) (Math.abs ((mashaSalary * 12) - (mashaSalaryIncrease * 12)));
        int denisSalaryDifference = (int) (Math.abs ((denisSalary * 12) - (denisSalaryIncrease * 12)));
        int kristinaSalaryDifference = (int) (Math.abs ((kristinaSalary * 12) - (kristinaSalaryIncrease * 12)));
        System.out.println("Маша теперь получает " + mashaSalaryIncrease + " рублей. Годовой доход вырос на " + mashaSalaryDifference + " рублей");
        System.out.println("Денис теперь получает " + denisSalaryIncrease + " рублей. Годовой доход вырос на " + denisSalaryDifference + " рублей");
        System.out.println("Кристина теперь получает " + kristinaSalaryIncrease + " рублей. Годовой доход вырос на " + kristinaSalaryDifference + " рублей");

        //альтернатива
        System.out.println("А теперь альтернативный расчёт:");
        System.out.println("Маша теперь получает " +  (int) (mashaSalary * 1.1) + " рублей. Годовой доход вырос на " + (int) (Math.abs ((mashaSalary * 12) - ((int) (mashaSalary * 1.1) * 12))) + " рублей");
        System.out.println("Денис теперь получает " + (int) (denisSalary * 1.1) + " рублей. Годовой доход вырос на " + (int) (Math.abs ((denisSalary * 12) - ((int) (denisSalary * 1.1) * 12))) + " рублей");
        System.out.println("Кристина теперь получает " + (int) (kristinaSalary * 1.1) + " рублей. Годовой доход вырос на " + (int) (Math.abs ((kristinaSalary * 12) - ((int) (kristinaSalary * 1.1) * 12))) + " рублей");

        //дополнительные
        //шестая
        byte a = 12;
        byte b = 27;
        byte c = 44;
        byte d = 15;
        byte e = 9;
        int result = (int) (a * (b + (c - d * e)));
        System.out.println("В шестой задаче результат = " + result * (-1));

        //седьмая
        a = 5;
        b = 7;
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("Теперь а = " + (byte) (a + (b - a)) + ", b = " + (byte) (b - (b - a)));

        //восьмая
        int a1 = 324;
        String b1 = Integer.toString(a1);
        System.out.println("Вторая цифра числа " + a1 + " = " + b1.charAt(1));
    }
}