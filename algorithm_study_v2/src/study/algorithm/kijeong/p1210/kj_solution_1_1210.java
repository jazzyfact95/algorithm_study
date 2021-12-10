package study.algorithm.kijeong.p1210;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
배열 array의 i번째 숫자부터 j번째 숫자까지 자르고 정렬했을 때, k번째에 있는 수를 구하려 합니다.

예를 들어 array가 [1, 5, 2, 6, 3, 7, 4], i = 2, j = 5, k = 3이라면

array의 2번째부터 5번째까지 자르면 [5, 2, 6, 3]입니다.
1에서 나온 배열을 정렬하면 [2, 3, 5, 6]입니다.
2에서 나온 배열의 3번째 숫자는 5입니다.
배열 array, [i, j, k]를 원소로 가진 2차원 배열 commands가 매개변수로 주어질 때, commands의 모든 원소에 대해 앞서 설명한 연산을 적용했을 때 나온 결과를 배열에 담아 return 하도록 solution 함수를 작성해주세요.

제한사항
array의 길이는 1 이상 100 이하입니다.
array의 각 원소는 1 이상 100 이하입니다.
commands의 길이는 1 이상 50 이하입니다.
commands의 각 원소는 길이가 3입니다.
 */
public class kj_solution_1_1210 {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
        StringTokenizer st;

        try {
            st = new StringTokenizer(br.readLine(), " ");
            int arrayleng = Integer.parseInt(st.nextToken());

            int[] array = new int[arrayleng];

            st = new StringTokenizer(br.readLine(), " ");

            for(int i = 0; i < array.length; i++)
                array[i] = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine(), " ");
            int commandsleng = Integer.parseInt(st.nextToken());
            int[][] commands = new int[commandsleng][3];

            for(int i = 0; i < commands.length; i++) {
                st = new StringTokenizer(br.readLine(), " ");
                for(int j = 0; j < commands[i].length; j++) {
                    commands[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            int[] result = new int[commands.length];
            result = solution(array, commands).clone();

            for(int i = 0; i < result.length; i++) {
                System.out.println(result[i]);
            }

//            int[] result = new int[commands.length];
//
//            for(int i = 0; i < commands.length; i++) {
//               int len1 = commands[i][0];
//               int len2 = commands[i][1];
//               int choice = commands[i][2];
//                int[] array3 = arrayays.copyOfRange(array, len1 - 1, len2 - 1);
//                arrayays.sort(array3);
//                result[i] = array3[choice - 1];
//                System.out.println(result[i]);
//            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    public static int[] solution(int[] array, int[][] commands) {

        int[] answer = new int[commands.length];
        for(int i = 0; i < commands.length; i++) {
            int len1 = commands[i][0];
            int len2 = commands[i][1];
            int choice = commands[i][2];
            int[] array3 = Arrays.copyOfRange(array, len1 - 1, len2);
            Arrays.sort(array3);
            answer[i] = array3[choice - 1];

        }
//      for(int i = 0; i < commands.length; i++) {
//
//           int[] result = new int[commands[i][1] - (commands[i][0] - 1)];
//
//           for(int j = 0; j < result.length; j++) {
//              result[j] = array[j + (commands[i][0] - 1)];
//
//           }
//           Arrays.sort(result);
//           answer[i] = result[commands[i][2] - 1];
//        }
        return answer;
    }

}

