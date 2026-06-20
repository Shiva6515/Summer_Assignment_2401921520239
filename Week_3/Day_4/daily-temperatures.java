class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int t = temperatures.length;
        int[] ans = new int[t];
        for(int i=t-2,j=i+1;i>=0;i--,j--){
            if(temperatures[i]<temperatures[j]) ans[i]=j-i;
            else{
                int k=j;
                while(k<t && temperatures[i]>=temperatures[k]){
                    if(ans[k]==0) k=t;
                    else k=k+ans[k];
                }
                if(k<t) ans[i] = k-i;
            }
        }
        return ans;
    }
}
