public class Nodo {

    private Tecniche tecnica;
    private Nodo next;


    public Nodo(Tecniche tecnica, Nodo next) {
        this.tecnica = tecnica;
        this.next = next;
    }

    public Nodo(Tecniche tecnica){
        this.tecnica = tecnica;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }


    public Tecniche getTecnica() {
        return tecnica;
    }

    public void setTecnica(Tecniche tecnica) {
        this.tecnica = tecnica;
    }

    @Override
    public String toString() {
        return tecnica.toString();

    }

}
