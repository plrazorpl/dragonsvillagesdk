package dragonsVillage.Enums;

import java.io.Serializable;

public enum EMapPointType implements Serializable {
    GROUND(0),
    BUSHES(1),
    MOUNT(2),
    WALL(3),
    FANCE(4);

    private int value;

    EMapPointType(int value) {
        this.value = value;
    }
}
