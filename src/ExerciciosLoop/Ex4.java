package ExerciciosLoop;
import java.util.ArrayList;

public class Ex4 {
    private int num;
    private ArrayList<Integer> lista = new ArrayList<>();
    public Ex4(int valor ){
        this.num = valor;
    }
    public String fibonacci(){
        int cont = 0;
        int aux =1;
        int resultado = 0;
        lista.add(cont);
        lista.add(aux);
        for (int i = 2; i < num; i++){
            resultado = cont + aux;
            lista.add(resultado);
            cont = aux;
            aux = resultado;
        }

        return lista.toString();
    }
}
