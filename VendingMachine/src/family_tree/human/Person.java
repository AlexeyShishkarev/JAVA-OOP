package family_tree.human;

import java.util.Date;

public class Person extends Human{

    private Person wife;
    private Person husband;
    private Person mather;
    private Person father;


    public Person(String name, String surname, String patronymic, Date dateOfBirth) {
        super(name, surname, patronymic, dateOfBirth);
    }



}
