public class dz2 {
    public static void main(String[] args) {

        //Базовый уровень
        //Задача №1
        //Дано

        String hi = "                Hello ";
        String world = " WoRld!";
        char newLine = '\n';

        //Создать из трех переменных единую строку,
        //Привести к правильному виду (Ниже)
        //затроить (Можно вызвать тольку одну команду System.out.print())
        //Результат вывода на экран:
        //Hello world!
        //Hello world!
        //Hello world!

        String word1 = hi.trim();
        String word2 = world.toLowerCase();
        String result1 = word1 + word2 + newLine;
        String result2 = result1.repeat(3);

        System.out.print(result2);


    }
}
