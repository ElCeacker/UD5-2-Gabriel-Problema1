import java.util.Iterator;

public class SuperList<I extends Number> extends ListManager{


    @Override
    public void addElement(Object element) {
        list.add(element);
    }

    @Override
    public Object removeElement(int position) {
        list.remove(position);
        return list;
    }

    @Override
    public void showElements() {

        Iterator iterador = list.iterator();

        while (iterador.hasNext()) {
            System.out.println(iterador.next());
        }
    }

    @Override
    public void showReversedElements() {

        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }
    }
}
