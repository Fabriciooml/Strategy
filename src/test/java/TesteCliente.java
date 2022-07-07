import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TesteCliente {

    Cliente cliente;

    @BeforeEach
    public void setUp() {
        cliente = new Cliente();
    }

    @Test
    public void deveConverterRealParaDolar() {
        cliente.converterDolar(100.00f);
        assertEquals(19.00f, cliente.getDinheiro());
    }

    @Test
    public void deveConverterRealParaEuro() {
        cliente.converterEuro(100.00f);
        assertEquals(18.00f, cliente.getDinheiro());
    }

    @Test
    public void deveConverterRealParaLibraEsterlina() {
        cliente.converterLibraEsterlina(100.00f);
        assertEquals(15.00f, cliente.getDinheiro());
    }

    @Test
    public void deveConverterRealParaZloty() {
        cliente.converterZloty(100.00f);
        assertEquals(86.00f, cliente.getDinheiro());
    }
}
