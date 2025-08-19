import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(br.readLine());

        if ( number % 4 == 0 && number % 100 != 0 || number % 400 == 0) {
            System.out.println("1");
        }
        else {
            System.out.println("0");
        }

    }


}