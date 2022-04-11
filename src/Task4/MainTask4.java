package Task4;

public class MainTask4 {
    public static void main(String[] args) {

        Person doctor = new Person();
        Person policeman = new Person();
        Person teacher = new Person();
        Person programmer = new Person();
        Person seller = new Person();

        doctor.inputInfo("Ben", 1985);
        policeman.inputInfo("Tom", 1974);
        teacher.inputInfo("Michael", 1993);
        programmer.inputInfo("Jordan", 2002);
        seller.inputInfo("Chloe", 1995);

        policeman.outputInfo();
        policeman.changeName();
        policeman.outputInfo();

    }
}
