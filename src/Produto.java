public class Produto {
    // atributos da classe produto; caracteristicas
    //produtos possiveis; sanduiche, batata, refrigerante, salada


    private String nome; // exemplo: Mac Fish
    private String tipo; // exemplo: sanduiche
    private String tamanho; // 300 ml, 500 ml
    private double valor; //  r$ 30,00

    // definir os valores inicias da classe/atributo => estado inicial da classe
    // construtor

    public Produto(){
        this.setNome("");
        this.setTipo("");
        this.setTamanho("");
        this.setValor(0.0);
    }

    public Produto(String nome, String tipo, String tamanho, double valor){
        this.setNome(nome); // mac fish
        this.setTipo(tipo); // sanduiche
        this.setTamanho(tamanho); // unico
        this.setValor(30.0); // valor padrao/fixo fora do parametro, pois nao está definido nos parametros do construtor.
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }


}
