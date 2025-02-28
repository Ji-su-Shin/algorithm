// level2 - 구명보트
import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        
        Arrays.sort(people);
        int min = 0;
        int max = people.length-1;
        
        while(min < max) {
            if(people[min] + people[max] > limit) {
                answer++;
                max--;
            } else {
                answer++;
                min++;
                max--;
            }
        }
        if(min == max) {
            answer++;
        }
        
        return answer;
    }
}
