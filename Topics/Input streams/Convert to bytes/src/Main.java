import java.io.InputStream;

class Main {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        byte[] x = inputStream.readAllBytes();
        for (byte y: x) {
            System.out.print(y);
        }
        inputStream.close();
    }
}
