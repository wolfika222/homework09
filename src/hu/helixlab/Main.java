package hu.helixlab;

public class Main {

    public static void main(String[] args) {

        FileOperation fileOperation = new FileOperation();
        fileOperation.printDirsInDirectory("C:\\AMD");
        fileOperation.printFilesInDirectory("C:\\AMD");
        fileOperation.printAllInDirectory("C:\\AMD");
        System.out.println(fileOperation.isFilesEquals("C:\\kaka.txt", "C:\\AMD\\kaka.txt"));
        System.out.println(fileOperation.searchFile("valami.txt"));
    }
}
