package dragonsVillage.Enums;

public enum EMapType {

    DEFAULT("map/default");

    private String path;

    EMapType(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }
}
