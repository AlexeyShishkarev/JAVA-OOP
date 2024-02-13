//package family_tree.i_o;
//
//import family_tree.human.Person;
//
//import java.time.LocalDate;
//import java.time.format.DateTimeParseException;
//import java.util.Scanner;
//
//public class ConsoleInput {
//    private int id;
//    private Scanner scanner;
//
//    public ConsoleInput() {
//        scanner = new Scanner(System.in);
//    }
//
//    public String name (){
//        String name = consoleInput("Введите имя: ");
//        return name;
//    }
//
//    public String surname(){
//        String surname = consoleInput("Введите фамилию: ");
//        return surname;
//    }
//
//    public String patronymic(){
//        String patronymic = consoleInput("Введите отчество: ");
//        return patronymic;
//    }
//
//    public LocalDate date(){
//        LocalDate dateOfBirth = inputDate();
//        return dateOfBirth;
//    }
//
////    public Person inputPersonInfo(){
////        String name = consoleInput("Введите имя: ");
////        String surname = consoleInput("Введите фамилию: ");
////        String patronymic = consoleInput("Введите отчество: ");
////        LocalDate dateOfBirth = inputDate();
////        Person person = new Person(id++, name, surname, patronymic, dateOfBirth);
////        return person;
////    }
//
//    /**
//     * Читаем с консоли ввод и отдаем стрингу
//     * @param message
//     * @return
//     */
//    public String consoleInput(String message){
//        System.out.println(message);
//        return scanner.nextLine();
//    }
//
//    public LocalDate inputDate (){
//        boolean work = true;
//        LocalDate date;
//        while (work){
//            try {
//                date = LocalDate.parse(consoleInput("Введите дату рождения в формате ГГГГ-ММ-ДД"));
//                return date;
//               } catch (DateTimeParseException e){
//                System.out.println("неверный формат даты!");
//            }
//        }
//        return  null;
//    }
//
//}
