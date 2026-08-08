class Solution {
    public int minEatingSpeed(int[] piles, int h) {
         int low = 1;
        int high = 0;

        // Find maximum pile
        for (int pile : piles) {
            high = Math.max(high, pile);
        }

        while (low < high) {

            int mid = low + (high - low) / 2;

            long hours = 0;

            // Calculate total hours for speed = mid
            for (int pile : piles) {
                hours += (pile + (long) mid - 1) / mid;
            }

            if (hours <= h) {
                // mid works, try smaller speed
                high = mid;
            } else {
                // mid doesn't work, increase speed
                low = mid + 1;
            }
        }

        return low;
    }
}