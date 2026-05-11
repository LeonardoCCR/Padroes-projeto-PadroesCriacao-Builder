public class CarroBuilder implements VeiculoBuilder<Carro> {
    private Carro carro = new Carro();

    public CarroBuilder reset() { this.carro = new Carro(); return this; }

    @Override
    public CarroBuilder buildChassi(String chassi) { // Retorne CarroBuilder aqui
        this.carro.chassi = chassi;
        return this;
    }

    @Override
    public CarroBuilder buildRodas() {
        this.carro.rodas = 4;
        return this;
    }


    public CarroBuilder buildMotor(String motor) {
        this.carro.motor = motor;
        return this;
    }

    public CarroBuilder buildPortas(int portas) {
        this.carro.portas = portas;
        return this;
    }

    public Carro getResult() {
        return this.carro;
    }
}

