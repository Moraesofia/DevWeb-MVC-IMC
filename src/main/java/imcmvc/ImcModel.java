package imcmvc;

public class ImcModel {

    public static String[] imc(float altura, float peso) {
        String[] resultado = new String[2];
        altura = Float.parseFloat(String.valueOf(altura));
        altura = altura / 100;
        peso = Float.parseFloat(String.valueOf(peso));
        float imc = 0;
        imc = peso / (altura * altura);
        resultado[0] = String.valueOf(imc);

        if (imc < 18.5) {
            resultado[1] = "Abaixo do peso";
        } else if (imc < 25) {
            resultado[1] = "Peso normal";
        } else if (imc < 30) {
            resultado[1] = "Sobrepeso";
        } else if (imc < 35) {
            resultado[1] = "Obesidade grau 1";
        } else if (imc < 40) {
            resultado[1] = "Obesidade grau 2";
        } else if (imc >= 40) {
            resultado[1] = "Obesidade grau 3";
        }

        return resultado;
    }
}

