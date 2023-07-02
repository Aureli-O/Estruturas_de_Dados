public class TabelaHashAberta {
    private Integer tabela[];

    public TabelaHashAberta(int n) {
        this.tabela = new Integer[n];
    }

    public void add(int elemento) {
        int indice = elemento % tabela.length;
        int pos = indice;
        int i = 0;

        while (tabela[pos] != null) {
            i++;
            pos = (indice + i) % tabela.length;
        }

        tabela[pos] = elemento;
    }

    public void show() {
        for (int i = 0; i < tabela.length; i++) {
            System.out.print(tabela[i] + " ");
        }
        System.out.println();
    }
}