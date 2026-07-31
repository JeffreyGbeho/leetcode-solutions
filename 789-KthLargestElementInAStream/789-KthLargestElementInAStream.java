// Last updated: 30/07/2026, 22:22:26
class KthLargest {

    int k;
    PriorityQueue<Integer> heap;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        heap = new PriorityQueue(k);
        for (int num : nums) {
            if (heap.size() == k) {
                heap.offer(Math.max(heap.poll(), num));
            } else {
                heap.offer(num);
            }
        }        
    }
    
    public int add(int val) {
        if (heap.size() == k) {
            heap.offer(Math.max(heap.poll(), val));
        } else {
            heap.offer(val);
        }
        return heap.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */