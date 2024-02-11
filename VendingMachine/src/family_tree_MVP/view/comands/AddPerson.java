package family_tree_MVP.view.comands;

import family_tree_MVP.view.ConsoleIO;

public class AddPerson extends Commands{


    public AddPerson(ConsoleIO consoleIO) {
        super("Добавить студента", consoleIO);
    }


    @Override
    public void execute() {
        getConsoleIO().addPerson();
    }
}
