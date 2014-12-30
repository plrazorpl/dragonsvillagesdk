package dragonsVillage.Datagrams.requestDatagram;

import dragonsVillage.Datagrams.ABaseToUserDatagram;
import dragonsVillage.Enums.EMoveSide;
import dragonsVillage.dtos.LoginUserDTO;

import java.io.Serializable;

public class RequestMoveFromUserDatagram extends ABaseToUserDatagram implements Serializable{
    private Long userID;
    private EMoveSide moveSide;

    public RequestMoveFromUserDatagram(LoginUserDTO loginUserDTO, EMoveSide moveSide) {
        super(loginUserDTO.getCurrentMap().getId());
        this.userID = loginUserDTO.getId();
        this.moveSide = moveSide;
    }

    public Long getUserID() {
        return userID;
    }

    public void setUserID(Long userID) {
        this.userID = userID;
    }

    public EMoveSide getMoveSide() {
        return moveSide;
    }

    public void setMoveSide(EMoveSide moveSide) {
        this.moveSide = moveSide;
    }
}
