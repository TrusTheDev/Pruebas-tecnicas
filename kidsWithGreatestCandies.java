/*
There are n kids with candies. You are given an integer array candies, where each candies[i]
represents the number of candies the ith kid has, and an integer extraCandies,
denoting the number of extra candies that you have.
Return a boolean array result of length n, where result[i] is true if, after giving the ith kid all the extraCandies,
 they will have the greatest number of candies among all the kids, or false otherwise.
 */
public class kidsWithGreatestCandies {
    public static void main(String[] args) {
        int[] candies = {12,1,12};
        int extraCandies = 10;
        boolean[] booleans = getBooleans(candies, extraCandies);
        for(int i=0; i<candies.length; i++){
            System.out.println(booleans[i]);
        }

    }

    static public boolean[] getBooleans(int[] candies, int extraCandies){
        int greatestAmongchild = 0;
        boolean[] booleans = new boolean[candies.length];
        for(int i=0; i<candies.length; i++){
            if (greatestAmongchild < candies[i]){
                greatestAmongchild = candies[i];
            }
        }

        for(int i=0; i<candies.length; i++){
            candies[i] += extraCandies;
            if(candies[i] >= greatestAmongchild) {
                booleans[i] = true;
            }
            else if(candies[i] < greatestAmongchild){
                booleans[i] = false;
            }
        }
        return booleans;
    }
}
