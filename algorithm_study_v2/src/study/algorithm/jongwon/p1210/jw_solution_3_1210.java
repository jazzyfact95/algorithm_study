package study.algorithm.jongwon.p1210;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**  ㅇㄴㅁㅇㅁㄴ ㅇㅁㄴㅇ
 * H-Index
 */
public class jw_solution_3_1210 {


    public int solution_1(int[] citations) {
        int answer = 0;
        List<Integer> list = Arrays.stream(citations).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        for ( Integer target : list ){
            int cnt = 0;    //이상인 값의 갯수
            for ( int i = 0; i < list.size(); i++ ){
                if ( list.get(i) >= target) cnt++;
            }
            if ( target <= cnt ) {
                answer = cnt;
                break;
            }
        }

        return answer;
    }

    /**
     * ex)
     * 논문     > 0 1 2 3 4 5 6
     * H-Index > 7 6 5 4 3 2 1
     * 논문이 H-Index보다 커질 떄까지 반복한다.
     * H-Index의 최대 점수는 배열의 길이와 비례한다.(배열의 길이가 6이면 H-Index는 0~6)
     * 원소 하나가 검사 범위에서 제외될 떄마다 H-Index의 점수는 줄어든다.
     *
     * 즉, 논문의 인용 값으로 오름차순 후 H-Index보다 논문의 인용 값이 커질 때까지 반복한다.
     * 반복 시 마다
     * H-Index : 총 논문 갯수 - 1
     * 논문 인용 값 : 논문[i]
     *dsadasdasdas
     * @param citations
     * @return
     */
    public int solution(int[] citations) {
        int answer = 0;

        // 0 1 3 5 6
        Arrays.sort(citations);

        int h;
        for(int i=0; i<citations.length; i++){

            // i일때 가장 큰 h값(논문 편수)
            h = citations.length-i;

            // 논문 인용횟수가 h 이상인지 확인
            if(citations[i] >= h){
                answer = h;
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] citations = {3, 0, 6, 1, 5};
        jw_solution_3_1210 test = new jw_solution_3_1210();
        test.solution(citations);
    }
}
