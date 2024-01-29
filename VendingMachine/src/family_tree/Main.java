package family_tree;

import family_tree.tree.FamilyTree;

public class Main {
    public static void main(String[] args) {
        FamilyTree familyTree = new FamilyTree();

        familyTree.addHuman();
        familyTree.showAllHuman();

    }
}
