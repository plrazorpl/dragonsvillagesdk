package dragonsVillage.Enums;

public enum EPlayerSkin {
    DEFAULT("playerSkin/default.png","playerSkin/default.png","playerSkin/default.png","playerSkin/default.png"),
    KNIGHT("playerSkin/knight/left.png","playerSkin/knight/right.png","playerSkin/knight/down.png","playerSkin/knight/up.png");

    private String left;
    private String right;
    private String down;
    private String up;

    EPlayerSkin(String left, String right, String down, String up) {

        this.left = left;
        this.right = right;
        this.down = down;
        this.up = up;
    }

    public String getLeft() {
        return left;
    }

    public String getRight() {
        return right;
    }

    public String getDown() {
        return down;
    }

    public String getUp() {
        return up;
    }
}
