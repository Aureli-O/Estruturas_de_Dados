public class ListaDinamicaO {
    protected No primeiro;
    protected No ultimo;
    int cont;
    public ListaDinamicaO() {
        primeiro = null;
        ultimo = null;
        cont = 0;
    }
    public void add(int elemento) {
        No novo = new No(elemento);
/*
        if (primeiro == null) { // Lista vazia
            primeiro = novo;
            ultimo = novo;
        } else if (novo.dado < primeiro.dado) { // Inicio da lista
            novo.proximo = primeiro;
            primeiro = novo;
        } else if (novo.dado > ultimo.dado) { // Final da lista
            ultimo.proximo = novo;
            ultimo = novo;
        } else {
            No anterior = null;
            No atual = primeiro;

            while (atual != null && novo.dado > atual.dado) {
                anterior = atual;
                atual = atual.proximo;
            }

            anterior.proximo = novo;
            novo.proximo = atual;
        }
*/
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

    public boolean contains(int elemento) {
        No aux = primeiro;

        while (aux != null) {
            if (aux.dado.equals(elemento)) {
                return true;
            }

            aux = aux.proximo;
        }

        return false;
    }

    public void remove(int elemento) {
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

    public int get(int posicao) {
        return 0;
    }

    public int indexOf(int elemento) {
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
    }
}