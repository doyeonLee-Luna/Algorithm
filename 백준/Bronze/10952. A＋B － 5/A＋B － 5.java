


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();





        while( true ) {
            String line = br.readLine();
            if ( line == null ) break;
            if (line.trim().isEmpty()) continue;

            StringTokenizer st = new StringTokenizer(line);

            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            if ( n == 0 && m == 0) break;
            sb.append(n+m).append("\n");
        }

        System.out.println(sb.toString());



        }







    }



