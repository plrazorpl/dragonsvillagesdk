package dragonsVillage.Datagrams.sendDatagram;

import dragonsVillage.dtos.LoginUserDTO;

import java.io.Serializable;

public class PlayerLoggedOutDatagram implements Serializable {
    private LoginUserDTO user;

    public PlayerLoggedOutDatagram(LoginUserDTO user) {
        this.user = user;
    }

    public LoginUserDTO getUser() {
        return user;
    }

    public void setUser(LoginUserDTO user) {
        this.user = user;
    }
}
