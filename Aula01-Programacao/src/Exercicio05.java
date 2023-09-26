public class Exercicio05 {
    public static void main(String[] args) {
        int hora, minuto, segundo, passado, faltam;

        hora = 5;
        minuto = 25;
        segundo = 40;

        passado = segundo + minuto*60 + hora*3600;
        faltam = 86400 - passado;
        System.out.println("Já se passaram " + passado + " segundos desde o início do dia");
        System.out.println("Faltam " + faltam + " segundos para terminar o dia");
    }
}
