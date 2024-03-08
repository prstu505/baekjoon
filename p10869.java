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

        int a = Integer.parseInt(tokens[0]);
        int b = Integer.parseInt(tokens[1]);
        
        int r1 = a + b;
        int r2 = a - b;
        int r3 = a * b;
        int r4 = a / b;
        int r5 = a % b;

        bw.write(r1 + "\n" + r2 + "\n" + r3 + "\n" + r4 + "\n" + r5 + "\n");
        bw.flush();

        br.close();
        bw.close();
    }
}
