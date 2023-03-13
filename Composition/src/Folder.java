public class Folder {
    private String name;
    private Folder[] subFolders;
    private File[] files;

    public Folder(String name) {
        this.name = name;
        subFolders = new Folder[0];
        files = new File[0];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Folder[] getSubFolders() {
        return subFolders;
    }

    public void setSubFolders(Folder[] subFolders) {
        this.subFolders = subFolders;
    }

    public File[] getFiles() {
        return files;
    }

    public void setFiles(File[] files) {
        this.files = files;
    }

    private void recursiveFolderPrinter(Folder[] folders, int index, int tabIndent) {
        if (folders.length == 0) return;
        if (index >= folders.length) return;

        Folder folder = folders[index];
        System.out.println("\t".repeat(tabIndent) + folder.getName() + '/');

        if (folder.getSubFolders().length != 0)
            recursiveFolderPrinter(folder.getSubFolders(), 0, tabIndent + 1);

        for (File file: folder.getFiles()) {
            System.out.print("\t".repeat(tabIndent + 1));
            file.printFile();
        }

        if (folders.length > 1)
            recursiveFolderPrinter(folders, index + 1, tabIndent);
    }

    public void printFolderContent() {
        recursiveFolderPrinter(new Folder[] { this }, 0, 0);
    }

    private int findIndexOfSubFolderByName(String nameOfSubFolderToFind) {
        for (int i = 0; i < this.subFolders.length; ++i)
            if (this.subFolders[i].getName().equals(nameOfSubFolderToFind))
                return i;
        return -1;
    }

    public void deleteSubFolderByName(String nameOfSubFolderToDelete) {
        int indexOfSubFolderToDelete = findIndexOfSubFolderByName(nameOfSubFolderToDelete);
        if (indexOfSubFolderToDelete == -1) return;
        Folder[] updatedSubFoldersList = new Folder[this.subFolders.length - 1];
        int j = 0;
        for (int i = 0; i < this.subFolders.length; ++i)
            if (i != indexOfSubFolderToDelete) {
                updatedSubFoldersList[j] = this.subFolders[i];
                ++j;
            }
        this.setSubFolders(updatedSubFoldersList);
    }
}
