package resourse.lession5;

import java.io.*;

public class allHomework {
//    public static void main(String[] args) {
    //Базовый уровень (для зачета нужно сделать хотя бы 2 из 3)
    //Задача №1
    //Дано: у нас есть две модели машин - жигули и toyota. Каждая из этих машин умеет: начинать движение,
    //останавливаться, включать фары. У жигули есть особенность: она ломается. У Toyota особенность: включает музыку
    //Необходимо:
    // 1.Создать абстрактный класс, который будет описывать общие действия этих машин (методы будут не абстрактные)
    // 2.Создать два класса, которые будут наследоваться от абстрактного класса, и реализовывать особенности этих машин
    // Методы должны просто печатать на экран действия машин (начал движение, включил музыку и тд.)
//        Car toyota = new toyota();
//        Car zhiguli = new zhiguli();
//        Car[] cars = {toyota, zhiguli};
//        for (Car car: cars) {
//            car.rides();
//            car.light();
//            car.stop();
//            if (car instanceof toyota){
//                toyota myToyota = (toyota) car;
//                myToyota.music();
//            } else if (car instanceof zhiguli) {
//                zhiguli myZhiguli = (zhiguli) car;
//                myZhiguli.breaking();
//            }
//            }
//        }
//    }

    //Задача №2
    //Необходимо:
    // 1. Создать папку resource, пометить ее как папку Resourсe root.
    // 2. Создать в ней файл "my_first_file.txt". На первой строке написать: "Моя бабушка", на второй: "читает газету жизнь"
    // 3. Прочитать файл, и вывести на экран все слова файла в одну строку
    // Ожидаемый результат: "Моя бабушка читает газету жизнь"
    public static void main(String[] args) throws IOException {
//
//        FileReader fileReader = new FileReader("D:\\AdminD\\ReposJava\\Homework2\\src\\resourse\\first file.txt");
//
//        BufferedReader fileFirst = new BufferedReader(fileReader);
//        while (fileFirst.ready()) {
//            String myFile = fileFirst.readLine();
//            System.out.print(myFile);
//        }
//        fileFirst.close();
//    }

        //Задача №3
        //Необходимо:
        // 1. Создать класс Financial record, с двумя атрибутами: incomes, outcomes (доходы, расходы)
        // 2. Создать в этом классе геттеры, сеттеры и конструктор на все атрибуты
        // 3. Создать объект этого класса прямо здесь (class Homework3, метод main), с доходами 500, расходами 300
        // 4. Записать в файл "report.txt" данные из объекта класса.
        // Ожидаемый результат: в файле report.txt - одна строка: доходы = 500, расходы 300

        financialRecord financialRecord = new financialRecord(500, 300);
        FileWriter reportWrite = new FileWriter("D:\\AdminD\\ReposJava\\Homework2\\src\\resourse\\report.txt");
        reportWrite.write("Сумма дохода составляет " + financialRecord.getIncomes() + " рублей, Сумма расходов составляет " + financialRecord.getOutcomes() + " рублей");
        reportWrite.close();
    }
}

