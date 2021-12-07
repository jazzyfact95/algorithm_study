package study.algorithm.jongwon.p1210;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * H-Index
 */
public class jw_solution_3_1210 {

    public int solution(int[] citations) {
        int answer = 0;
        List<Integer> list = Arrays.stream(citations).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        list.stream().forEach(System.out::println);
        for ( int i = 0; i < list.size(); i++ ){

        }
        return answer;
    }

    public static void main(String[] args) {
        int[] citations = {3, 0, 6, 1, 5};
        jw_solution_3_1210 test = new jw_solution_3_1210();
        test.solution(citations);
    }
}
