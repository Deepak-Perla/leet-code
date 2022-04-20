class Solution{
    public List<String> generateParenthesis(int n){
    List <String> ans = new ArrayList<String>();
    Generate(n,n,"",ans);
    return ans;
    }
    public void Generate(int open, int close, String path, List<String> ans){
        if(open == 0 && open == close){
            System.out.println(path);
            ans.add(path);
            return;
        }
        if(open>close){
            return;
        }
    if(open>0)
    {
        Generate(open-1, close, path+"(",ans);
}
    if(close>0){
        Generate(open, close-1, path+")",ans);
    }

    }
}