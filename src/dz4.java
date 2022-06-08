public class dz4 {
    public static void main(String[] args) {
        //Задача №3
        //Создать из массива букв a,b,c,d,e, строку,вывести на экран , поменять в массиве 4 букву по счету на h,
        //и снова создать строку, вывести на экран

        char[] word = new char[5];
        word[0] = 'a';
        word[1] = 'b';
        word[2] = 'c';
        word[3] = 'd';
        word[4] = 'e';
        System.out.println(word);

        word[3] = 'h';
        System.out.print(word);
    }
}
