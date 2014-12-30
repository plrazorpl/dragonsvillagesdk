package dragonsVillage.Enums;

public enum EDragonType {
    DEFAULT("dragons/default.png",1);

    private String path;
    private int size;

    EDragonType(String path, int size) {
        this.path = path;
        this.size = size;
    }

    public String getPath() {
        return path;
    }

    public int getSize() {
        return size;
    }
}
