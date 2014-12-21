package dragonsVillage.Datagrams.sendDatagram;

import dragonsVillage.dtos.LoginUserDTO;

import java.io.Serializable;

public class AddNewPlayerDatagram implements Serializable {

    private LoginUserDTO loginUserDTO;

    public AddNewPlayerDatagram(LoginUserDTO loginUserDTO){
        this.loginUserDTO = loginUserDTO;
    }

    public LoginUserDTO getLoginUserDTO() {
        return loginUserDTO;
    }

    public void setLoginUserDTO(LoginUserDTO loginUserDTO) {
        this.loginUserDTO = loginUserDTO;
    }
}
