// Last updated: 18/05/2025 19:32:08
class MovingAverage {
    int size;
    List queue = new ArrayList<>();

    public MovingAverage(int size) {
        this.size = size;
    }
    
    public double next(int val) {
        queue.add(val);
        int res = 0;
        
        for (int i = Math.max(0, queue.size() - size); i < queue.size(); i++) {
            res += (int) queue.get(i);
        }
        
        return res * 1.0 / Math.min(queue.size(), size);
    }
}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */