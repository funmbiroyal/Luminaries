package Oop;

public class Main {
    public static void main(String[] args) {
        Native omotola = new Native();
        omotola.eat();
        omotola.sleep();
        System.out.println(omotola.learnJava());

//        System.out.println(omotola.returnHealthInfo()[0]);
        for (int i = 0; i < omotola.returnHealthInfo().length; i++) {
            System.out.println(omotola.returnHealthInfo()[i]);
        }

        Facilitator grace = new Facilitator();
        String result = grace.teachJava();
        System.out.println(result);

    }
}
