public class Main{

    public static void main(String[] args){

        Tecniche rnc = new Tecniche("sottomissione", "rnc", 1);
        Tecniche leva = new Tecniche("sottomissione", "leva al braccio", 2);
        Tecniche americana = new Tecniche("sottomissione", "americana", 3);
        Tecniche kimura = new Tecniche("sottomissione", "kimura", 4);
        Tecniche triangolo = new Tecniche("sottomissione", "triangolo", 5);

        Lista lista1 = new Lista();

        lista1.ordinamentoPerFifficolta(americana);
        lista1.ordinamentoPerFifficolta(rnc);
        lista1.ordinamentoPerFifficolta(kimura);
        lista1.ordinamentoPerFifficolta(triangolo);

        Nodo current = lista1.getHead();
        while (current != null) {
            System.out.println(current.getTecnica());
            current = current.getNext();
        }




    }
}