package ExerciciosLoop;
import java.util.ArrayList;
public class Ex6 {
    private ArrayList<Double> valor;
    private int aux;
    private double resultadoCompra;
    private double desconto;
    StringBuilder resultado = new StringBuilder();


    public Ex6(ArrayList<Double>num){
        this.valor = num;
        this.aux = num.size();
    }

    public String desconto(){
        for( int i = 0; i < aux; i++){
            resultadoCompra = resultadoCompra + valor.get(i);
        }

            if(resultadoCompra < 300){
                resultado.append("resultado da compra: " + resultadoCompra + "Sem desconto, paga o total");
                return resultado.toString(); // converte em String
            } else if( resultadoCompra>=300 && resultadoCompra<= 500){
                desconto =  resultadoCompra * (5/100);
                resultadoCompra =  resultadoCompra - desconto;
                resultado.append("Sua compra: "+ valor +"resultado da compra: " + resultadoCompra + "Desconto: " + desconto);
                return resultado.toString(); // converte em String

            }  else if(resultadoCompra>=501 && resultadoCompra<=1000 ){
                desconto =  resultadoCompra * (10/100);
                resultadoCompra =  resultadoCompra - desconto;
                resultado.append("Sua compra: "+ valor +"resultado da compra: " + resultadoCompra + "Desconto: " + desconto);
                return resultado.toString(); // converte em String

            } else {
                desconto =  resultadoCompra * (12/100);
                resultadoCompra =  resultadoCompra - desconto;
                resultado.append("Sua compra: "+ valor +"resultado da compra: " + resultadoCompra + "Desconto: " + desconto);
                return resultado.toString(); // converte em String
            }

        //return comparaDesconto(resultadoCompra);
    }

    /*
    public String comparaDesconto(double total){
        switch(total){
            case (total<300):

                break;
        }
    }
*/

}
