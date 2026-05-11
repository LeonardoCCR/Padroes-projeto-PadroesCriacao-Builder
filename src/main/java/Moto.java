public class Moto extends Veiculo {
    public boolean temCarenagem;
    @Override
    public String toString() {
        return "Moto [Chassi=" + chassi + ", Rodas=" + rodas + ", Carenagem=" + temCarenagem + "]";
    }
}