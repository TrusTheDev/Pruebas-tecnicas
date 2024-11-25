
//You have a long flowerbed in which some of the plots are planted, and some are not. However,
// flowers cannot be planted in adjacent plots.
//Given an integer array flowerbed containing 0's and 1's,
// where 0 means empty and 1 means not empty, and an integer n, return true if n new flowers can be planted in the
// flowerbed without violating the no-adjacent-flowers rule and false otherwise.


public class canPlaceFlowers {
    public static void main(String[] args) {
        int[] flowerbed = {1,0,0,0,1};
        int n = 1;
        System.out.println(canPlant(flowerbed, 5));
    }

    static boolean canPlant (int[] flowerbed, int n){
        if(n == 0){
            if(flowerbed[n] != 1 && flowerbed[n + 1] !=1){
                return true;
            }
            return false;
        }

        if(n == flowerbed.length){
            if(flowerbed[n - 1] != 1 && flowerbed[n - 2] != 1){
                return true;
            }
            return false;
        }

        if(flowerbed[n] !=1 && flowerbed[n + 1] !=1 && flowerbed[n - 1] != 1){
            return true;
        }
        return false;
    }
}
