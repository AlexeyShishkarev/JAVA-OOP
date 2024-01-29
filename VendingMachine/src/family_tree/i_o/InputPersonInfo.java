package family_tree.i_o;

import family_tree.human.Person;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class InputPersonInfo {

    Scanner scanner = new Scanner(System.in);

    public Person inputPersonInfo (){
        String name = consoleInput("Введите имя: ");
        String surname = consoleInput("Введите фамилию: ");
        String patronymic = consoleInput("Введите отчество: ");
        Date dateOfBirth = inputDate("Введите дату рождения в формате: ГГГГ/ММ/ДД: ");
        Person person = new Person(name, surname, patronymic, dateOfBirth);
        return person;
    }

    private String consoleInput(String message){
        System.out.println(message);
        String str = scanner.nextLine();
        return str;
    }

    private Date inputDate(String message){
        Date date = new Date();
        boolean work = true;
        DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
        while (work){
            String inputDate = consoleInput(message);
            try {
                date = df.parse(inputDate);
                work = false;
            } catch (ParseException e) {
                System.out.println("Введен неверный формат даты!");;
            }
        }
        return date;
    }

}
