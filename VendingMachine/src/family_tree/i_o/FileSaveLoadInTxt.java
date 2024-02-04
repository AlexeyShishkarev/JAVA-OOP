package family_tree.i_o;

import family_tree.tree.FamilyTree;

import java.io.*;

public class FileSaveLoadInTxt implements Writable {
    @Override
    public void save(Serializable serializable) throws IOException {

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(
                new FileOutputStream("Family Tree.txt"));
        objectOutputStream.writeObject(serializable);
        objectOutputStream.close();
    }




    @Override
    public Object load() throws IOException, ClassNotFoundException {

        ObjectInputStream objectInputStream = new ObjectInputStream(
                new FileInputStream("Family Tree.txt"));
        Object object = objectInputStream.readObject();
        return object;
    }
}
