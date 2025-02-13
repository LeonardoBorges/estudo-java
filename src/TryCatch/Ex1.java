package TryCatch;

public class Ex1 {
    public static void main(String[] args) {
        double[] list = new double[10];
        for (int i = 0; i < list.length; i++) {
            list[i] += i;
        }

        try{
            System.out.println(list[12]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("conta nao encontrada " + e.getMessage());
        }


    }
}
