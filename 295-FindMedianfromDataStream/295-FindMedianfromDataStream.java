// Last updated: 29/04/2026, 11:46:02
1class MedianFinder {
2    PriorityQueue<Integer> maxHeap;
3    PriorityQueue<Integer> minHeap;
4
5    public MedianFinder() {
6        maxHeap = new PriorityQueue<>();
7        minHeap = new PriorityQueue<>(Collections.reverseOrder());
8    }
9    
10    public void addNum(int num) {
11        if (maxHeap.isEmpty() && minHeap.isEmpty()) {
12            maxHeap.add(num);
13            return;
14        }
15
16        if (minHeap.size() < maxHeap.size()) {
17            if (num > maxHeap.peek()) {
18                minHeap.add(maxHeap.poll());
19                maxHeap.add(num);
20            } else {
21                minHeap.add(num);
22            }
23        } else {
24            if (num < minHeap.peek()) {
25                maxHeap.add(minHeap.poll());
26                minHeap.add(num);
27            } else {
28                maxHeap.add(num);
29            }
30        }
31    }
32    
33    public double findMedian() {
34        if (maxHeap.size() > minHeap.size()) {
35            return (double) maxHeap.peek();
36        } else {
37            return (((double) maxHeap.peek()) + ((double) minHeap.peek())) / 2.0;
38        }
39    }
40}
41
42/**
43 * Your MedianFinder object will be instantiated and called as such:
44 * MedianFinder obj = new MedianFinder();
45 * obj.addNum(num);
46 * double param_2 = obj.findMedian();
47 */