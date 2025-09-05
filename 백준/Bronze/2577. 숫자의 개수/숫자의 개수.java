
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        int num = a * b * c;

        int[] counts = new int[10];

        String str = String.valueOf(num);

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int digit = ch - '0';
            counts[digit]++;

        }

        for (int i = 0; i < counts.length; i++) {
            System.out.println(counts[i]);
        }

    }
}