public class Calculadora {
    private int num1, num2;

    public Calculadora(int num1, int num2) {
        setNum1(num1);
        setNum2(num2);
    }

    public int getNum1() {
        return num1;
    }
    public void setNum1(int num1) {
        this.num1 = num1;
    }
    public int getNum2() {
        return num2;
    }
    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int soma(int num1, int num2) {
        return num1 + num2;
    }
    public int subtraia(int num1, int num2) {
        return num1 - num2;
    }
    public int divida(int num1, int num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("Divisor nao pode ser zero.");
        }
        return num1 / num2;
    }
    public int multiplique(int num1, int num2) {
        return num1 * num2;
    }

    public String exibirOperacao(String operacao, int result) {
        return num1 + " " + operacao + " " + num2 + " = " + result;
    }
}