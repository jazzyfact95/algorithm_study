package study.algorithm.jongwon.p1210;

import java.util.Arrays;

/**
 * 프로그래머스 K번째 수
 */
public class jw_solution_1_1210 {

    public int[] solution(int[] array, int[][] commands){
        int[] answer = new int[commands.length];
        for (int i = 0; i < commands.length; i++){
            int[] target = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            Arrays.sort(target);
            answer[i] = target[commands[i][2]-1];
        }

        return answer;
    }

    public static void main(String[] args) {
        jw_solution_1_1210 test = new jw_solution_1_1210();
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = { { 2, 5, 3 }, { 4, 4, 1 }, { 1, 7, 3 } };
        int[] answer = test.solution(array, commands);
        Arrays.stream(answer).forEach(System.out::println);
    }
}
