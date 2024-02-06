package family_tree.tree;

import family_tree.human.*;
//import family_tree.i_o.InputPersonInfo;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class FamilyTree<E extends HumanItem> implements Serializable, Iterable<E>{
    private List<E> humanList;

    public FamilyTree(List<E> humanList){
        this.humanList = humanList;
    }

    public FamilyTree(){
        this(new ArrayList<>());
    }


     public void addHuman (E person){

        humanList.add(person);
     }

    /**
     * Печать всего списка людей
     * @return
     */
     public void showAllHuman(){
         StringBuilder stringBuilder = new StringBuilder();
         for (E person : humanList){
             stringBuilder.append(person);
             stringBuilder.append("\n");
         }
         System.out.println(stringBuilder.toString());
     }

    @Override
    public Iterator<E> iterator() {
        return new HumanIterator<>(humanList);
    }

    public void sortByName(){
        humanList.sort(new HumanComparatorByName<>());
    }

    public void sortByAge(){
         humanList.sort(new HumanComparatorByAge<>());
    }



//     public void saveTree() throws IOException {
//         fileSaveLoadInTxt.save(this);
//     }



}
