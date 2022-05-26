public class Main {

    public static void main(String[] args) {

        SuperList<Integer> miLista = new SuperList<Integer>();

        miLista.addElement(1);
        miLista.addElement(2);
        miLista.addElement(3);
        miLista.addElement(4);

        miLista.removeElement(3);

        System.out.println(miLista);


        miLista.showElements();

        System.out.println("------------------------");

        miLista.showReversedElements();



    }
}
