import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Reverse {
    public static void main (String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();
        File sourceFile = new File("TextReverse.txt");
        BufferedReader file = null;
        BufferedWriter buffer;

        try {
            file = new BufferedReader(new FileReader(sourceFile));
            String contents = file.readLine();
            while (contents != null) {
                arrayList.add( contents + System.lineSeparator());
                contents = file.readLine();
            }
            Collections.reverse(arrayList);
            buffer = new BufferedWriter(new FileWriter(sourceFile));
            for (String reversed : arrayList) {
                buffer.write(reversed);
            }
            buffer.close();
        }

        catch (IOException e) {
            e.printStackTrace();
        }

        finally{
            try{
                assert file != null;
                file.close();
            }

            catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}