package family_tree_MVP.view.comands;

import family_tree_MVP.view.ConsoleIO;

public class FindPerson extends Commands{
    public FindPerson(ConsoleIO consoleIO) {
        super("Поиск по имени", consoleIO);
    }

    @Override
    public void execute() {
        getConsoleIO().findPerson("Введите имя человека для поиска: ");
    }
}
