package family_tree_MVP.model;
import family_tree_MVP.model.human.Human;
import family_tree_MVP.model.human.Person;
import family_tree_MVP.model.tree.FamilyTree;
import family_tree_MVP.model.tree.FileSaveLoad;
import family_tree_MVP.model.tree.Writable;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Service {
    private int id;
    private FamilyTree familyTree;
    private FileSaveLoad fileSaveLoad;


    public Service() {
        familyTree = new FamilyTree<>();
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
        if(familyTree.getHumanListSize() == 0){
            return "Дерево пусто!";
        }
        return stringBuilder.toString();
    }

    public Boolean sortByName(){
        familyTree.sortByName();
        return true;
    }

    public Boolean sortByAge(){
        familyTree.sortByAge();
        return true;
    }

    public Boolean saveTree(Writable writable){
        writable.saveTree(familyTree);
//        fileSaveLoad.saveTree(familyTree);
        return true;
    }

    public boolean loadTree() {
        if (fileSaveLoad.loadTree() == null){
            return false;
        } else {
            familyTree = (FamilyTree) fileSaveLoad.loadTree();
            id = getIdLoad(familyTree) + 1;
            return true;
        }
    }

    private int getIdLoad(FamilyTree familyTree){
        return familyTree.getMaxId(familyTree.getHumanList());
    }


    /**
     * Получение списка всех id хранящихся в базе
     * @return
     */
    public List getAllId(){
        List<Integer> idList = new ArrayList<>();
        List<Person> personList = familyTree.getHumanList();
        for (Person person : personList){
            idList.add(person.getId());
        }
        return idList;
            }


    public String personSearch(String request){
        return familyTree.personSearch(request);
    }


    public boolean isCorrectID(int id){
        if(getAllId().contains(id)){
            return true;
        }
        return false;
    }


    public boolean addSpouse(int idPerson, int idSpouse) {
        List<Person> personList = familyTree.getHumanList();
        for (Person person : personList){
            if (person.getId() == idPerson){
                person.addSpouse(getPersonFromId(idSpouse));
                return true;
            }
        }
        return false;
    }

    public Person getPersonFromId(int id){
        List<Person> personList = familyTree.getHumanList();
        for(Person person : personList){
            if (person.getId() == id){
                return person;
            }
        }
        return null;
    }

    public void showSpouse(int idPerson) {

    }
}
