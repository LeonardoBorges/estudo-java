package ExerciciosLoop;

public class Ex3  {
    private int num;

    public int exponencial(int base, int expo){
        int resultado = 1;

        for (int i = 1; i<=expo;i++){
            resultado *= base;
        }
        return resultado;
    }
}
