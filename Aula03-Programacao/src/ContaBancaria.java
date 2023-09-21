import java.time.LocalTime;

public class ContaBancaria {
    private String titular;
    private String cpf;
    private int numeroConta;
    private String banco;
    private String endereco;
    private double saldo;
    private LocalTime horaAtual;

    public boolean saca(double valor) {
        if (valor < saldo) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean deposita(double valor) {
        this.saldo += valor;
        return true;
    }

    public void pix(double valor, ContaBancaria destinatario) {
        if (valor < saldo) {
            saldo -= valor;
        } else {
            System.out.println("Seu saldo é menor que o valor.");
        }
    }
        public void transfere(double valor, ContaBancaria destinatario){
            if (valor < saldo) {
                saldo-=valor;
            }
            else {
                System.out.println("Saldo insuficiente para transferência. ");
            }
        }

        public void mostraSaldo() {
        System.out.println("Seu saldo é: " + this.saldo);
    }
        public void mostraHora() {
        System.out.println("Hora: " + this.horaAtual);
        }

        public void MostraInfos() {
            System.out.println(this.titular);
            System.out.println(this.cpf);
            System.out.println(this.numeroConta);
            System.out.println(this.banco);
            System.out.println(this.endereco);
            System.out.println(this.saldo);
            System.out.println(this.horaAtual);




        }
}
