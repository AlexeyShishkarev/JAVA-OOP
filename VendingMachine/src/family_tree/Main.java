package family_tree;

import family_tree.i_o.FileSaveLoadInTxt;
import family_tree.tree.FamilyTree;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FamilyTree familyTree = new FamilyTree();

        familyTree.addHuman();
        familyTree.showAllHuman();

        FileSaveLoadInTxt fileSaveLoadInTxt = new FileSaveLoadInTxt();
//        fileSaveLoadInTxt.save(familyTree);
        familyTree.saveTree();

        familyTree = fileSaveLoadInTxt.load();
        familyTree.showAllHuman();


    }
}
