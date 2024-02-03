package family_tree.i_o;

import family_tree.tree.FamilyTree;

import java.io.*;

public class FileSaveLoadInTxt implements Writable {
    @Override
    public void save(FamilyTree familyTree) throws IOException {

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(
                new FileOutputStream("Family Tree.txt"));
        objectOutputStream.writeObject(familyTree);
        objectOutputStream.close();
    }


    @Override
    public FamilyTree load() throws IOException, ClassNotFoundException {

        ObjectInputStream objectInputStream = new ObjectInputStream(
                new FileInputStream("Family Tree.txt"));
        FamilyTree familyTree = (FamilyTree) objectInputStream.readObject();
        return familyTree;
    }
}
