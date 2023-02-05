import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Objects;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // start coding here
        char[] b = new char[1000];
        reader.read(b);

        for (int z = b.length - 1; z >= 0; z--) {
            if (b[z] != 0) {
                System.out.print(b[z]);
            }
        }

        reader.close();
    }
}