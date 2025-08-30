
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int t = 0; t < T; t++) {
            int number = Integer.parseInt(st.nextToken());
                min = Math.min(min, number);
                max = Math.max(max, number);
            }

            
        sb.append(min).append(" ").append(max);
        System.out.println(sb);
        }

     
    }

