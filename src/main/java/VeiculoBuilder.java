public interface VeiculoBuilder<T extends Veiculo> {
    VeiculoBuilder<T> reset();
    VeiculoBuilder<T> buildChassi(String chassi);
    VeiculoBuilder<T> buildRodas();
    VeiculoBuilder<T> buildMotor(String motor);
    T getResult();
}

//Estou utilizando generics pois com a especificação de veículo para Carro e Moto, temos um problema
// Eu não posso utilizar no getResult um veículo genérico para os dois builders que implementariam essa interface
//esse veículo builder, com isso cada builder pode criar e retornar especificamente o objeto da herança