public class PilhaEstatica {
    private Object v[];
    private int cont;

    public PilhaEstatica() {
        v = new Object[10];
        cont = 0;
    }

    public PilhaEstatica(int n) {
        v = new Object[n];
        cont = 0;
    }

    public void push(Object elemento) {
        v[cont] = elemento;
        cont++;
    }

    public int size() {
        return cont;
    }

    public boolean empty () {
        return cont == 0;
    }

    public void clear() {
        cont = 0;
    }

    public boolean contains(Object elemento) {
        for (int i = 0; i < cont; i++) {
            if (v[i].equals(elemento)) {
                return true;
            }
        }

        return false;
    }

    public void pop() {
        cont--;
    }

    public Object peek() {
        return v[cont-1];
    }

    public void show() {
        for (int i = 0; i < cont; i++) {
            System.out.print(v[i] + " ");
        }

        System.out.println();
    }
}