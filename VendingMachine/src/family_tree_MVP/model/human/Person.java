package family_tree_MVP.model.human;

import java.time.LocalDate;

public class Person extends Human {

    private Person spouse;
    private Person mather;
    private Person father;
    private Person child;


    public Person(int id, String name, String surname, String patronymic, LocalDate dateOfBirth) {
        super(id, name, surname, patronymic, dateOfBirth);

    }

    public void addSpouse(Person person){
        spouse = person;
        person.spouse = this;

    }

    public void addMather(Person person){
        mather = person;
        person.child = this;
    }

    public void addFather(Person person){
        father = person;
        person.child = this;
    }

    @Override
    public String toString() {
        if(spouse == null){
            return super.toString() + "Супруг(а): неизвестно" + "\n";
        } else{
            return super.toString() + "Супруг(а): " + spouse.getName() + "\n";
        }

    }
}
