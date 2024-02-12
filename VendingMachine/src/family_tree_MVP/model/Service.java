package family_tree_MVP.model;

import family_tree.human.Human;
import family_tree.human.Person;
import family_tree.i_o.ConsoleInput;
import family_tree.i_o.FileSaveLoad;
import family_tree.tree.FamilyTree;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Service {
    private int id;
    private FamilyTree familyTree;
    private List<Human> humanList;
    private ConsoleInput consoleInput;
    private FileSaveLoad fileSaveLoad;

    public Service() {
        humanList = new ArrayList<>();
        familyTree = new FamilyTree();
        consoleInput = new ConsoleInput();
        fileSaveLoad = new FileSaveLoad();
    }

    public boolean addPerson(String name, String surname, String patronymic, LocalDate dateOfBirth){
        Person person = new Person(id++, name, surname, patronymic, dateOfBirth);
        familyTree.addHuman(person);
        return true;
    }

    public String showAllPerson(){

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("++++++++Список людей++++++++\n");
        for (Object human : familyTree){
            stringBuilder.append(human);
            stringBuilder.append("\n");
        }

        return stringBuilder.toString();
    }

    public Boolean sortByName(){
        familyTree.sortByName();
        return true;
    }



}
