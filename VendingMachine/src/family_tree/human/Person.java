package family_tree.human;

import java.util.Date;

public class Person extends Human{

    Person wife;
    Person husband;
    Person mather;
    Person father;


    public Person(String name, String surname, String patronymic, Date dateOfBirth) {
        super(name, surname, patronymic, dateOfBirth);
    }
}
