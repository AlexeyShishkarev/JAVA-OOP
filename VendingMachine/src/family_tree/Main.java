package family_tree;

import family_tree.human.Person;
import family_tree.i_o.FileSaveLoad;
import family_tree.tree.FamilyTree;

import java.io.IOException;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

    Service service = new Service();

    service.addPerson();
    service.addPerson();

    service.loadTree();
    service.showAllPerson();
//    service.saveTree();








       //region старая версия
//        FamilyTree familyTree = new FamilyTree();
//
//        FileSaveLoad fileSaveLoad = new FileSaveLoad();
//        familyTree = (FamilyTree) fileSaveLoad.loadTree();

//        Person person1 = new Person("Алексей", "Шишкарев", "Юрьевич", LocalDate.of(1987,07,12));
//        Person person2 = new Person("Алексей", "Шишкарев", "Юрьевич", LocalDate.of(1987,07,12));
//        Person person3 = new Person("Алексей", "Шишкарев", "Юрьевич", LocalDate.of(1987,07,12));
//
//        familyTree.addHuman(person1);
//        familyTree.addHuman(person2);
//        familyTree.addHuman(person3);
//        familyTree.showAllHuman();


//        fileSaveLoad.saveTree(familyTree);
        //endregion
    }
}
