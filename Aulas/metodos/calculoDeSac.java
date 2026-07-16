
import java.util.*;

public class mensagemInicio{
    public static void mensagem(){
        System.out.println("Bem-Vindo ao Cálculo de Sac");
        System.out.println("Para dar inicío ao cálculo você precisa fornecer: Valor do Empréstimo, Porcentagem do juros e o valor da amortização");
    }
}


public class calculoSac{
    public static void calcSac(){
        Scanner scanner = new Scanner(System.in);
//      Inputs para receber os dados do usuário
        System.out.println("Digite o valor do empréstimo: ");
        double emprestimo = scanner.nextDouble();

        System.out.println("Digite a porcentagem do juros: ");
        double juros = scanner.nextDouble();

        System.out.println("Digite o valor da amortização: ");
        double amortizacao = scanner.nextDouble();



        for(int mes = 1; emprestimo > 0; mes++){

//      calcula o juros do empréstimo
            double jurosDecimal = (emprestimo * juros) / 100;


//      Soma o juros mais amortização para saber quanto irá pagar
            double pagamentoFinal = jurosDecimal + amortizacao;
            System.out.println("Mês: " + mes + " Tem que pagar: " + pagamentoFinal);

//      O empréstimo tem que ser sempre diminuindo com o valor da amortização
            emprestimo -= amortizacao;


            if (emprestimo == 0 || emprestimo < 0 ){
                System.out.println("O empréstimo Acabou!!!");
            } else{
                System.out.println("Valor do emprestimo após o pagamento:"+ emprestimo);
            }

        }


    }

}

static void main() {
    mensagemInicio.mensagem();
    calculoSac.calcSac();
}
