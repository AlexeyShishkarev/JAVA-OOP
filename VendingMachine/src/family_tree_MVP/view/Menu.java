package family_tree_MVP.view;

import family_tree_MVP.model.human.Human;
import family_tree_MVP.model.human.Person;
import family_tree_MVP.view.comands.AddPerson;
import family_tree_MVP.view.comands.Commands;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<Commands> commandsList;

    public Menu(ConsoleIO consoleIO) {
        commandsList = new ArrayList<>();
        commandsList.add(new AddPerson(consoleIO));

    }

    public String printMenu(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("============МЕНЮ===========\n");
        for (int i = 0; i < commandsList.size(); i++){
            stringBuilder.append(i + 1);
            stringBuilder.append(". ");
            stringBuilder.append(commandsList.get(i).getDescription());
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    public void execute(int choice){
        Commands commands = commandsList.get(choice - 1);
        commands.execute();
    }

}
