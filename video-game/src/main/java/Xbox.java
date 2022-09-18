public class Xbox extends Console implements Bonificavel{
    private boolean liveGold;

    public Xbox(double carteira, boolean liveGold) {
        super(carteira);
        this.liveGold = liveGold;
    }

    public void comprarLiveGold() {
        if (!liveGold) liveGold = true;
    }

    @Override
    public void receberBonus(Jogo jogo) {
        this.jogos.add(jogo);
    }
}
