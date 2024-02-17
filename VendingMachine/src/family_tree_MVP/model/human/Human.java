package family_tree_MVP.model.human;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.Period;

public class Human implements Serializable, HumanItem {
    private int id;
    private String name;
    private String surname;
    private String patronymic;
    private LocalDate dateOfBirth;

    /**
     * Конструктор в который нужно передать начальную информацию о человеке
     * @param id
     * @param name
     * @param surname
     * @param patronymic
     * @param dateOfBirth
     */

    public Human(int id, String name, String surname, String patronymic, LocalDate dateOfBirth) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.dateOfBirth = dateOfBirth;
    }


    /**
     * Переопределение toString для человека
     * @return
     */
    @Override
    public String toString() {
        return "id: " + id + "\nИмя: " + name + "\nФамилия: " + surname + "\nОтчество: " + patronymic + "\n"
                + "Дата рождения: " + dateOfBirth + "\n";
    }

    public int getId (){
        return id;
    }

    public void setId (int id){
        this.id = id;
    }

    public int getAge(){
        return Period.between(dateOfBirth, LocalDate.now()).getYears();
    }

    public String getName() {
        return name;
    }
}
