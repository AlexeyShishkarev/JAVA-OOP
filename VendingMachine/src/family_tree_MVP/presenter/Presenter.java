package family_tree_MVP.presenter;

import family_tree_MVP.model.Service;
import family_tree_MVP.model.tree.FileSaveLoad;
import family_tree_MVP.view.View;

import java.time.LocalDate;
import java.util.List;

public class Presenter {
    private Service service;
    private View view;
    private FileSaveLoad fileSaveLoad;

    public Presenter(View view) {
        this.view = view;
        service = new Service();
        fileSaveLoad = new FileSaveLoad();
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

    public void sortByAge(){
        if (service.sortByAge()){
            showAllPerson();
        }
    }

    public void saveTree(){
        if (service.saveTree(fileSaveLoad)){
            view.printAnswer("Дерево успешно сохранено!");
        }
    }

    public void loadTree(){
        if (service.loadTree()){
            view.printAnswer("Дерево успешно загружено!");
        } else {
            view.printAnswer("Нет сохранненых деревьев!");
        }
    }

    public void personSearch(String request){
            if (service.personSearch(request) == null){
                view.printAnswer("Человек с именем " + request + " не найден!");
                personSearch(view.consoleInput("Введите имя заново: "));
            } else {
                view.printAnswer(service.personSearch(request));
            }

        }



    public void addSpouse(int idPerson, int idSpouse) {

        if (service.addSpouse(idPerson, idSpouse)){
            view.printAnswer("Супруги успешно добавлены!");
        } else {
            view.printAnswer("Супруги не добавлены...");
        }

    }

    public boolean isCorrectId(int id) {
       if(service.isCorrectID(id)){
           return true;
       }
       return false;
    }

    public void showSpouse(int idPerson) {
        service.showSpouse(idPerson);
    }
}
