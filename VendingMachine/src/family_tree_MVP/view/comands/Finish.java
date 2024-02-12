package family_tree_MVP.view.comands;

import family_tree_MVP.view.ConsoleIO;

public class Finish extends Commands{
    public Finish(ConsoleIO consoleIO) {
        super("Завершить работу", consoleIO);
    }

    @Override
    public void execute() {
        getConsoleIO().finish();
    }
}
