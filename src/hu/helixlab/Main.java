package hu.helixlab;

public class Main {

    public static void main(String[] args) {

        FileOperation fileOperation = new FileOperation();
        fileOperation.printDirsInDirectory("C:\\AMD");
        fileOperation.printFilesInDirectory("C:\\AMD");
    }
}
