package family_tree_MVP.model.human;

import java.util.Comparator;

public class HumanComparatorByAge<T extends HumanItem> implements Comparator<T> {
    @Override
    public int compare(T o1, T o2) {
        return o1.getAge() - o2.getAge();
    }
}
