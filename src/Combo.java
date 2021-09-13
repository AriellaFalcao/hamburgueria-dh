public class Combo {

    // atributos da classe Combo
    // atributos estão encapsulados

    private String sanduiche;
    private String batataFrita;
    private String refrigerante;
    private String salada;


    // construtor = método -> serve para inicializar a classe com new() e estado inicial do objeto
    // existe mais de uma forma de declarar construtor
    // esse sem parametro = bandeja sem definir os produtos
//    public Combo() {
//        this.setSanduiche("");
//        this.setBatataFrita("");
//        this.setRefrigerante("");
//        this.setSalada("");
//    }

    // construtor de atribuicao
    // definir estado inicial do objeto com valores passados por parametro
    // bandeja já vem com os produtos
    public Combo(String sanduiche, String batataFrita, String refrigerante, String salada) {
        this.setSanduiche(sanduiche);
        this.setBatataFrita(batataFrita);
        this.setRefrigerante(refrigerante);
        this.setSalada(salada);
    }


    public String getSanduiche(){
        return this.sanduiche;
    }

    public void setSanduiche(String sanduiche) {
        this.sanduiche = sanduiche;
        // sanduiche = "Mac Fish"
    }


    public String getBatataFrita() {
        return batataFrita;
    }

    public void setBatataFrita(String batataFrita) {
        this.batataFrita = batataFrita;
    }

    public String getRefrigerante() {
        return refrigerante;
    }

    public void setRefrigerante(String refrigerante) {
        this.refrigerante = refrigerante;
    }

    public String getSalada() {
        return salada;
    }

    public void setSalada(String salada) {
        this.salada = salada;
    }

}
