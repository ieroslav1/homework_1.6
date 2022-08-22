public class Main {
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }


    public static void main(String[] args) {
        task1();
        System.out.println();
        task2();
        System.out.println();
        task3();
        System.out.println();
        task4();
    }

    // 1 Задание
    public static void task1() {
        var expenses = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < expenses.length; i++) {
            sum += expenses[i];
        }
        System.out.printf("Сумма трат за месяц составила %d рублей", sum);
    }

    // 2 Задание
    public static void task2() {
        var expenses = generateRandomArray();
        int maxExpenses = expenses[0];
        int minExpenses = expenses[0];
        for (int i = 0; i < expenses.length; i++) {
            if (maxExpenses < expenses[i]) {
                maxExpenses = expenses[i];
            }
            if (minExpenses > expenses[i]) {
                minExpenses = expenses[i];
            }
        }
        System.out.printf("Максимальная трата в месяц составила %d рублей, минимальная трата в месяц составила %d рублей", maxExpenses, minExpenses);
    }

    // 3 Задание
    public static void task3() {
        var expenses = generateRandomArray();
        int midlleExpenses = 0;
        for (int expense : expenses) {
            midlleExpenses += expense;
        }
        var result = (double) midlleExpenses / expenses.length;
        System.out.printf("Средняя трата в месяц составила %.2f рублей", result);
    }

    // 4 Задание
    public static void task4() {
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >=0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }

}