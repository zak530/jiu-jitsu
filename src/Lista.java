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


    //public void ordinamentoPerFifficolta(Tecniche tecnica) {
//
    //    Nodo newNode = new Nodo(tecnica, null);
//
    //    if (head == null || tecnica.getDifficolta() < head.getTecnica().getDifficolta()) {
    //        newNode.setNext(head);
    //        head = newNode;
    //    } else {
    //        Nodo current = head;
    //        while (current.getNext() != null && current.getNext().getTecnica().getDifficolta() < tecnica.getDifficolta()) {
    //            current = current.getNext();
    //            newNode.setNext(current.getNext());
    //            current.setNext(newNode);
    //        }
//
    //        size++;
//
//
    //    }
    //}

    public void ordinamentoPerFifficolta(Tecniche valore) {
        Nodo nuovo = new Nodo(valore, null);

        if (head == null || valore.compareTo(head.getTecnica()) < 0) {
            nuovo.next = head;
            head = nuovo;
            return;
        }

        Nodo temp = head;

        while (temp.getNext() != null && valore.compareTo(temp.getNext().getTecnica()) > 0) {
            temp = temp.getNext();
        }

        nuovo.next = temp.getNext();
        temp.next = nuovo;
    }

    public void stampa() {
        Nodo temp = head;
        while (temp != null) {
            System.out.print(temp.getTecnica() + " -> ");
            temp = temp.getNext();
        }
        System.out.println("null");
    }






}



