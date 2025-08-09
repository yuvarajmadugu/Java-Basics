public class LeetCodeWaterContainer {
    public static void main(String[] args) {
        int[] height={1,8,6,2,5,4,8,3,7,8};
        /* int maxWater=0;
        for(int i=0; i<height.length; i++){
            for (int j=i+1; j< height.length; j++){
                int width=j-i;
                int length=Math.min(height[i],height[j]);
                int currentwater=width*length;
                if (currentwater>maxWater) {
                    maxWater = currentwater;
                }
            }
        }
        System.out.println("Max Water in the container= "+maxWater);   */

        //optimal solution:
        int maxWater=0;
        int leftPointer=0, rightPointer= height.length-1;
        while(leftPointer<rightPointer){
            int width= rightPointer-leftPointer;
            int length= Math.min(height[leftPointer],height[rightPointer]);
            int currentwater= width*length;
            if (currentwater>maxWater) {
                maxWater= currentwater;
            }
            if (height[leftPointer]<height[rightPointer]){
                leftPointer++;
            }else {
                rightPointer--;
            }
        }
        System.out.println("Max Area= "+maxWater);
    }
}
