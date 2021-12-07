package study.algorithm.jongwon.p1210;

import com.sun.java.swing.plaf.windows.WindowsTextAreaUI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 프로그래머스 가장 큰 수
 * 문제 설명
 * 0 또는 양의 정수가 주어졌을 때, 정수를 이어 붙여 만들 수 있는 가장 큰 수를 알아내 주세요.
 *
 * 예를 들어, 주어진 정수가 [6, 10, 2]라면 [6102, 6210, 1062, 1026, 2610, 2106]를 만들 수 있고, 이중 가장 큰 수는 6210입니다.
 *
 * 0 또는 양의 정수가 담긴 배열 numbers가 매개변수로 주어질 때, 순서를 재배치하여 만들 수 있는 가장 큰 수를 문자열로 바꾸어 return 하도록 solution 함수를 작성해주세요.
 *
 * 제한 사항
 * numbers의 길이는 1 이상 100,000 이하입니다.
 * numbers의 원소는 0 이상 1,000 이하입니다.
 * 정답이 너무 클 수 있으니 문자열로 바꾸어 return 합니다.
 *
 *
 *
 *
 * 숫자를 내림차순.
 *
 */
public class jw_solution_2_1210 {

    public String solution_1(int[] numbers) {
        String answer = "";
        int numbersLength = numbers.length;
        List<Integer> reverse = Arrays.stream(numbers).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        ArrayList<String> big = new ArrayList<>();     //10이상 19
        ArrayList<String> small = new ArrayList<>();   //10이하 9 1
        reverse.stream().forEach(System.out::println);
        for( int i = 0; i < reverse.size(); i++ ){
            if ( reverse.get(i) > 9 ) big.add(String.valueOf(reverse.get(i)));
            else                   small.add(String.valueOf(reverse.get(i)));
        }

        for (int i = 0; i < numbersLength; i++){
            int length = String.valueOf(big.get(0)).length();
            String smallString = "";
            for (int j = 0; j < length; j++){
                if ( small.size() < j+1 ) smallString += "0";
                else smallString += small.get(j);
            }
            if (Integer.parseInt(smallString) > Integer.parseInt(big.get(0))){
                for (int j = 0; j < length; j++){
                    answer += small.get(0);
                    small.remove(0);
                    numbersLength -= 1;
                }
            }
            else {
                answer += big.get(0);
                big.remove(0);
                numbersLength -= 1;
            }
            if( small.size() == 0 )
                for ( int j = 0; j < big.size(); j++ )  answer += big.get(j);
            else    for ( int j = 0; j < small.size(); j++ )  answer += small.get(j);
        }

        System.out.println(answer);

        return answer;
    }

    public String solution(int[] numbers){
        String answer = "";
        List<String> numberStrings = Arrays.stream(numbers).boxed().map(String::valueOf).collect(Collectors.toList());
        for (int i = 0; i < numbers.length-1; i++){
            int maxIdx = 0;
            int maxLength = 0;
            for ( int j = i+1; j < numbers.length; j++ ){
                if ( Integer.parseInt(numberStrings.get(i).substring(0 ,1)) < Integer.parseInt(numberStrings.get(j).substring(0, 1)) ){
                    maxIdx = j;
                    maxLength = numberStrings.get(j).length();
                }
                else if( Integer.parseInt(numberStrings.get(i).substring(0 ,1)) == Integer.parseInt(numberStrings.get(j).substring(0, 1)) ){
                    int repeat = numberStrings.get(i).length() > numberStrings.get(j).length() ? numberStrings.get(j).length() : numberStrings.get(j).length();
                    for (int k = 0; k < repeat; k++){
                        int num1 = Integer.parseInt(numberStrings.get(i).substring(k+1, k+2));
                        int num2 = Integer.parseInt(numberStrings.get(j).substring(k+1, k+2));
                    }
                }
            }
            //if ( Integer.parseInt(numberStrings.get(i).substring(0, 1)) >  ) maxIdx =

        }

        //

        return answer;
    }



    public static void main(String[] args) {
        int[] example1 = {6, 10, 2};
        int[] example2 = {3, 30, 34, 5, 9};
        jw_solution_2_1210 test = new jw_solution_2_1210();
        //test.solution_1(example1);
        //test.solution_1(example2);
        test.solution(example1);
        test.solution(example2);
    }
}
