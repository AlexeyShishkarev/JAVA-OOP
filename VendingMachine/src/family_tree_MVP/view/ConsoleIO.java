package family_tree_MVP.view;

import family_tree_MVP.presenter.Presenter;
import family_tree_MVP.view.comands.Commands;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleIO implements View {
    private Presenter presenter;
    private Scanner scanner;
    private boolean work;
    private Menu menu;

    public ConsoleIO() {
        presenter = new Presenter(this);
        scanner = new Scanner(System.in);
        work = true;
        menu = new Menu(this);
    }

    @Override
    public void start() {
        printAnswer("Добро пожаловать!");
        while (work){
        printAnswer(menu.printMenu());
//        printAnswer("Выберите действие: ");

        int choice = consoleInputChoice();
                menu.execute(choice);
        }

    }

    @Override
    public void printAnswer(String message) {
        System.out.println(message);
    }

    public void addPerson() {
        String name = consoleInput("Введите имя: ");
        String surname = consoleInput("Введите фамилию: ");
        String patronymic = consoleInput("Выедите отчество: ");
        LocalDate date = inputDate();
        presenter.addPerson(name, surname, patronymic, date);
    }

    public void showAllPerson(){
        presenter.showAllPerson();
    }

    public String consoleInput(String message){
        System.out.println(message);
        String str = scanner.nextLine();
        return str;
    }

    public int consoleInputChoice(){
        int choice;
        while (true){
            printAnswer("Введите номер команды: ");
            try {
                choice = Integer.parseInt(scanner.nextLine());
                if(choice > 0 && choice <= menu.menuSize()){
                    return choice;
                } else {
                    printAnswer("Номер команды должен быть больше 0 и не больше " + menu.menuSize());
                }
            }catch (NumberFormatException e){
                printAnswer("Введен неверный номер команды!");
            }
        }
    }

    public LocalDate inputDate (){
        boolean work = true;
        LocalDate date;
        while (work){
            try {
                date = LocalDate.parse(consoleInput("Введите дату рождения в формате ГГГГ-ММ-ДД"));
                return date;
            } catch (DateTimeParseException e){
                System.out.println("неверный формат даты!");
            }
        }
        return  null;
    }

    public void sortByName(){
        presenter.sortByName();
    }

    public void sortByAge(){
        presenter.sortByAge();
    }

    public void finish(){
        printAnswer("До скорого!");
        work = false;
    }

    public void saveTree(){
        presenter.saveTree();
    }

    public void loadTree(){
        presenter.loadTree();
    }

    public void findPerson(){
        String request = consoleInput("Введите имя человека для поиска: ");
        presenter.personSearch(request);
    }


}
