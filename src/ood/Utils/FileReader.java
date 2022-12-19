package ood.Utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;

/**
* The File reader to handle different file in to a file object.
* */
public class FileReader {
    LinkedHashMap<Integer, String> propertyMap = new LinkedHashMap<>();


    public LinkedHashMap readFile(String filePath){
        try {
            String encoding = "utf-8";
            File file = new File(filePath);
            if (file.isFile() && file.exists()) {
                InputStreamReader read = new InputStreamReader(
                        new FileInputStream(file), encoding);
                BufferedReader bufferedReader = new BufferedReader(read);
                String lineTxt = null;
                int i = 1;
                bufferedReader.readLine();
                while ((lineTxt = bufferedReader.readLine()) != null) {
                    if(!lineTxt.equals("")) {
                        propertyMap.put(i, lineTxt);
                        i++;
                    }
                }
                read.close();
            } else {
                System.out.println("File not found");
            }
        } catch (Exception e) {
            System.out.println("Read Error");
            e.printStackTrace();
        }
        return propertyMap;
    }

}
