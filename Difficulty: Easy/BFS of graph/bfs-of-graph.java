class Solution {
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        int v=adj.size();
        // code here
        ArrayList<Integer> res=new ArrayList<>();
        
        Queue<Integer> q=new LinkedList<>();
        
        boolean vis[]=new boolean[v];
        
        vis[0]=true;
        
        q.add(0);
        while(!q.isEmpty()){
            Integer val=q.poll();
            res.add(val);
            
            for(Integer it:adj.get(val)){
                if(vis[it]==false){
                    vis[it]=true;
                    q.add(it);
                }
            }
            
            
        }
        
        return res;
    }
}