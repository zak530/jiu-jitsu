public class Lista {

    private int size;
    private Nodo head;
    private Nodo cursor;

    public Lista() {
        this.size = 0;
        this.head = null;
        this.cursor = null;
    }

    public int getSize() {
        return size;
    }

    public Nodo getHead() {
        return head;
    }

    public Nodo getCursor() {
        return cursor;
    }

    public void setCursor(Nodo cursor) {
        this.cursor = cursor;
    }


    public void ordinamentoPerFifficolta(Tecniche tecnica) {

        Nodo newNode = new Nodo(tecnica);

        if (head == null || tecnica.getDifficolta() < head.getTecnica().getDifficolta()) {
            newNode.setNext(head);
            head = newNode;
        } else {
            Nodo current = head;
            while (current.getNext() != null && current.getNext().getTecnica().getDifficolta() < tecnica.getDifficolta()) {
                current = current.getNext();
                newNode.setNext(current.getNext());
                current.setNext(newNode);
            }

            size++;


        }
    }
}



