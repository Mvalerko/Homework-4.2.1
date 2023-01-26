public class Main {
    public static void main(String[] args) {

//Объявляем переменную в которой указываем общую стоимость билета
        int amount = 230;
        // Объявляем переменную в которой указываем какое количество рублей необходимо для начисления одной бонусной
        // мили
        int conditionForOoneMmile = 20;




        // Рассчитываем количество бонусных миль, используя
        // значения заведённых переменных.
int bonus;
bonus = amount / conditionForOoneMmile;
System.out.println("Благодарим за покупку и рассчитываем Ваш бонус...");
System.out.println("Итоговое количство бонусных миль: " + bonus + " миль(я)");

    }
}