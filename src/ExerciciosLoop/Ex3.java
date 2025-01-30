package ExerciciosLoop;

public class Ex3  {
    private int num;

    public int exponencial(int base, int expo){
        int resultado = 1;
        int expoM = Math.abs(expo);
        for (int i = 1; i<=expoM;i++){
            resultado *= base;
        }
        return resultado;
    }
}
