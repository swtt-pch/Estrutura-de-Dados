import java.util.ArrayList;
import java.util.List;

public class ControlePremio {
    List<Premiavel> premiavels;

    public ControlePremio() {
        this.premiavels = new ArrayList<>();
    }

    public void addPremiavel(Premiavel premiavel){
        if (premiavels.contains(premiavel)){
            System.out.println("Objeto já existente nessa instância");
            return;
        }
        premiavels.add(premiavel);
        System.out.println("Objeto adicionado");
    }

    public Double somaPremio(){
        if (premiavels.size() == 0) return null;
        double total = 0;
        for (Premiavel premiavel : premiavels){
            total += premiavel.getPremio();
        }
        return total;
    }

    public Premiavel maiorPremio(){
        if (premiavels.size() == 0) return null;
        Premiavel curPremiavel = premiavels.get(0);
        for (int i = 1; i < premiavels.size(); i++) {
            if (curPremiavel.getPremio() < premiavels.get(i).getPremio()) {
                curPremiavel = premiavels.get(i);
            }
        }
        return curPremiavel;
    }

    public Premiavel menorPremio(){
        if (premiavels.size() == 0) return null;
        Premiavel curPremiavel = premiavels.get(0);
        for (int i = 1; i < premiavels.size(); i++) {
            if (curPremiavel.getPremio() > premiavels.get(i).getPremio()) {
                curPremiavel = premiavels.get(i);
            }
        }
        return curPremiavel;
    }
}
