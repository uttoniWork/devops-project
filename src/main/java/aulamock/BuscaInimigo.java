package aulamock;

import aulamock.entity.Inimigo;
import aulamock.service.InimigoService;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class BuscaInimigo {
    private final InimigoService inimigoService;

    public BuscaInimigo(InimigoService inimigoService) {
        this.inimigoService = inimigoService;
    }

    public Inimigo buscaInimigo(Integer inimigoId){

        final String inimigoJson = inimigoService.busca(inimigoId);
        final JsonObject jsonObject = JsonParser.parseString(inimigoJson).getAsJsonObject();

        return new Inimigo(
                jsonObject.get("nome").getAsString(),
                jsonObject.get("qtdVida").getAsDouble(),
                jsonObject.get("arma").getAsString()
        );
    }
}
