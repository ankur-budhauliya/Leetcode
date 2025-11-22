class Solution {
    public int totalWaviness(int num1, int num2) {
        int temp = num1;
        int total = 0;

        for(int n = temp; n<= num2; n++){
            total+=waviness(n);
            
        }
        return total;
        
    }
    public int waviness(int n){
        String s = String.valueOf(n);
        if(s.length()<3) return 0;
        int count = 0;
        char[] d = s.toCharArray();

        for(int i =1; i< d.length-1; i++){
            int left = d[i-1] -'0';
            int right = d[i+1]-'0';
            int mid = d[i]-'0';
            if(mid > left && mid > right) count ++;
            if(mid < left && mid < right) count ++;
        }
        return count;
    }
}
