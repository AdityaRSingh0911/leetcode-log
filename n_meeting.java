class Solution {
    public ArrayList<Integer> maxMeetings(int[] s, int[] f) {
        ArrayList<Integer> ans=new ArrayList<>();
        int n=s.length;
        int[][] meets=new int[n][3];
        for(int i=0;i<n;i++){
            meets[i][0]=s[i];
            meets[i][1]=f[i];
            meets[i][2]=i+1;
        }
        Arrays.sort(meets, (a, b) -> a[1] != b[1] ? Integer.compare(a[1], b[1]) : Integer.compare(a[2], b[2]));
        int freetime=-1;
        for(int[] check:meets){
            if(check[0]>freetime){
                freetime=check[1];
                ans.add(check[2]);
            }
        }
        Collections.sort(ans);
        return ans;
    }
}