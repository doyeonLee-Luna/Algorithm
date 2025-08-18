import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int sum = 0;


        for (int i = 0; i < input.length; i++) {
            int num = Integer.parseInt(input[i]);
            sum += num * num;
        }

        int check = sum  % 10;
        System.out.println(check);
    }


}