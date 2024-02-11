package family_tree_MVP.view;

import family_tree_MVP.presenter.Presenter;
import family_tree_MVP.view.comands.Commands;

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
        printAnswer("Выберите действие: ");
        int choice = Integer.parseInt(scanner.nextLine());
        menu.execute(choice);
        }

    }

    @Override
    public void printAnswer(String message) {
        System.out.println(message);
    }

    public void addPerson(){
        presenter.addPerson();
    }


}
