package Baithi;

public class TestBank{
    public static void main(String[] args) {
        Bank  b = new Bank(1000, 100);
        System.out.println("Monthly interest is : " + b.calculateInterest());
    }
}
