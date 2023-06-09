public class File {
    private String name;
    private String extension;

    public File() {
        name = "";
        extension = ".txt";
    }

    public File(String name, String extension) {
        this.name = name;
        this.extension = extension;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public void printFile() {
        System.out.println(name + extension);
    }
}
