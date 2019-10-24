package ru.mirea.laba2;

public class TestAuthor {
    public static void main(String[] args) {
        Author a1 = new Author("Юлия", "yul54311225@ya.ru",'F');
        System.out.println(a1);
        a1.setEmail("yul543112200@ya.ru");
        System.out.println(a1);
    }
}
