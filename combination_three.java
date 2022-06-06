class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> l=new ArrayList<>();
        res(ans,l,k,n,1);
        return ans;
    }
    public void res(List<List<Integer>> ans,List<Integer> l,int k,int n,int index){
        if(k==0 && n==0){
            ans.add(new ArrayList<>(l));
            return;
        }
        if( k<0 || n<0 ){
            return;
        }
        for(int i=index;i<=9;i++){
            l.add(i);
            res(ans,l,k-1,n-i,i+1);
            l.remove(l.size()-1);
        }
    }
}
