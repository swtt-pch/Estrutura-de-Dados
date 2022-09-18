public abstract class Console extends VideoGame{
    protected double carteira;

    public Console(double carteira) {
        this.carteira = carteira;
    }

    public void addCarteira(Double valor) {
        this.carteira += valor;
        System.out.println("Sua carteira tem: " + this.carteira);
    }

    @Override
    public void iniciarJogo() {
        System.out.println("Iniciando Jogo");
    }

    public void comprarJogo(Jogo jogo){
        jogos.add(jogo);
    };
}
