package Encapsulation;

public class TestAccEncapsulation {
    public static void main(String[] args) {
        //creating instance of Account class
        Account acc = new Account();
        //setting values through setter methods
        acc.setAcc_no(125497522);
        acc.setName("Akkarapol Simlee");
        acc.setEmail("Akkarapolsimlee11@gmail.com");
        acc.setAmount(5000000f);
        //getting value through getter medthods
        System.out.println(acc.getAcc_no()+" "+acc.getName()+" "+acc.getEmail()+" "+acc.getAmount());
    }
}
