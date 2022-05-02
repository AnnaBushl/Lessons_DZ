package Lesson1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        byte a = 2;
        short c = 5;
        int b = 500;
        long i = 700L;
        double d = 55.65;
        float g = 9.1f;

        System.out.println("Задача 2");
        float weight1 = 78.2f;
        float weight2 = 82.7f;
        float total_weight = weight1 + weight2;
        float dif = weight1 - weight2;
        System.out.println("Общий вес = " + total_weight + " кг");
        System.out.println("Разница в весе = " + Math.abs(dif) + " кг");

        System.out.println("Задача 3");
        int bananas = 5;
        int weight_bananas = 80;
        int milk = 200;
        int weight_milk = 105;
        int ice_cream = 2;
        int weight_ice_cream = 100;
        int eggs = 4;
        int weight_eggs = 70;
        float sum = bananas * weight_bananas + milk / 100 * weight_milk + ice_cream * weight_ice_cream + eggs * weight_eggs;
        float sum_kg = sum / 1000;
        System.out.println("Общий вес спорт-завтрака = " + sum_kg + " кг");

        System.out.println("Задача 4");
        int weight = 7;
        float var_1 = 0.25f;
        float var_2 = 0.5f;
        float result_1 = weight/var_1;
        System.out.println("Количество дней, если худеть по 250 г = " + result_1);
        float result_2 = weight/var_2;
        System.out.println("Количество дней, если худеть по 500 г = " + result_2);
        float average_result = (result_1 + result_2) / 2;// считала, как сред ариф, возможно не правильно поняла задание
        System.out.println("Количество дней в среднем для похудения = " + average_result);

        System.out.println("Задача 5");
        int Mary_salary = 67760;
        int Den_salary = 83690;
        int Cris_salary = 76230;
        float new_Mary_salary = Mary_salary * 1.1f;
        float new_Den_salary = Den_salary * 1.1f;
        float new_Cris_salary = Cris_salary * 1.1f;
        float dif_Mary = new_Mary_salary * 12 - Mary_salary * 12;
        float dif_Den = new_Den_salary * 12 - Den_salary * 12;
        float dif_Cris = new_Den_salary * 12 - Cris_salary * 12;
        System.out.println("Маша теперь получает " + new_Mary_salary + " рублей. Годовой доход вырос на " + dif_Mary + " рублей.");
        System.out.println("Денис теперь получает " + new_Den_salary + " рублей. Годовой доход вырос на " + dif_Den + " рублей.");
        System.out.println("Кристина теперь получает " + new_Cris_salary + " рублей. Годовой доход вырос на " + dif_Cris + " рублей.");
    }


}
