package ArraysList;

import java.util.ArrayList;

//Find if any pair in a sorted ArrayList has a target sum.
//list = [1,2,3,4,5,6] target = 5
public class PairSumFirst {

    //Two Pointer Approach
    public static boolean pairSM(ArrayList<Integer>list, int target){
        int lp = 0;
        int rp = list.size() - 1;
        while (lp != rp){
            //case 1
            if (list.get(lp) + list.get(rp) == target){
                return true;
            }
            //case 2
            if (list.get(lp)+list.get(rp) < target){
                lp++;
            }else {
                //case 3
                rp --;
            }
        }
        return false;
    }



    //bruteforce
    public static boolean pairSum(ArrayList<Integer> list, int target){
        for (int i = 0; i < list.size(); i++) {
            for (int j = i+1; j < list.size(); j++) {
                if (list.get(i) + list.get(j) == target){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int target = 6;
        System.out.println(pairSum(list,target));
        System.out.println(pairSM(list,target));
    }
}
