public class FilaEstatica {
    private Object v[];
    private int inicio;
    private int fim;

    public FilaEstatica() {
        v = new Object[10];
        inicio = 0;
        fim = -1;
    }

    public FilaEstatica(int n) {
        v = new Object[n];
        inicio = 0;
        fim = -1;
    }

    public void enqueue(Object elemento) {
        fim++;
        v[fim] = elemento;
    }

    public int size() {
        return fim-inicio+1;
    }

    public boolean empty () {
        return size() == 0;
    }

    public void clear() {
        inicio = 0;
        fim = -1;
    }

    public void dequeue() {
        inicio++;
    }

    public Object front() {
        return v[inicio];
    }

    public void show() {
        for (int i = inicio; i <= fim; i++) {
            System.out.print(v[i] + " ");
        }

        System.out.println();
    }
}