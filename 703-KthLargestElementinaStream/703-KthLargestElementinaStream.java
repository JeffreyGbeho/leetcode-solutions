// Last updated: 28/04/2026, 17:20:48
1class KthLargest {
2
3    int k;
4    PriorityQueue<Integer> heap;
5
6    public KthLargest(int k, int[] nums) {
7        this.k = k;
8        heap = new PriorityQueue(k);
9        for (int num : nums) {
10            if (heap.size() == k) {
11                heap.offer(Math.max(heap.poll(), num));
12            } else {
13                heap.offer(num);
14            }
15        }        
16    }
17    
18    public int add(int val) {
19        if (heap.size() == k) {
20            heap.offer(Math.max(heap.poll(), val));
21        } else {
22            heap.offer(val);
23        }
24        return heap.peek();
25    }
26}
27
28/**
29 * Your KthLargest object will be instantiated and called as such:
30 * KthLargest obj = new KthLargest(k, nums);
31 * int param_1 = obj.add(val);
32 */