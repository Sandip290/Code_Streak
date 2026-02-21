import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AsteroidsCollision {
    public int[] asteroidCollision(int[] asteroids) {
        int n = asteroids.length;
        // Using a List as a stack to keep track of the surviving asteroids.
        List<Integer> st = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            // If the asteroid is moving to the right (positive), push it to the stack.
            if (asteroids[i] > 0) {
                st.add(asteroids[i]);
            } else {
                // The current asteroid is moving left (negative).
                // It will collide with and destroy all smaller right-moving asteroids.
                while (!st.isEmpty() && st.get(st.size() - 1) > 0 && st.get(st.size() - 1) < Math.abs(asteroids[i])) {
                    st.remove(st.size() - 1);
                }

                // If a right-moving asteroid of the exact same size is encountered, both
                // explode.
                if (!st.isEmpty() && st.get(st.size() - 1) == Math.abs(asteroids[i])) {
                    st.remove(st.size() - 1);
                }
                // If the stack is empty, or the top asteroid is also moving left (negative),
                // no more collisions will happen for this asteroid, so we add it to the stack.
                else if (st.isEmpty() || st.get(st.size() - 1) < 0) {
                    st.add(asteroids[i]);
                }
            }
        }

        // Convert the stack (List) back to an int array.
        int[] result = new int[st.size()];
        for (int i = 0; i < st.size(); i++) {
            result[i] = st.get(i);
        }

        return result;
    }

    public static void main(String[] args) {
        AsteroidsCollision solution = new AsteroidsCollision();

        // Test case 1
        int[] asteroids1 = { 5, 10, -5 };
        System.out.println("Input: " + Arrays.toString(asteroids1));
        System.out.println("Output: " + Arrays.toString(solution.asteroidCollision(asteroids1)));
        // Expected: [5, 10]

        // Test case 2
        int[] asteroids2 = { 8, -8 };
        System.out.println("\nInput: " + Arrays.toString(asteroids2));
        System.out.println("Output: " + Arrays.toString(solution.asteroidCollision(asteroids2)));
        // Expected: []

        // Test case 3
        int[] asteroids3 = { 10, 2, -5 };
        System.out.println("\nInput: " + Arrays.toString(asteroids3));
        System.out.println("Output: " + Arrays.toString(solution.asteroidCollision(asteroids3)));
        // Expected: [10]

        // Test case 4
        int[] asteroids4 = { -2, -1, 1, 2 };
        System.out.println("\nInput: " + Arrays.toString(asteroids4));
        System.out.println("Output: " + Arrays.toString(solution.asteroidCollision(asteroids4)));
        // Expected: [-2, -1, 1, 2]
    }
}
