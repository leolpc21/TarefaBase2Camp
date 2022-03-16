package TarefaBase2Camp.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils {

    public static String getNowDate(Date mask){
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = mask;
        return dateFormat.format(date);
    }

    public static String getFileContent(String filePath) {
        BufferedReader br=null;
        StringBuilder sb=null;
        try {
            br = new BufferedReader(new FileReader(filePath));
            sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append("\n");
                line = br.readLine();
            }

            br.close();

        }  catch (Exception e) {
            e.printStackTrace();
        }

        return sb.toString();
    }
}
