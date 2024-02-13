package family_tree_MVP.view.comands;

import family_tree_MVP.view.ConsoleIO;

public class SaveTree extends Commands{
    public SaveTree(ConsoleIO consoleIO) {
        super("Сохранить дерево", consoleIO);
    }

    @Override
    public void execute() {
        getConsoleIO().saveTree();
    }
}
