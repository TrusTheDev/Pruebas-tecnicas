public class OrdenaLaLista {
    public static void main(String[] args) {
        int[] nums = {9,3,45,2,1,4,9,7,6,5,0};
        nums = ordenar(nums, "Asc");
        for(int i=0; i< nums.length; i++){
            System.out.println(nums[i]);
        }
    }

    public static int[] ordenar(int[] list, String sort){
        boolean swapped = false;
        if(sort == "Asc"){
            for(int i=0; i< list.length; i++) {
                for (int j = 0; j < list.length - i - 1; ++j) {
                    if (list[j] > list[j + 1]) {
                        int temp = list[j];
                        list[j] = list[j + 1];
                        list[j + 1] = temp;
                        swapped = true;
                    }
                }
                if(!swapped){
                    break;
                }
            }
        }
        else if (sort.equals("Desc")) {
            for(int i=0; i< list.length; i++) {
                for (int j = 0; j < list.length - i - 1; ++j) {
                    if (list[j] < list[j + 1]) {
                        int temp = list[j];
                        list[j] = list[j + 1];
                        list[j + 1] = temp;
                        swapped = true;
                    }
                }
                if(!swapped){
                    break;
                }
            }

        }

        return list;
    }
}
