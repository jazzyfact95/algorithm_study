package study.algorithm.kijeong.p1210;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class kj_solution_3_1210 {
    public static void solution() {

    }

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
        StringTokenizer st;

        try {
            st = new StringTokenizer(br.readLine(), " ");
            int arrayleng = Integer.parseInt(st.nextToken());

            int[] array = new int[arrayleng];

            ArrayList<Integer> list = new ArrayList<>();

            st = new StringTokenizer(br.readLine(), " ");

            for(int i = 0; i < array.length; i++)
                array[i] = Integer.parseInt(st.nextToken());

            for(int i = 0; i < array.length; i++) {
                list.add(array[i]);
            }

            Collections.sort(list, Collections.reverseOrder());
            Arrays.sort(array);

            int answer = 0;

            for(int i = 0; i < array.length; i++) {
                if(array.length - i <= array[i]) {
                    answer = array.length - i;
                    break;
                }
            }

            System.out.println(answer);

            for(int i = list.size()-1; i >= 0; i--) {
                if(i+1 <= list.get(i)) {
                    answer = i+1;
                    break;
                }
            }

            System.out.println(answer);
        } catch(Exception e) {
            e.printStackTrace();
        }

    }
}
