//package family_tree.i_o;
//
//import family_tree.tree.FamilyTree;
//
//import java.io.*;
//
//public class FileSaveLoad implements Writable{
//
//
//    /**
//     * Метод для записи в файл с применением try with resurses
//     * @param serializable
//     */
//    @Override
//    public void saveTree(Serializable serializable) {
//
//        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("Family tree.txt")))
//        {
//            objectOutputStream.writeObject(serializable);
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//
//
//
//    }
//
//    /**
//     * Чтение из файла, передаем объект Serializable (Подходит для всех объектов подписанных на данный интерфейс
//     * @return
//     */
//    @Override
//    public Serializable loadTree() {
//
//        try{
//            FamilyTree familyTree = new FamilyTree();
//            ObjectInputStream objectInputStream = new ObjectInputStream(
//                    new FileInputStream("Family tree.txt"));
//            familyTree = (FamilyTree) objectInputStream.readObject();
//            objectInputStream.close();
//            return familyTree;
//
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (IOException | ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//
//    }
//}
