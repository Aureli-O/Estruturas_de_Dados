public class FilaPrioridadeO {
    protected NoP primeiro;
    protected NoP ultimo;
    int cont;
    public FilaPrioridadeO() {
        primeiro = null;
        ultimo = null;
        cont = 0;
    }
    public void enqueue(Object elemento, int prioridade) {
        NoP novo = new NoP(elemento, prioridade);

        if (primeiro == null) { // Lista vazia
            primeiro = novo;
            ultimo = novo;
        } else if (novo.prioridade < primeiro.prioridade) { // Inicio da lista
            novo.proximo = primeiro;
            primeiro = novo;
        } else if (novo.prioridade >= ultimo.prioridade) { // Final da lista
            ultimo.proximo = novo;
            ultimo = novo;
        } else {
            NoP anterior = null;
            NoP atual = primeiro;

            while (atual != null && novo.prioridade >= atual.prioridade) {
                anterior = atual;
                atual = atual.proximo;
            }

            anterior.proximo = novo;
            novo.proximo = atual;
        }

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

    public void dequeue() {
        primeiro = primeiro.proximo;
        cont--;
    }

    public Object front() {
        return primeiro.dado;
    }

    public void show() {
        NoP aux = primeiro;

        while (aux != null) {
            System.out.print(aux.dado + "(" + aux.prioridade + ") ");
            aux = aux.proximo;
        }

        System.out.println();
    }
}