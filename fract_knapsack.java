class Solution {
    public double fractionalKnapsack(int[] val, int[] wt, int capacity) {
        int n=val.length;
        double[][] item=new double[n][3];
        double total=0.0;
        for(int i=0;i<n;i++){
            item[i][0]=val[i];
            item[i][1]=wt[i];
            item[i][2]=(double)val[i]/wt[i];
        }
        Arrays.sort(item,(a,b)->Double.compare(b[2],a[2]));
        
        for(double[] it:item){
            if(it[1]<=capacity){
                total+=it[0];
                capacity-=it[1];
            }
            else{
                total+=(it[0]/it[1])*capacity;
                break;
            }
        }
        return total;
    }
}
