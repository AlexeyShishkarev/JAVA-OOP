package family_tree_MVP.presenter;

import family_tree_MVP.model.Service;
import family_tree_MVP.view.View;

import java.time.LocalDate;

public class Presenter {
    private Service service;
    private View view;

    public Presenter(View view) {
        this.view = view;
        service = new Service();
    }

    public void addPerson(String name, String surname, String patronymic, LocalDate dateOfBirth) {
        service.addPerson(name, surname, patronymic, dateOfBirth);
        view.printAnswer("\nЧеловек успешно добавлен!\n");

        }


    public void showAllPerson(){
        view.printAnswer(service.showAllPerson());
    }

    public void sortByName(){
        if(service.sortByName()){
            showAllPerson();
        }
    }

    public void finish(){

    }

}
