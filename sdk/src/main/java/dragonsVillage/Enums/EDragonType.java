package dragonsVillage.Enums;

public enum EDragonType {
    DEFAULT("dragons/default.png","dragons/default.png",1),
    LITTLE_BLUE("dragons/small/dragonBlueLeft.png","dragons/small/dragonBlueRight.png",1);


    private String left;
    private String right;
    private int size;

    EDragonType(String left, String right, int size) {
        this.left = left;
        this.right = right;
        this.size = size;
    }

    public String getLeft() {
        return left;
    }

    public int getSize() {
        return size;
    }

    public String getRight() {
        return right;
    }
}
