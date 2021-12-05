package study.algorithm.kijeong.p1205;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class kj_solution_2_1205 {
    public static void solution() {
        ArrayList<Integer> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {

            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int result = 0;

            st = new StringTokenizer(br.readLine(), " ");

            for(int i = 0; i < n; i++)
                list.add(Integer.parseInt(st.nextToken()));

            for(int i = 0; i < n - 2; i++) {
                if(list.get(i) > m) continue;
                for(int j = i + 1; j < n - 1; j++) {
                    if(list.get(i) + list.get(j) > m) continue;
                    for(int k = j + 1; k < n; k++) {
                        if(list.get(i) + list.get(j) + list.get(k) > m) continue;
                        int sum = list.get(i) + list.get(j) + list.get(k);

                        if(sum == m) {
                            result = sum;
                            break;
                        }

                        if(sum > result && sum < m) {
                            result = sum;
                        }

                    }
                }
            }
            br.close();
            System.out.println(result);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
