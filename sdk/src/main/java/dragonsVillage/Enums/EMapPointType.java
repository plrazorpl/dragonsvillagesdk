package dragonsVillage.Enums;

import java.io.Serializable;

public enum EMapPointType implements Serializable {
    GROUND(false, "/ground.png"),
    BUSHES(false, "/bushes.png"),
    TREE(true, "/tree.png"),
    DRAGON(true, "/empty.png");

    private boolean blocked;
    private String path;

    EMapPointType(boolean blocked, String path) {

        this.blocked = blocked;
        this.path = path;
    }

    public boolean isBlocked() {
        return blocked;
    }

    public String getPath() {
        return path;
    }
}
