package aulamock;

import aulamock.entity.Inimigo;
import aulamock.service.InimigoService;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.assertEquals;

public class BuscaInimigoTest {

    @Test
    public void deveriaBuscarOInimigoSkeleton(){

        final InimigoService inimigoService = new InimigoServiceMock();
        final BuscaInimigo buscaInimigo = new BuscaInimigo(inimigoService);

        final Inimigo inimigo = buscaInimigo.buscaInimigo(10);

        assertEquals("Skeleton", inimigo.getNome());
        assertEquals(200.0, inimigo.getQtdVida(), 0.1);
        assertEquals("Espada do Skeleton", inimigo.getArma());
    }
}
