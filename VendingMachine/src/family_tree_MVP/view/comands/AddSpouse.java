package family_tree_MVP.view.comands;

import family_tree_MVP.view.ConsoleIO;

public class AddSpouse extends Commands{

    public AddSpouse(ConsoleIO consoleIO) {
        super("Добавить супруга", consoleIO);
    }

    @Override
    public void execute() {
        getConsoleIO().addSpouse();
    }
}
