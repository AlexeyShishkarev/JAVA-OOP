package family_tree.i_o;

import family_tree.tree.FamilyTree;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;

public interface Writable {
    void save(Serializable serializable) throws IOException;
    Object load() throws IOException, ClassNotFoundException;

}
