package family_tree.human;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

public class Human {
    private int id;
    private String name;
    private String surname;
    private String patronymic;
    private LocalDate dateOfBirth;

    public Human(String name, String surname, String patronymic, LocalDate dateOfBirth) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "id: " + id + "\nИмя: " + name + "\nФамилия: " + surname + "\nОтчество: " + patronymic + "\n";
    }

    public int getId (){
        return id;
    }

    public void setId (int id){
        this.id = id;
    }

}
