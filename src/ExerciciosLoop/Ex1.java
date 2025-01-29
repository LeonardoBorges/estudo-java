package ExerciciosLoop;

public class Ex1 {
    private int num;

    StringBuilder tabuadaStr = new StringBuilder();
    public Ex1(int valor){
        this.num = valor;
    }

    public String tabuada(){
        for (int i = 0; i<=10;i++){
            int valor = num* i;
            tabuadaStr.append(String.format("%d X %d = %d%n", num, i, valor));
        }
        return tabuadaStr.toString();
    }
}
