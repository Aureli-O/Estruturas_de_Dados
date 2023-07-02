public class TabelaHashFechada {
    private ListaDinamicaNO tabela[];

    public TabelaHashFechada(int n) {
        this.tabela = new ListaDinamicaNO[n];
        //for (int i = 0; i < n; i++) {
        //    tabela[i] = new ListaDinamicaNO();
        //}
    }

    public void add(int elemento) {
        int pos = elemento % tabela.length;

        if (tabela[pos] == null) {
            tabela[pos] = new ListaDinamicaNO();
        }

        tabela[pos].add(elemento);
    }

    public void show() {
        for (int i = 0; i < tabela.length; i++) {
            System.out.println("Posição " + i + ": ");
            if (tabela[i] != null) {
                tabela[i].show();
            }
        }
    }
}