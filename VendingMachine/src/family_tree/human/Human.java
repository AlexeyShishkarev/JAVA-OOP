package family_tree.human;

import java.util.Date;

public class Human {
    private String name;
    private String surname;
    private String patronymic;
    private Date dateOfBirth;

    public Human(String name, String surname, String patronymic, Date dateOfBirth) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Имя: " + name + "\nФамилия: " + surname + "\nОтчество: " + patronymic + "\n";
    }
}
