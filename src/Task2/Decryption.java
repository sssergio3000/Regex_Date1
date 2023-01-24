package Task2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Decryption {

    static void decrypt(File file) throws IOException {

        //reading from file to String
        Scanner scan = new Scanner(file);
        String strFromFile = scan.useDelimiter("\\z").next();

        //preposition string list to Array
        String preposition = "в, без, до, из, к, на, по, о, от, перед, при, через, с, у, за, над, об, под, про, для";
        String[] prepArr = preposition.split("\\,\\ ");

        //String from file to list of tokens
        StringTokenizer strtknz = new StringTokenizer(strFromFile, "\\ \\.\\,\\(\\)\\'\\\"\\-\\+\\s", true);
        List<String> list = new ArrayList<>();
        while (strtknz.hasMoreTokens()) {
            list.add(strtknz.nextToken());
        }

        //search and replace preps to Java
        for (String elemPrep : prepArr) {
            for (int i = 0; i < list.size(); i++) {
                if (elemPrep.equals(list.get(i))) {
                    list.set(i, "Java");
                }
            }
        }

        //creating string from list
        String resStr = "";
        for (String s : list) {
            resStr += s;

        }

        FileWriter fw = new FileWriter(file);
        fw.append(resStr);
        fw.close();


    }

    public static void main(String[] args) throws IOException {
        File file = new File("D:\\downloads\\cbs\\projects\\Regex_Date\\src\\Task2\\text.txt");
        decrypt(file);
        Scanner scan = new Scanner(file);
        String strFromFile = scan.useDelimiter("\\z").next();
        System.out.println(strFromFile);


    }
}
