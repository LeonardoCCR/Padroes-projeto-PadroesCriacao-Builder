import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

class BuildersTest {

    @Test
    @DisplayName("Deve construir um Carro completo usando a interface fluente")
    void deveConstruirCarroPontoAPonto() {

        CarroBuilder builder = new CarroBuilder();

        Carro carro = builder.reset()
                .buildChassi("ABC-123")
                .buildMotor("2.0 Turbo")
                .buildRodas()
                .buildPortas(4)
                .getResult();


        assertNotNull(carro);
        assertEquals("ABC-123", carro.chassi);
        assertEquals("2.0 Turbo", carro.motor);
        assertEquals(4, carro.rodas);
        assertEquals(4, carro.portas);
    }

    @Test
    @DisplayName("Deve construir uma Moto com carenagem usando a interface fluente")
    void deveConstruirMotoPontoAPonto() {

        MotoBuilder builder = new MotoBuilder();

        Moto moto = builder.reset()
                .buildChassi("XYZ-999")
                .buildMotor("1000cc")
                .buildRodas()
                .buildCarenagem(true)
                .getResult();


        assertNotNull(moto);
        assertEquals("XYZ-999", moto.chassi);
        assertEquals(2, moto.rodas, "Motos devem ter sempre 2 rodas");
        assertTrue(moto.temCarenagem);
    }

    @Test
    @DisplayName("Deve garantir que o objeto seja resetado para uma nova construção")
    void deveGarantirIndependenciaEntreConstrucoes() {

        CarroBuilder builder = new CarroBuilder();
        builder.buildChassi("CHASSI-1").buildMotor("V8").getResult();

        Carro segundoCarro = builder.reset().buildChassi("CHASSI-2").getResult();

        assertNull(segundoCarro.motor, "O motor do segundo carro deveria estar nulo após o reset");
        assertEquals("CHASSI-2", segundoCarro.chassi);
    }
}