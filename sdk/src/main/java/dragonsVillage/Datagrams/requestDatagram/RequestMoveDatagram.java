package dragonsVillage.Datagrams.requestDatagram;

import dragonsVillage.Enums.EMoveSide;
import dragonsVillage.dtos.LoginUserDTO;

import java.io.Serializable;

public class RequestMoveDatagram implements Serializable{
    private LoginUserDTO loginUserDTO;
    private EMoveSide moveSide;

    public RequestMoveDatagram(LoginUserDTO loginUserDTO, EMoveSide moveSide) {
        this.loginUserDTO = loginUserDTO;
        this.moveSide = moveSide;
    }

    public LoginUserDTO getLoginUserDTO() {
        return loginUserDTO;
    }

    public void setLoginUserDTO(LoginUserDTO loginUserDTO) {
        this.loginUserDTO = loginUserDTO;
    }

    public EMoveSide getMoveSide() {
        return moveSide;
    }

    public void setMoveSide(EMoveSide moveSide) {
        this.moveSide = moveSide;
    }
}
