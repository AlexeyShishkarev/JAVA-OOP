package family_tree_MVP.model.human;

import java.time.LocalDate;

public class Person extends Human {

    private Person wife;
    private Person husband;
    private Person mather;
    private Person father;


    public Person(int id, String name, String surname, String patronymic, LocalDate dateOfBirth) {
        super(id, name, surname, patronymic, dateOfBirth);

    }



}
