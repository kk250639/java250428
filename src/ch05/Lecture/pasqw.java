import java.util.Arrays;

public class pasqw {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        merge(nums1, m, nums2, n);

        // 결과 출력
        for (int num : nums1) {
            System.out.print(num + " ");
        }
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        // 이 부분을 직접 구현해보세요!
        nums1[3] = nums2[0];
        nums1[4] = nums2[1];
        nums1[5] = nums2[2];
        int[] a = {nums1.length,};
        a = Arrays.sort(nums1);
        for(int i=0;i<nums1.length;i++){
            System.out.println("nums1["+i+"] = " + nums1[i]);
        }
    }
}