package family_tree.i_o;

import family_tree.tree.FamilyTree;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface Writable {
    void save(FamilyTree familyTree) throws IOException;
    FamilyTree load() throws IOException, ClassNotFoundException;

}
