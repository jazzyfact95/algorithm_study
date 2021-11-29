package study.algorithm.jongwon.p1205;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;


public class jw_solution_1_1205 {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        ArrayList<Integer> list = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());

        for(int i=0; i<n; i++)
            list.add(Integer.parseInt(st.nextToken()));

        Collections.sort(list);
        bw.write(String.valueOf(list.get(k - 1)));
        br.close();
        bw.close();
    }

}



/**
 * K번째 수
 * 작성자 : 유종원
 *
 * 수 N개 A1, A2, ..., AN이 주어진다. A를 오름차순 정렬했을 때, 앞에서부터 K번째 있는 수를 구하는 프로그램을 작성하시오.
 *
 * 입력
 * 첫째 줄에 N(1 ≤ N ≤ 5,000,000)과 K (1 ≤ K ≤ N)이 주어진다.
 *
 * 둘째에는 A1, A2, ..., AN이 주어진다. (-109 ≤ Ai ≤ 109)
 *
 * 출력
 * A를 정렬했을 때, 앞에서부터 K번째 있는 수를 출력한다.
 *
 * 입력
 * 5 2
 * 4 1 2 3 5
 *
 * 출력
 * 2
 */