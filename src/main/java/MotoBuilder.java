public class MotoBuilder implements VeiculoBuilder<Moto> {
    private Moto moto;

    public MotoBuilder() {
        this.reset();
    }

    @Override
    public MotoBuilder reset() {
        this.moto = new Moto();
        return this;
    }

    @Override
    public MotoBuilder buildChassi(String chassi) {
        this.moto.chassi = chassi;
        return this;
    }

    @Override
    public MotoBuilder buildRodas() {
        this.moto.rodas = 2; // Especificidade da Moto
        return this;
    }

    @Override
    public MotoBuilder buildMotor(String motor) {
        this.moto.motor = motor;
        return this;
    }


    public MotoBuilder buildCarenagem(boolean temCarenagem) {
        this.moto.temCarenagem = temCarenagem;
        return this;
    }

    @Override
    public Moto getResult() {
        Moto resultado = this.moto;
        this.reset();
        return resultado;
    }
}