import java.util.ArrayList;

public class PC extends VideoGame{

    public PC() {
        this.jogos = new ArrayList<>();
    }

    @Override
    public void iniciarJogo() {
        System.out.println("Iniciando Jogo");
    }

    public void piratearJogo(Jogo jogo) {
        jogos.add(jogo);
    }
}
