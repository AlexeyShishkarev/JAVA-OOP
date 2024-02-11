package family_tree_MVP.presenter;

import family_tree_MVP.model.Service;
import family_tree_MVP.view.View;

public class Presenter {
    private Service service;
    private View view;

    public Presenter(View view) {
        this.view = view;
        service = new Service();
    }

    public void addPerson() {

    }
}
