package family_tree.tree;

import family_tree.human.Human;
import family_tree.human.Person;
//import family_tree.i_o.InputPersonInfo;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FamilyTree {
    private int personId;
    private List<Human> humanList;

    public FamilyTree(List<Human> humanList){
        this.humanList = humanList;
    }

    public FamilyTree(){
        this(new ArrayList<>());
    }


     public void addHuman (Person person){

        humanList.add(person);
        person.setId(personId++);
     }

    /**
     * Печать всего списка людей
     * @return
     */
     public void showAllHuman(){
         StringBuilder stringBuilder = new StringBuilder();
         for (Human person : humanList){
             stringBuilder.append(person);
             stringBuilder.append("\n");
         }
         System.out.println(stringBuilder.toString());
     }

//     public void saveTree() throws IOException {
//         fileSaveLoadInTxt.save(this);
//     }



}
