package Seminar.study_group;

public class Main {
    public static void main(String[] args) {

        Service service = new Service();

        service.addStudent("Алексей", 65);
        service.addStudent("Паша", 45);
        service.addStudent("Маша", 17);
        service.addStudent("Даша", 9);

        System.out.println(service.info());
        service.sortByName();
        System.out.println(service.info());
        service.sortByAge();
        System.out.println(service.info());



    }
}
