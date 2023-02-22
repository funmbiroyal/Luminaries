package Oop;

public class Person {
    private String complexion;
    private int eyes;
    private String gender;
    private String[] healthInfo = {"Blood Group: O", "Genotype: AA", "Disabilities: 'none'"};

    public String[] returnHealthInfo() {
        return healthInfo;
    }

    public void talk(){
        System.out.println("I am talking!");
    }

    public void sleep(){
        System.out.println("Don't disturb");
    }
    public  void eat(){
        System.out.println("I eat rice!");
    }


}
