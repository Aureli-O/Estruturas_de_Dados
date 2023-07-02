public class ListaDinamicaNO {
    private No primeiro;
    private No ultimo;
    int cont;
    public ListaDinamicaNO() {
        primeiro = null;
        ultimo = null;
        cont = 0;
    }
    public void add(Object elemento) {
        No novo = new No(elemento);

        if (primeiro == null) {  // Lista vazia
            primeiro = novo;
            ultimo = novo;
        } else {
            ultimo.proximo = novo;
            ultimo = novo;
        }

        cont++;
    }

    public void add(int posicao, Object elemento) {
        No novo = new No(elemento);

        No aux = primeiro;

        // percorre a lista até o elemento anterior

        novo.proximo = aux.proximo;
        aux.proximo = novo;
        cont++;
    }

    public int size() {
        return cont;
    }

    public void clear() {
        primeiro = null;
        ultimo = null;
        cont = 0;
    }

    public boolean contains(Object elemento) {
        No aux = primeiro;

        while (aux != null) {
            if (aux.dado.equals(elemento)) {
                return true;
            }

            aux = aux.proximo;
        }

        return false;
    }

    public void remove(Object elemento) {
        int posicao = indexOf(elemento);

        No aux = primeiro;

        for (int i = 0; i < posicao-1; i++) {
            aux = aux.proximo;
        }

        if (posicao == 0) { // primeiro elemento
            primeiro = primeiro.proximo;
        } else {
            aux.proximo = aux.proximo.proximo;

            if (posicao == cont-1) { // último elemento
                ultimo = aux;
            }
        }
    }

    public Object get(int posicao) {
        if (posicao == -1) {
            return "--- NOT FOUND ---";
        }

        No aux = primeiro;

        for (int i = 0; i < posicao; i++) {
            aux = aux.proximo;
        }

        return aux.dado;
    }

    public int indexOf(Object elemento) {
        No aux = primeiro;

        for (int i = 0; i < cont; i++) {
            if (aux.dado.equals(elemento)) {
                return i;
            }

            aux = aux.proximo;
        }

        return -1;
    }

    public void show() {
        No aux = primeiro;

        while (aux != null) {
            System.out.println(aux.dado);
            aux = aux.proximo;
        }

        System.out.println();
    }
}