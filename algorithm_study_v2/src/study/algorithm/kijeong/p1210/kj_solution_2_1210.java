package study.algorithm.kijeong.p1210;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class kj_solution_2_1210 {
    static void solution(int[] numbers) {
        String answer = "";

        int max = 0;

        for (int i = 0; i < numbers.length; i++) {
            String value = "";
            value += String.valueOf(numbers[i]);
            max = Integer.parseInt(value);
        }
//        for(int i = numbers.length - 1; i > 0; i--) {
//         String value = "";
//         for(int j = 0; j < i; j++) {
//            value += String.valueOf(numbers[j]);
//
//            if(numbers[j] > numbers[j + 1]) {
//               int temp2 = numbers[j];
//               numbers[j] = numbers[j + 1];
//               numbers[j + 1] = temp2;
//            }
//         }
//         int temp = Integer.parseInt(value);
//
//         if(temp > max) {
//            max = temp;
//         }
//      }

        System.out.println(max);
//      System.out.println(value);
//      return answer;
    }




    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());

        int[] numbers = new int[n];

        st = new StringTokenizer(br.readLine(), " ");

        for(int i = 0; i < n; i++)
            numbers[i] = Integer.parseInt(st.nextToken());

        //String answer = solution(numbers);
        solution(numbers);
        //bw.write(answer);
        br.close();
        bw.close();
    }

}
