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

    public static void solution(){

    }
}
