public class NoP {
    public Object dado;
    public int prioridade;
    public NoP proximo;
    public NoP(Object dado, int prioridade) {
        this.dado = dado;
        this.prioridade = prioridade;
        this.proximo = null;
    }
}