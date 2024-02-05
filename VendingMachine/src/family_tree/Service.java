package family_tree;

import family_tree.human.Human;
import family_tree.human.Person;
import family_tree.i_o.ConsoleInput;
import family_tree.i_o.FileSaveLoad;
import family_tree.tree.FamilyTree;

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

    public void addPerson(){
        Person person = new Person(id++, consoleInput.name(), consoleInput.surname(), consoleInput.patronymic(), consoleInput.date());
        humanList.add(person);
    }

    public void showAllPerson(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("===========Список всех людей: ==============\n");
        for (Human human : humanList){
            stringBuilder.append(human);
            stringBuilder.append("\n");
        }
        System.out.println(stringBuilder.toString());
    }

    //TODO переписать service - сейчас он работает чисто с листом, а должен работать с древом и методоами древа

    public void saveTree(){
        fileSaveLoad.saveTree(humanList);
    }

    public void loadTree(){
        familyTree = (FamilyTree) fileSaveLoad.loadTree();
    }

}
