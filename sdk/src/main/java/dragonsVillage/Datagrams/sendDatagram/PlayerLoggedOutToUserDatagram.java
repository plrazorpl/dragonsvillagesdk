package dragonsVillage.Datagrams.sendDatagram;

import dragonsVillage.Datagrams.ABaseToUserDatagram;
import dragonsVillage.dtos.LoginUserDTO;

import java.io.Serializable;

public class PlayerLoggedOutToUserDatagram implements Serializable {
    private LoginUserDTO user;

    public PlayerLoggedOutToUserDatagram(LoginUserDTO user) {
        this.user = user;
    }

    public LoginUserDTO getUser() {
        return user;
    }

    public void setUser(LoginUserDTO user) {
        this.user = user;
    }
}
