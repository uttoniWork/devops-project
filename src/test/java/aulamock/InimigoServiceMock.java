package aulamock;

import aulamock.service.InimigoService;

public class InimigoServiceMock implements InimigoService {
    @Override
    public String busca(Integer inimigoId) {

        if(inimigoId.equals(10))
            return InimigoConst.SKELETON;

        return null;
    }
}
