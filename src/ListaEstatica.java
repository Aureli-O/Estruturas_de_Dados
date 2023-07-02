public class ListaEstatica {
    private Object v[];
    private int cont;

    public ListaEstatica() {
        v = new Object[10];
        cont = 0;
    }

    public ListaEstatica(int n) {
        v = new Object[n];
        cont = 0;
    }

    public void add(Object elemento) {
        v[cont] = elemento;
        cont++;
    }

    public void add(int posicao, Object elemento) {
        for (int i = cont; i > posicao; i--) {
            v[i] = v[i-1];
        }

        v[posicao] = elemento;
        cont++;
    }

    public int size() {
        return cont;
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

    public void remove(Object elemento) {

    }

    public void remove(int posicao) {

    }

    public Object get(int posicao) {
        return v[posicao];
    }

    public int indexOf(Object elemento) {
        return -1;
    }

    public void show() {
        for (int i = 0; i < cont; i++) {
            System.out.print(v[i] + " ");
        }

        System.out.println();
    }
}