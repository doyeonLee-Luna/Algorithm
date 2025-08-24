



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));




        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        int L = Integer.parseInt(br.readLine());

        int answer1 = N + M - L;
        String SN = Integer.toString(N);
        String SM = Integer.toString(M);

        String SMSN = SN + SM;

        int SMSN1 = Integer.parseInt(SMSN);

        int answer2 = SMSN1 - L;

        System.out.println(answer1);
        System.out.println(answer2);


        }







    }



