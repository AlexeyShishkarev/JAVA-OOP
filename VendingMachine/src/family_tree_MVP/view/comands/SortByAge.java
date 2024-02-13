package family_tree_MVP.view.comands;

import family_tree_MVP.view.ConsoleIO;

public class SortByAge extends Commands{
    public SortByAge(ConsoleIO consoleIO) {
        super("Сортировка по возрасту", consoleIO);
    }

    @Override
    public void execute() {
        getConsoleIO().sortByAge();
    }
}
