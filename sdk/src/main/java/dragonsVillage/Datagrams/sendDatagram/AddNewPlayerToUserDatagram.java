package dragonsVillage.Datagrams.sendDatagram;

import dragonsVillage.Datagrams.ABaseToUserDatagram;
import dragonsVillage.dtos.LoginUserDTO;

import java.io.Serializable;

public class AddNewPlayerToUserDatagram implements Serializable {

    private LoginUserDTO loginUserDTO;

    public AddNewPlayerToUserDatagram(LoginUserDTO loginUserDTO){
        this.loginUserDTO = loginUserDTO;
    }

    public LoginUserDTO getLoginUserDTO() {
        return loginUserDTO;
    }

    public void setLoginUserDTO(LoginUserDTO loginUserDTO) {
        this.loginUserDTO = loginUserDTO;
    }
}
