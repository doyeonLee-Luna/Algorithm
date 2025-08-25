

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));




        int[] nums = new int[9];
        
        for (int i = 0; i < 9; i++) {
            nums[i] = Integer.parseInt(br.readLine());
        }
        
        int max = nums[0];
        int index = 1;
        
        for (int j = 1; j < 9; j++) {
            if (nums[j] > max) {
                max = nums[j];
                index = j + 1;
            }
        }
        System.out.println(max);
        System.out.println(index);


        }







    }



