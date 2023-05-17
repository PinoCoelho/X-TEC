package Server;

public class Queue {
    class Node {
        private ListaEnlazada data; // el data de los nodos es una lista enlazada
        private Queue.Node next; // next es el siguiente nodo

        public Node(ListaEnlazada data) {
            this.next = null;
            this.data = data;
        }

        /**
         * Metodo para obtener los valores de un nodo
         * @return el data de un nodo en forma de lista enlazada
         */
        public ListaEnlazada getData() {
            return this.data;
        }

        /**
         * Se delimita el valor del nodo
         * @param data una lista enlazada
         */
        public void setData(ListaEnlazada data) {
            this.data = data;
        }

        /**
         * Se obtiene el siguiente nodo
         * @return el siguiente nodo
         */
        public Queue.Node getNext() {
            return this.next;
        }

        /**
         * Se determina el valor del siguiente nodo
         * @param node un nodo
         */
        public void setNext(Queue.Node node) {
            this.next = node;
        }
    }

    private Queue.Node head;
    private int size;

    /**
     * Constructor para crear
     * y modificar las listas
     * enlazadas
     */
    public Queue() {
        this.head = null;
        this.size = 0;
    }

    /**
     * Se determina si una lista esta vacia
     * @return true si la lista esta vacia
     */
    public boolean isEmpty() {
        return this.head == null;
    }

    /**
     * @return el tamaño de la lista
     */
    public int size() {
        return this.size;
    }

    /**
     * Se inserta una lista enlazada a la lista
     * en el primer lugar
     * @param data una lista enlazada
     */
    public void insertFirst(ListaEnlazada data) {
        Queue.Node newNode = new Queue.Node(data);
        newNode.next = this.head;
        this.head = newNode;
        this.size++;
    }

    /**
     * Se borra el primer valor de la lista
     * @return el valor que se borro en forma de array
     */
    public ListaEnlazada dequeue() {
        if (this.head != null) {
            Queue.Node temp = this.head;
            this.head = this.head.next;
            this.size--;
            return temp.getData();
        }
        else {
            return null;
        }
    }

    /**
     * Se borra el primer valor
     * de la lista sin retornar
     * el valor que se borra
     */
    public void dequeueNotReturn() {
        if (this.head != null) {
            this.head = this.head.next;
            this.size--;
        }
    }

    /**
     * Se borra un valor determinado de la lista
     * @param id identificacion del platillo a borrar
     * @return el platillo que se borra
     */
    public ListaEnlazada delete(int id) {
        Queue.Node current = this.head;
        Queue.Node previous = this.head;

        while (current != null) {
            if (current.getData().getFirst().id == id) {
                if (current == this.head) {
                    this.head = this.head.getNext();
                    this.size--;
                }
                else {
                    previous.setNext(current.getNext());
                    this.size--;
                }
                return current.getData();
            }
            else {
                previous = current;
                current = current.getNext();
            }
        }
        return null;
    }

    /**
     * Metodo que añade una lista enlazada
     * @param data una lista enlazada
     */
    public void enqueue(ListaEnlazada data)
    {
        Queue.Node newNode = new Queue.Node(data);
        Queue.Node temp = this.head;
        if (this.head == null) {
            newNode.next = this.head;
            this.head = newNode;
            this.size++;
        }
        else {
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            this.size++;
        }

    }

    /**
     * Se obtiene la lista enlazada del primer nodo
     * @return la lista enlazada del primer nodo
     */
    public ListaEnlazada getFirst() {
        if (this.head == null) {
            return null;
        }
        else {
            return this.head.getData();
        }
    }

    /**
     * Se determina si la lista contiene
     * una lista enlazada con determinados valores
     * @param id identidficacion del platillo
     * @return true si el id esta en la lista enlazada, false en caso contrario
     */
    public boolean contains(int id) {
        Queue.Node current = this.head;
        while (current != null) {
            if (current.getData().getFirst().id == id) {
                return true;
            }
            else {
                current = current.getNext();
            }
        }
        return false;
    }

    /**
     * Se imprime en consola los
     * valores del id del primer 
     * platillo de cada pedido 
     * en la cola.
     */
    public void recorrerLista() {
        Queue.Node current = this.head;
        while (current != null) {
            System.out.print(current.getData().getFirst().id);
            System.out.println("");
            current = current.getNext();
        }
    }

    /**
     * Se vacia una lista
     */
    public void empty() {
        this.head = null;
    }

    /**
     * Se obtiene la primera lista enlazada de pedidos del primer nodo de una lista enlazada
     * @return la lista enlazada del primer nodo
     */
    public ListaEnlazada getHead() {
        if (this.head == null) {
            return null;
        }
        else {
            return this.head.getData();
        }
    }

    /**
     * Se obtiene la lista enlazada del nodo
     * de una lista enlazada dado un indice.
     * @param searchValue lugar o indice del arreglo que se quiere obtener
     * @return arreglo en la posicion del indice
     */
    public ListaEnlazada get(int searchValue) {
        Queue.Node current = this.head;
        int counter = 0;
        while (current != null) {
            if (counter == searchValue) {
                return current.getData();
            }
            else {
                current = current.getNext();
                counter++;
            }
        }
        return null;
    }

    /**
     * Se borra un nodo en una posicion
     * especifica dado un indice.
     * @param i lugar o indice del nodo que se quiere borrar
     */
    public void deleteIndex(int i) {
        Queue.Node current = this.head;
        Queue.Node previous = this.head;
        int counter = 0;

        while (current != null) {
            if (counter == i) {
                if (current == this.head) {
                    this.head = this.head.getNext();
                    counter++;
                    this.size--;
                }
                else {
                    previous.setNext(current.getNext());
                    counter++;
                    this.size--;
                }
            }
            else {
                previous = current;
                current = current.getNext();
                counter++;
            }
        }
    }

    /**
     * Se le asigna un 0 al tamaño de la lista
     */
    public void resetSize() {
        this.size = 0;
    }


}
