package verySecretCode;

import java.util.Scanner;

public class Solution {

    protected static final char[] ALPHABET = {'а', 'б', 'в', 'г', 'д', 'е', 'ж', 'з',
            'и', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ',
            'ъ', 'ы', 'ь', 'э', 'я', '.', ',', '«', '»', '"', '\'', ':', '!', '?', ' '};
    protected static String ORIGINAlTEXT;// = "D:\\TextLibraryForJava\\Sharks\\Sharks1.txt";//был файнал, передумал
    protected static String cipherText;// = "D:\\TextLibraryForJava\\Sharks\\Sharks2.txt";
    protected static String caesarDecipheredText;// = "D:\\TextLibraryForJava\\Sharks\\Sharks3.txt";
    protected static String decodedByBruteForce;// = "D:\\TextLibraryForJava\\Sharks\\Sharks4.txt";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Здравстуйте!");
        System.out.println("Yf;bvfq, ой простите. Нажимайте кнопки правильно, так как я еще не настоящий программист!");
        System.out.println("Мало ли что может произойти, если нажмете не туда)))");
        System.out.println("ПРЕДУПРЕЖДЕНИЕ! Сначало ОБЯЗАТЕЛЬНО зашифруйте исходный текст иначе на дешифровку ничего не будет");
        System.out.println("Надо ввести 4 пути файлов, 1 это оригинал. текст, остальные шифровка и дешифровка");
        System.out.println("Если не хотите вбивать по 10 раз, перепишите пути у переменных сверху, над майном.");

        //если не хотите вбивать пути к файлу, закоментить тут, а 4 перемен. класса инициал. своими путями
            System.out.println("Оригинальный текст, введите первый путь");
            ORIGINAlTEXT = scanner.nextLine();
            System.out.println("Текст будет зашифрован методом Цезаря, введите второй путь");
            cipherText = scanner.nextLine();
            System.out.println("Текст будет расшифрован по методу Цезаря, известным вам ключем, введите третий путь");
            caesarDecipheredText = scanner.nextLine();
            System.out.println("Текст будет расшифрован методом BruteForce, введите 4 путь");
            decodedByBruteForce = scanner.nextLine();


        System.out.println("Если хотите зашифровать текст по методу Цезаря, нажмите цифру 1");
        System.out.println("Если хотите расшифровать текст нажмите цифру 2485839200572546751938574, шучу, 2 нажмите");
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            if (number == 1) {
                System.out.println(EncryptAsCaesar.encrypt(ORIGINAlTEXT, cipherText));
            }
            if (number == 2) {
                System.out.println("Если хотите расшифровать методом Цезаря по известному Вам ключу, нажмите 1");
                System.out.println("Если хотите расшифровать методом BruteForce, нажмите 2");
                System.out.println("Если к вам стучатся в дверь, нажмите любую кнопку кроме выше написаных. Это выход.");
            } else {
                scanner.close();
                System.out.println("Вы вышли из программы");
                return;
            }
        } else {
            scanner.close();
            System.out.println("Вы вышли из программы");
            return;
        }
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            if (number == 1) {
                System.out.println(DecipherAsCaesar.decipher(cipherText, caesarDecipheredText));
            }
            if (number == 2) {
                System.out.println(DecipherBruteForce.deBruteForce(cipherText, decodedByBruteForce));
            } else {
                scanner.close();
                System.out.println("Вы вышли из программы");
                return;
            }
        } else {
            scanner.close();
            return;
        }
        scanner.close();
        System.out.println("Вы вышли из программы");
        System.out.println("Товарищи Менторы и все кто там работает и помогает нам учиться, огромное спасибо Вам за ваш труд!");
    }
}
