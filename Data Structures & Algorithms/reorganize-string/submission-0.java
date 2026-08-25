class Solution {
    public String reorganizeString(String s) {
        int[] freq = new int[256];
        for (char c : s.toCharArray()) {
            freq[c]++;
        }

        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> b[1] - a[1]);

        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                maxHeap.add(new int[]{i, freq[i]});
            }
        }

        StringBuilder result = new StringBuilder();
        int[] prev = null;

        while (!maxHeap.isEmpty()) {
            int[] current = maxHeap.poll();
            result.append((char) current[0]);
            current[1]--;

            if (prev != null && prev[1] > 0) {
                maxHeap.add(prev);
            }

            prev = current;
        }

        return result.length() == s.length() ? result.toString() : "";
    }
}
