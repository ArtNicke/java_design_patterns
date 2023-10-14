package desingPatterns.strategy;

public class ComportamentoNormal implements Comportamento{
    
    @Override
    public void mover() {
        System.out.printIn("Movendo-se normalmente...");
    }
}
