


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));




        int N = Integer.parseInt(br.readLine());
        String numbers = br.readLine();


        int sum = 0;
        for (int i = 0; i < N; i++) {
            char c = numbers.charAt(i);
            int digit = Character.getNumericValue(c);
            sum += digit;
        }

        
        System.out.println(sum);






        }







    }



