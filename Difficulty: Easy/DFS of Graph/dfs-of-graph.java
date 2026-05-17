class Solution {
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        boolean vis[]=new boolean[adj.size()+1];
        
        vis[0]=true;
        
        ArrayList<Integer> ls=new ArrayList<>();
        
        dfs(0,vis,adj,ls);
        // code here
        return ls;
    }
    public static void dfs(int node ,boolean vis[],
    ArrayList<ArrayList<Integer>> adj,ArrayList<Integer> ls){
        vis[node]=true;
        
        ls.add(node);
        
        for(Integer  it:adj.get(node)){
            if(vis[it]==false){
                dfs(it,vis,adj,ls);
            }
        }
    }
}