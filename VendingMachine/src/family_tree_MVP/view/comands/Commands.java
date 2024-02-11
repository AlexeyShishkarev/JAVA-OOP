package family_tree_MVP.view.comands;

import family_tree_MVP.view.ConsoleIO;

public abstract class Commands implements ICommands{
    private String description;
    private ConsoleIO consoleIO;

    public Commands(String descriprion, ConsoleIO consoleIO) {
        this.description = descriprion;
        this.consoleIO = consoleIO;
    }

    @Override
    public String getDescription() {
        return description;
    }

    public ConsoleIO getConsoleIO(){
        return consoleIO;
    }
}
