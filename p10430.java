import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] token = br.readLine().split(" ");
        int a = Integer.parseInt(token[0]);
        int b = Integer.parseInt(token[1]);
        int c = Integer.parseInt(token[2]);

        int r1 = (a + b) % c;
        int r2 = ((a % c) + (b % c)) % c;
        int r3 = (a * b) % c;
        int r4 = ((a % c) * (b % c)) % c;

        bw.write(r1 + "\n" + r2 + "\n" + r3 + "\n" + r4 + "\n");
        bw.flush();

        br.close();
        bw.close();
    }
}
