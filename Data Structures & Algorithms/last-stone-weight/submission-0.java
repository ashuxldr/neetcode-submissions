class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b-a);
        for(int i=0;i<stones.length;i++)
            pq.add(stones[i]);

        int x,y;
        while(pq.size()>1){
            x = pq.poll();
            y = pq.poll();
            if(x==y) continue;
            if(x>y){
                x = x - y;
                pq.add(x);
            }
        }
        return pq.size()==1 ? pq.peek() : 0 ;
    }
}
