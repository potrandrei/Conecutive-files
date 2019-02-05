package File;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class App
{
    public static void main( String[] args ) throws IOException {
        String doc = "Valori";
        String dump="";
        int number = 0;
        for(int i = 1; i <= 10;i++){

            number++;

            dump = doc + number;
            String name = "D:\\Probe\\" + dump + ".txt";

            BufferedWriter bw = new BufferedWriter(new FileWriter("" + name + ""));
            bw.write("There's no secret.");
            bw.close();
        }
    }
}
