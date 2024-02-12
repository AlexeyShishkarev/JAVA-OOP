package family_tree_MVP.view.comands;

import family_tree_MVP.view.ConsoleIO;

public class ShowAllPerson extends Commands{
    public ShowAllPerson(ConsoleIO consoleIO) {
        super("Показать всех людей", consoleIO);
    }

    @Override
    public void execute() {
        getConsoleIO().showAllPerson();
    }
}
