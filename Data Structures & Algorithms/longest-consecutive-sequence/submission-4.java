

class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        int max = 0;

        while (!set.isEmpty()) {
            int num = set.iterator().next();
            set.remove(num);

            int count = 1;

            int next = num + 1;
            while (set.remove(next)) {
                count++;
                next++;
            }

            int prev = num - 1;
            while (set.remove(prev)) {
                count++;
                prev--;
            }

            max = Math.max(max, count);
        }

        return max;
    }
}