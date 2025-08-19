// Last updated: 19/08/2025 19:29:45
/*
 * O(n)
 * 
 * Difficulté à comprendre l'énoncé mais après c'était bon
*/

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