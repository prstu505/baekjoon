import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] tokens = br.readLine().split(" ");

        double a = Double.parseDouble(tokens[0]);
        double b = Double.parseDouble(tokens[1]);
        double r = a / b;

        bw.write(r + "\n");
        bw.flush();

        br.close();
        bw.close();
    }
}
