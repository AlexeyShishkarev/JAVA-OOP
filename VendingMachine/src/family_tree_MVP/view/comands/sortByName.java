package family_tree_MVP.view.comands;

import family_tree_MVP.view.ConsoleIO;

public class sortByName extends Commands{
    public sortByName(ConsoleIO consoleIO) {
        super("Сортировать по имени", consoleIO);
    }

    @Override
    public void execute() {
        getConsoleIO().sortByName();
    }
}
