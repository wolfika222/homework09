package hu.helixlab;

import java.io.File;

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
}
