package controller;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import model.Word;

/**
 * Fájlműveletek kezelésére szolgáló osztály
 * @author Márta Krisztián
 * @since 2022-06-30
 * @version 1.0
 */
public class FileAction {

    /**
     * Szavak beolvasás fájlból
     * @param filename A beolvasandó fájl neve
     * @return A beolvasott szavakat tartalmazó lista
     */
    public static List<Word> fileReader(String filename) {
        RandomAccessFile raf;
        String row;
        String[] partsOfRow;
        List<Word> list = new ArrayList<>();
        try {
            raf = new RandomAccessFile(filename, "r");
            //row = raf.readLine();
            row = raf.readLine();
            while (row != null) {
                row = new String(row.getBytes("ISO-8859-1"));
                partsOfRow = row.split(";");
                list.add(new Word(partsOfRow[0], partsOfRow[1]));
                row = raf.readLine();
            }
            raf.close();
        } catch (IOException e) {
            System.out.println("Hiba: " + e.getMessage());
        }
        return list;
    }
}
