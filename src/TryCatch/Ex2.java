package TryCatch;

import java.util.Arrays;

public class Ex2 {
    public static void main(String[] args) {
        double[] list = {100.0, 102.0,101.0,103.0,105.0};
        double[] mm = new double[3];

        try {
            for (int i = 2, j=0; i < list.length; i++,j++) {
                mm[j] = (list[i] + list[i-1] + list[i-2])/3;
            }
        }catch (Exception e){
            System.out.println("teste " + e.getMessage());
        }

        System.out.println(Arrays.toString(mm));
    }
}
