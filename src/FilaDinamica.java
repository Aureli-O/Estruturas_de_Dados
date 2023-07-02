public class FilaDinamica {
    private No primeiro;
    private No ultimo;
    int cont;
    public FilaDinamica() {
        primeiro = null;
        ultimo = null;
        cont = 0;
    }
    public void enqueue(Object elemento) {
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
        No aux = primeiro;

        while (aux != null) {
            System.out.print(aux.dado + " ");
            aux = aux.proximo;
        }

        System.out.println();
    }
}