package ru.netology.git;

public class Main {
    public static void main(String[] args) {
        System.out.println(args.length);
        BillingAccount account = new BillingAccount();
        account.printIncomingMessage("str");
        TestFunctionalInterface tf = (x) -> x.toUpperCase();
        tf.printIncomingMessage("zara");
    }
}