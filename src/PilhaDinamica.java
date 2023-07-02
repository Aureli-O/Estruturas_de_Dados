public class PilhaDinamica {
    private No topo;
    int cont;
    public PilhaDinamica() {
        topo = null;
        cont = 0;
    }
    public void push(Object elemento) {
        No novo = new No(elemento);

        if (topo == null) {  // Lista vazia
            topo = novo;
        } else {
            novo.proximo = topo;
            topo = novo;
        }

        cont++;
    }

    public int size() {
        return cont;
    }

    public boolean empty () {
        return cont == 0;
    }

    public void clear() {
        topo = null;
        cont = 0;
    }

    public boolean contains(Object elemento) {
        No aux = topo;

        while (aux != null) {
            if (aux.dado.equals(elemento)) {
                return true;
            }

            aux = aux.proximo;
        }

        return false;
    }

    public Object pop() {
        Object aux = topo;
        topo = topo.proximo;
        cont--;
        return aux;
    }

    public Object peek() {
        return topo;
    }

    public void show() {
        No aux = topo;

        while (aux != null) {
            System.out.print(aux.dado + " ");
            aux = aux.proximo;
        }

        System.out.println();
    }
}
