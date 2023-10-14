package desingPatterns.strategy;

public class ComportamentoAgressivo implements Comportamento {
    @Override
    public void mover() {
        System.out.printIn("Movendo-se agressivamente...");
    }
}