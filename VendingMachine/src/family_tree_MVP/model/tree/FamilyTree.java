package family_tree_MVP.model.tree;

import family_tree_MVP.model.human.*;

import java.io.Serializable;
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

    public int getHumanListSize(){
         return humanList.size();
    }

    public String personSearch (String request){
         StringBuilder stringBuilder = new StringBuilder();
             for (E person : humanList){
             if (person.getName().toLowerCase().contains(request.toLowerCase())){
                 if(stringBuilder.isEmpty()){
                     stringBuilder.append("Список людей с именем ").append(request).append(":\n");
                 }
                 stringBuilder.append(person);
                 stringBuilder.append("\n");
             }
         }
         if (stringBuilder.isEmpty()){
             return null;
         } else{
             return stringBuilder.toString();
         }
    }

    public List<E> getHumanList(){
         return humanList;
    }

    public int getMaxId(List<E> humanList){
         ArrayList<Integer> id = new ArrayList<>();
         for (E human : humanList){
            id.add(human.getId());
         }
         return Collections.max(id);
    }



//     public void saveTree() throws IOException {
//         fileSaveLoadInTxt.save(this);
//     }



}
