package study.algorithm.jongwon.p1205;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

/**
 * 블랙잭
 *
 */
public class jw_solution_2_1205 {

    public static void yjw() throws Exception{
        class Card{
            public int cardNum;
            public int absNum;
            public int idx;
            Card(int cardNum, int absNum, int idx){
                this.cardNum = cardNum;
                this.absNum = absNum;
                this.idx = idx;
            }
        }

        class AbsComparator implements Comparator<Card> {

            @Override
            public int compare(Card o1, Card o2) {
                if ( o1.absNum > o2.absNum )    return 1;
                else if (o1.absNum < o2.absNum) return -1;
                else                            return 0;
            }
        }


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer token = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(token.nextToken());    //카드 갯수
        int k = Integer.parseInt(token.nextToken());    //블랙잭 수

        ArrayList<Integer> list = new ArrayList<>();
        token = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++){
            list.add(Integer.parseInt(token.nextToken()));
        }

        Collections.sort(list);
        int m = k-list.get(0);
        int avg = m/2;
        ArrayList<Card> cardList = new ArrayList<>();
        for ( int i = 1; i < list.size(); i++ ){
            cardList.add(new Card(list.get(i), Math.abs( avg - list.get(i) ), i));
        }
        Collections.sort(cardList, new AbsComparator());
        int cnt = 0;        //count
        int index = 0;
        while (cnt < 2){
            if ( cardList.get(index).absNum != 0 ){
                m -= cardList.get(index).cardNum;
                cnt++;
            }
            index++;
        }
        bw.write(k - m);
        br.close();
        bw.close();
    }

    public static void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());       //블랙잭 카드 수
        int score = Integer.parseInt(st.nextToken());   //블랙잭 점수

        st = new StringTokenizer(br.readLine());
        int[] list = new int[n];
        for (int i = 0; i < n; i++){
            list[i] = (Integer.parseInt(st.nextToken()));
        }
        int max = search(score, list, n);
        System.out.println(max);
    }

    //조회 메소드
    public static int search(int score, int[] list, int n){
        int max = 0;
        for (int i = 0; i < n-2; i++){ //카드 수가 3장이므로 첫 번째 카드는 카드수 -2까지
            for (int j = i+1; j < n-1; j++){//두 번째 카드는 카드 수 -1 까지
                for (int k = j+1; k < n; k++){
                    int targetScore = (list[i] + list[j] + list[k]);
                    if ( max <= targetScore && targetScore <= score ){
                        max = targetScore;
                        if (max == score)   return max; //제시된 블랙잭 점수와 같을 경우 탐색 종료
                    }

                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        try {
            jw_solution_2_1205.solution();
        }
        catch (Exception e){ e.printStackTrace(); }
    }

}

