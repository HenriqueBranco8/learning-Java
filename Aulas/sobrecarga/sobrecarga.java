package sobrecarga;

public class sobrecarga {
    public static float calculaArea(float altura, float largura){
        return largura * altura;
    }

    public  static float calcularArea(float baseMaior, float baseMenor, float altura){
        return baseMaior + baseMenor * altura / 2;
    }

    public  static  float calcularArea(float base, float altura){
        return base * altura;
    }
}
