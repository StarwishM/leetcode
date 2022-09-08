public class Solution215 {
    public static void main(String[] args){
        int[] nums=new int[]{3,2,3,1,2,4,5,5,6};
        int k=4;
//        System.out.println(nums.length);
        System.out.println(findKthLargest(nums,k));
    }
    public static int findKthLargest(int[] nums,int k){
        QuckSort(nums,0,nums.length-1);
        return nums[nums.length-k];
    }

    public static void QuckSort(int[] Marry,int head,int tail){
        if(head<tail){
            int i = MidPos(Marry,head,tail);
            QuckSort(Marry,head,i-1);
            QuckSort(Marry,i+1,tail);
        }
    }

    public static int MidPos(int[] Marry, int head, int tail) {
        int i = head;
        int j = tail;
        int x = Marry[i];
        while (i < j) {
            while (i < j && x < Marry[j]) {
                j--;
            }
            if (i < j) {
                Marry[i] = Marry[j];
                i++;
            }
            while (i < j && x > Marry[i]) {
                i++;
            }
            if (i < j) {
                Marry[j] = Marry[i];
                j--;
            }
        }
        Marry[i] = x;
        return i;
    }
}
