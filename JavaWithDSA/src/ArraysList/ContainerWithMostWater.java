package ArraysList;

import java.util.ArrayList;

// For given lines on X-axis use 2 lines to form a a container such that it hold maximum water.
public class ContainerWithMostWater {
    // two Pointer approach
    public static int storepani(ArrayList<Integer> height){
        int maxWater = 0;
        int lp = 0;
        int rp = height.size() - 1;
        while (lp < rp){
            //calculate water area
            int ht = Math.min(height.get(lp), height.get(rp));
            int width = rp - lp;
            int currwater = ht * width;
            maxWater = Math.max(maxWater,currwater);
            //update ptr
            if (height.get(lp) < height.get(rp)){
                lp++;
            }else {
                rp--;
            }
        }
        return maxWater; //O(n)
    }




    public static int storewater(ArrayList<Integer> height){
        int maxWater = 0;
        //bruteforce
        for (int i = 0; i < height.size(); i++) {
            for (int j = i+1; j < height.size(); j++) {
                int ht = Math.min(height.get(i), height.get(j));
                int width = j-1;
                int currwater = ht * width;
                maxWater= Math.max(maxWater, currwater);
            }
        }
        return maxWater;
    }
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println("BruteForce :> "+storewater(height)); // 49 O(n^2)
        System.out.println("Two pointer approach :> "+storepani(height)); // 49 O(n^2)
    }
}
