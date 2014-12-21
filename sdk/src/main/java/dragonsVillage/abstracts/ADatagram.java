package dragonsVillage.abstracts;

import java.io.Serializable;

public abstract class ADatagram <T> implements Serializable {
    private long id;
    private T datagram;

    public ADatagram(int id, T datagram){
        this.id = id;
        this.datagram = datagram;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public T getDatagram() {
        return datagram;
    }

    public void setDatagram(T datagram) {
        this.datagram = datagram;
    }
}
