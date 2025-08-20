import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();


        for (int i = 0; i < n; i++) {
            int y = Integer.parseInt(st.nextToken());
            if ( y < x ) {
                sb.append(y).append(" ");
            }
        }
        
        System.out.println(sb.toString().trim());

    }


}