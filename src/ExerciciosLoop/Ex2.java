package ExerciciosLoop;

public class Ex2 {
    private int num;

    public Ex2(int valor) {
        this.num = valor;
    }

    public String quadrado() {
        int somaImpar = 0;
        int cont = 0;
        int i = 1;
        int[] impares = new int[num]; // array do tamanho de num


        while (cont < num) {
            if (i % 2 != 0) {
                impares[cont] = i; //impares[0] = 1
                somaImpar += i; // 0 + 1
                cont++;
            }
            i++;
        }


        // concatena o exemplo ( 1 + 3...)
        StringBuilder resultado = new StringBuilder();
        resultado.append("A soma dos " + num + " primeiros ímpares (");
        for (int j = 0; j < impares.length; j++) { // j  do tamanho do array impares
            resultado.append(impares[j]); // concatena o numero em resultado
            if (j < impares.length - 1) { // se nao for o o ultimo numero
                resultado.append("+"); // adiciona o "+"
            }
        }

        resultado.append(") = " + somaImpar + " que é o quadrado de " + num);
        return resultado.toString(); // converte em String

    }
}
