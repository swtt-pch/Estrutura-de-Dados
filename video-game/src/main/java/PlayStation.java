public class PlayStation extends Console implements Bonificavel{
    private boolean playPlus;

    public PlayStation(double carteira, boolean playPlus) {
        super(carteira);
        this.playPlus = playPlus;
    }

    public void comprarPlayPlus() {
        if (!playPlus) playPlus = true;
    }

    @Override
    public void receberBonus(Jogo jogo) {
        this.jogos.add(jogo);
    }
}
