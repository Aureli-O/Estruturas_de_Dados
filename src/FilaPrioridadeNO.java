public class FilaPrioridadeNO {
    private NoP primeiro;
    private NoP ultimo;
    int cont;
    public FilaPrioridadeNO() {
        primeiro = null;
        ultimo = null;
        cont = 0;
    }
    public void enqueue(Object elemento, int prioridade) {
        NoP novo = new NoP(elemento, prioridade);

        if (primeiro == null) {  // Lista vazia
            primeiro = novo;
            ultimo = novo;
        } else {
            ultimo.proximo = novo;
            ultimo = novo;
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
        // Pesquisar e remover sempre o nó com a prioridade de menor valor

        cont--;
    }

    public Object front() {
        // Pesquisar e retornar sempre o nó com a prioridade de menor valor
        return null;
    }

    public void show() {
        NoP aux = primeiro;

        while (aux != null) {
            System.out.print(aux.dado + " ");
            aux = aux.proximo;
        }

        System.out.println();
    }
}