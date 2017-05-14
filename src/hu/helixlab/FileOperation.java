package hu.helixlab;

import java.io.*;

/**
 * Created by Hp_Workplace on 2017. 05. 13..
 */
public class FileOperation {

    public void printDirsInDirectory(String dir) {
        File path = new File(dir);
        File[] listOffiles = path.listFiles();

        for (int i = 0; i < listOffiles.length; i++) {
            if (listOffiles[i].isDirectory()) {
                System.out.println("Mappák: " + listOffiles[i].getName());

            }
        }
    }

    public void printFilesInDirectory(String dir) {
        File path = new File(dir);
        File[] listOffiles = path.listFiles();

        for (int i = 0; i < listOffiles.length; i++) {
            if (listOffiles[i].isFile()) {
                System.out.println("Fájlok: " + listOffiles[i].getName());

            }
        }
    }

    public void printAllInDirectory(String dir) {
        File path = new File(dir);
        File[] listOffiles = path.listFiles();
        for (int i = 0; i < listOffiles.length; i++) {
            if (listOffiles[i].isFile()) {
                System.out.println("Fájlok: " + listOffiles[i].getName());
            } else if (listOffiles[i].isDirectory()) {
                System.out.println("Mappák: " + listOffiles[i].getName());
            }
        }

    }

    public boolean isFilesEquals(String path1, String path2) {

        boolean equal = true;
        try {
            BufferedReader read1 = new BufferedReader(new FileReader(path1));
            BufferedReader read2 = new BufferedReader(new FileReader(path2));

            String line1 = read1.readLine();
            String line2 = read2.readLine();

            while (line1 != null || line2 != null) {
                if (line1 == null || line2 == null) {
                    equal = false;
                    break;
                } else if (!line1.equalsIgnoreCase(line2)) {
                    equal = false;
                    break;
                }
                line1 = read1.readLine();
                line2 = read2.readLine();
            }
            read1.close();
            read2.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return equal;
    }

    public String searchFile(String file) {
        String path = "";
        String dirName = "C:\\";
        File myFile = new File(dirName);
        File[] listOfFiles = myFile.listFiles();
        if (listOfFiles != null) {
            for (File file1 : listOfFiles) {
                if (file.equalsIgnoreCase(file1.getName())) {
                    path = file1.getParentFile() + "\\" + file1.getName();
                    break;
                }else {
                    path = "Nincs ilyen fájl!";
                }
            }
        }
        return path;

    }
}
