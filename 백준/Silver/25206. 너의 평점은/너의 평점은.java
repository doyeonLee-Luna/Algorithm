import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        double sumScore = 0; // 총점
        double totalCredits = 0; // 총 학점
        
        // 20개의 과목에 대해 입력 받기
        for (int i = 0; i < 20; i++) {
            // 사용자로부터 입력 받기
            String input = br.readLine();
            
            // 공백을 기준으로 입력을 분리
            StringTokenizer st = new StringTokenizer(input);
            String subject = st.nextToken(); // 과목명
            double grade = Double.parseDouble(st.nextToken()); // 학점
            String letterGrade = st.nextToken(); // 등급
            
            // P 학점은 GPA 계산에서 제외
            if (letterGrade.equals("P")) {
                continue;
            }
            
            // 해당 과목의 점수 계산
            if (letterGrade.equals("A+")) {
                sumScore += grade * 4.5;
                totalCredits += grade;
            } else if (letterGrade.equals("A0")) {
                sumScore += grade * 4.0;
                totalCredits += grade;
            } else if (letterGrade.equals("B+")) {
                sumScore += grade * 3.5;
                totalCredits += grade;
            } else if (letterGrade.equals("B0")) {
                sumScore += grade * 3.0;
                totalCredits += grade;
            } else if (letterGrade.equals("C+")) {
                sumScore += grade * 2.5;
                totalCredits += grade;
            } else if (letterGrade.equals("C0")) {
                sumScore += grade * 2.0;
                totalCredits += grade;
            } else if (letterGrade.equals("D+")) {
                sumScore += grade * 1.5;
                totalCredits += grade;
            } else if (letterGrade.equals("D0")) {
                sumScore += grade * 1.0;
                totalCredits += grade;
            } else if (letterGrade.equals("F")) {
                // F는 점수에 영향을 주지 않음, 학점만 고려
                totalCredits += grade;
            }
        }
        
        // GPA 계산
        double result = sumScore / totalCredits;
        
        // 결과 출력
        System.out.printf("%.6f\n", result);
    }
}
