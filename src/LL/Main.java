package LL;

public class Main {

    public static void main(String[] args) {

        LL.LL<String> myList = new LL.LL<String>();

        myList.addFirst("koks");

        myList.addFirst("Kappa");

        myList.addFirst("Luna");

        System.out.println(myList.getFirstNode());

        System.out.println(myList.getLastNode());






    }}

