package ExerciciosLoop;

public class Ex2 {
    private int num;

    public Ex2(int valor) {
        this.num = valor;
    }

    public String quadrado() {
        int somaImpares = 0;
        int contador = 0;
        int i = 1;
        int[] impares = new int[num];


        while (contador < num) {
            if (i % 2 != 0) {
                impares[contador] = i;
                somaImpares += i;
                contador++;
            }
            i++;
        }


        StringBuilder resultado = new StringBuilder();
        resultado.append("A soma dos " + num + " primeiros ímpares (");
        for (int j = 0; j < impares.length; j++) {
            resultado.append(impares[j]);
            if (j < impares.length - 1) {
                resultado.append("+");
            }
        }

        resultado.append(") = " + somaImpares);
        return resultado.toString();
    }
}
