package family_tree;

import family_tree.human.Person;
import family_tree.i_o.FileSaveLoadInTxt;
import family_tree.tree.FamilyTree;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Locale;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FamilyTree familyTree = new FamilyTree();

        Person person1 = new Person("Алексей", "Шишкарев", "Юрьевич", LocalDate.of(1987,07,12));



        familyTree.addHuman(person1);
        familyTree.showAllHuman();

        FileSaveLoadInTxt fileSaveLoadInTxt = new FileSaveLoadInTxt();
        fileSaveLoadInTxt.save(familyTree);



    }
}
