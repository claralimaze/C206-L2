public class Personagem {
    private String nome;
    private int vida;

    public Personagem(String nome, int vida) {
        this.nome = nome;
        this.vida = vida;
    }

    public void addArma(Arma arma){
        Arma visao = new Arma();
        visao.setDano(0);
        visao.setDurabilidade(100);
        Arma laser = new Arma();
        laser.setDano(20);
        laser.setDurabilidade(50);
        Arma fogo = new Arma();
        fogo.setDano(25);
        fogo.setDurabilidade(20);
        Arma congelar = new Arma();
        congelar.setDano(50);
        congelar.setDurabilidade(0);
    }

    public void mostrarArmas(){
        Arma arma;
        System.out.println("Arma do personagem: "+ arma);
    }


    public void atacar(int posicao, Personagem personagem){
        if(vida > 0) {
            System.out.println("O " + personagem.getNome() + "na posição" + posicao + " esta sendo atacado");
            personagem.setVida(10);
        } else {
            System.out.println("Personagem já foi derrotado");
        }
    }

    public void usarHabilidade(){
        System.out.println("Usando habilidade do " + nome);
    }
    public void mostrarCaracteristicas(){
        System.out.println("Nome do personagem: "+nome);
        System.out.println("Vida do personagem: "+vida);
        if(vida == 0){
            System.out.println("Inimigo derrotado, não precisa atacá-lo");
        } else {
            System.out.println("Atacar!!!");
        }
    }
    public String getNome() {
        return nome;
    }
    public void setVida(int vida) {
        this.vida -= vida;
    }
}
