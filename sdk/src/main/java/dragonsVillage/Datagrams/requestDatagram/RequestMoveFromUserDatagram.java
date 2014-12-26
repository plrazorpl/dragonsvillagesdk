package dragonsVillage.Datagrams.requestDatagram;

import dragonsVillage.Datagrams.ABaseToUserDatagram;
import dragonsVillage.Enums.EMoveSide;
import dragonsVillage.dtos.LoginUserDTO;

import java.io.Serializable;

public class RequestMoveFromUserDatagram extends ABaseToUserDatagram implements Serializable{
    private LoginUserDTO loginUserDTO;
    private EMoveSide moveSide;

    public RequestMoveFromUserDatagram(LoginUserDTO loginUserDTO, EMoveSide moveSide) {
        super(loginUserDTO.getCurrentMap().getId());
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
