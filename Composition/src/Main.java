public class Main {
    public static void main(String[] args) {
        Folder rootFolder = new Folder("php_demo1");

        Folder[] level1Folders = {
                new Folder("Source Files"),
                new Folder("Include Path"),
                new Folder("Remote File")
        };

        Folder[] level2Folders = {
                new Folder(".phalcon"),
                new Folder("app"),
                new Folder("cache"),
                new Folder("public")
        };

        File[] level2Files = {
                new File("", ".htaccess"),
                new File(".htrouter", ".php"),
                new File("index", ".html")
        };

        Folder[] level3Folders = {
                new Folder("config"),
                new Folder("controllers"),
                new Folder("library"),
                new Folder("migrations"),
                new Folder("models"),
                new Folder("views")
        };

        rootFolder.setSubFolders(level1Folders);
        level1Folders[0].setSubFolders(level2Folders);
        level1Folders[0].setFiles(level2Files);
        level2Folders[1].setSubFolders(level3Folders);

        System.out.println("Folder structure:");
        rootFolder.printFolderContent();
        System.out.println();

        level1Folders[0].deleteSubFolderByName("app");
        System.out.println("Folder structure after deleting app folder");
        rootFolder.printFolderContent();
        System.out.println();

        level1Folders[0].deleteSubFolderByName("public");
        System.out.println("Folder structure after deleting public folder");
        rootFolder.printFolderContent();
    }
}