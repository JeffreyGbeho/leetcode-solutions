// Last updated: 30/07/2026, 22:22:15
class RecentCounter {

    public static int counter;
    public static Queue<Integer> qu;

    public RecentCounter() {
        this.counter = 0;
        this.qu = new LinkedList<>();
    }
    
    public int ping(int t) {
        int v = t-3000;
        qu.add(v);
        
        if (this.counter > 0) {
            while (Math.abs(v-qu.peek()) > 3000) {
                qu.remove();
            }
        }

        this.counter++;

        return this.qu.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */