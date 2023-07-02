public class NoABB {
    public int dado;
    public int fb;
    public NoABB esquerdo;
    public NoABB direito;
    public NoABB pai;

    public NoABB(int dado) {
        this.dado = dado;
        this.fb = 0;
        this.esquerdo = null;
        this.direito = null;
    }
}