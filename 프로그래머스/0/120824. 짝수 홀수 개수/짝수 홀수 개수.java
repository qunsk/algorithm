class Solution {
    public int[] solution(int[] num_list) {
        int odd =0;
        int even =0;
        for(int i=0;i<num_list.length;i++){
            if(num_list[i]%2==1){
                odd++;
            }else{
                even++;
            }
        }
        int[] answer = {even, odd};
        return answer;
    }
}