public class ArvoreBinariaBusca {
    public NoABB raiz;

    public ArvoreBinariaBusca() {
        raiz = null;
    }

    public void adiciona(int elemento) {
        if (raiz == null) {
            raiz = new NoABB(elemento);
        } else {
            adiciona(elemento, raiz);
        }
    }

    private void adiciona(int elemento, NoABB raiz) {
        if (raiz.dado < 0) {
            if (raiz.esquerdo == null) {
                raiz.esquerdo = new NoABB(elemento);
            } else {
                adiciona(elemento, raiz.esquerdo);
            }
        } else if (raiz.dado > 0) {
            if (raiz.direito == null) {
                raiz.direito = new NoABB(elemento);
            } else {
                adiciona(elemento, raiz.direito);
            }
        }

        verificaBalanceamento();
    }

    public void verificaBalanceamento(){
        if(raiz.fb ==2){
            if (raiz.esquerdo.fb >= 0){
                //RSD
            }else{
                //RDD
            }
        } else if (raiz.fb == -2) {
            if (raiz.direito.fb <= 0){
                //RSE
            }else{
                //RDE
            }
        }
    }

    public boolean busca(int elemento) {
        if (raiz == null) {
            return false;
        } else {
            return busca(elemento, raiz);
        }
    }

    private boolean busca(int elemento, NoABB raiz) {
        if (elemento == raiz.dado) {
            return true;
        } else if (elemento < raiz.dado) {
            if (raiz.esquerdo == null) {
                return false;
            } else {
                return busca(elemento, raiz.esquerdo);
            }
        } else {
            if (raiz.direito == null) {
                return false;
            } else {
                return busca(elemento, raiz.direito);
            }
        }
    }

    public void remove(int elemento){
        if (raiz != null){
            remove(elemento,raiz,raiz);
        }
    }

    private void remove(int elemento, NoABB raiz, NoABB pai){
        if (elemento == raiz.dado) {
            if(raiz.esquerdo == null && raiz.direito == null){ //Não tem filhos
                if (raiz == pai.esquerdo) { //raiz.dado < raiz.pai.dado
                    pai.esquerdo = null;
                }else{
                    pai.direito = null;
                }
            } else if (raiz.esquerdo != null && raiz.direito == null) { //tem um filho(esquerda)
                if (raiz == pai.esquerdo) { //raiz.dado < raiz.pai.dado
                    pai.esquerdo = raiz.esquerdo;
                }else{
                    pai.direito = raiz.esquerdo;
                }
            }else if (raiz.esquerdo == null && raiz.direito != null) { //tem um filho(direito)
                if (raiz == pai.esquerdo) { //raiz.dado < raiz.pai.dado
                    pai.esquerdo = raiz.direito;
                }else{
                    pai.direito = raiz.direito;
                }
            }else{ //tem dois filhos
                raiz.dado = min(raiz.direito);
                remove(raiz.dado,raiz.direito,raiz);
                //raiz.dado = max(raiz.esquerdo);
                //remove(raiz.dado,raiz.direito,raiz);
            }
        } else if (elemento < raiz.dado) {
            if(raiz.esquerdo != null){
                remove(elemento, raiz.esquerdo,raiz);
            }
        }else {
            if(raiz.direito != null){
                remove(elemento,raiz.direito,raiz);
            }
        }
    }

    public int min(NoABB raiz){ //menor do lado esquerdo
        if(raiz.esquerdo == null){
            return raiz.dado;
        }else{
            return min(raiz.esquerdo);
        }
    }

    public int max(NoABB raiz){ //maior do lado direito
        if(raiz.direito == null){
            return raiz.dado;
        }else{
            return max(raiz.direito);
        }
    }
    public void exibir() {
        exibir(raiz);
        System.out.println();
    }

    private void exibir(NoABB raiz) {
        //PRÉ-ORDEM System.out.println(raiz.dado + " ");
        System.out.println(raiz.dado + " ");

        if (raiz.esquerdo != null) {
            exibir(raiz.esquerdo);
        }
        //EM ORDEM System.out.println(raiz.dado + " ");


        if (raiz.direito != null) {
            exibir(raiz.direito);
        }
        //PÓS-ORDEM System.out.println(raiz.dado + " ");

    }
}