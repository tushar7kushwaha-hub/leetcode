
import java.util.*;

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int n = asteroids.length;
        List<Integer> holder = new ArrayList<>();
        List<Integer> oppHolder = new ArrayList<>();

        for (int i = n - 1; i >= 0; i--) {

            if (asteroids[i] < 0) {
                oppHolder.add(Math.abs(asteroids[i]));
            } else {
                int current = asteroids[i];
                boolean alive = true;

                while (alive && !oppHolder.isEmpty()) {
                    int last = oppHolder.get(oppHolder.size() - 1);

                    if (last < current) {
                        oppHolder.remove(oppHolder.size() - 1);
                    } else if (last == current) {
                        oppHolder.remove(oppHolder.size() - 1);
                        alive = false;
                    } else {
                        alive = false;
                    }
                }
                if (alive) {
                    holder.add(current);
                }
            }
        }
        Collections.reverse(oppHolder);
        oppHolder.replaceAll(opp -> -opp);
        Collections.reverse(holder);
        oppHolder.addAll(holder);
        return returnArray(oppHolder);
    }

    private static int[] returnArray(List<Integer> list) {
        return list.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
