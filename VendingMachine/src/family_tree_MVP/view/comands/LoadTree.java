package family_tree_MVP.view.comands;

import family_tree_MVP.view.ConsoleIO;

public class LoadTree extends Commands{
    public LoadTree(ConsoleIO consoleIO) {
        super("Загрузить дерево", consoleIO);
    }

    @Override
    public void execute() {
        getConsoleIO().loadTree();
    }
}
