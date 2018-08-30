package javaapplication4;

import java.util.Scanner;

public class JavaApplication4 {

    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        int mes;
       
        System.out.println("Deseja saber a partir de qual mes?");
        mes = ler.nextInt();
        
        switch (mes) {
            
            case 1:
                System.out.println("Janeiro / Fevereiro / Março / Abril"
                        + " / Maio / Junho / Julho / Agosto / Setembro"
                        + " / Outubro / Novembro / Dezembro ");
                break;
                case 2:
                System.out.println("Fevereiro / Março / Abril"
                        + " / Maio / Junho / Julho / Agosto / Setembro"
                        + " / Outubro / Novembro / Dezembro ");
                break;
                case 3:
                System.out.println("Março / Abril"
                        + " / Maio / Junho / Julho / Agosto / Setembro"
                        + " / Outubro / Novembro / Dezembro ");
                break;
                case 4:
                System.out.println("Abril / Maio / Junho / Julho / Agosto / Setembro"
                        + " / Outubro / Novembro / Dezembro");
                break;
                case 5:
                System.out.println("Maio / Junho / Julho / Agosto / Setembro"
                        + " / Outubro / Novembro / Dezembro");
                break;
                case 6:
                System.out.println("Junho / Julho / Agosto / Setembro"
                        + " / Outubro / Novembro / Dezembro");
                break;
                case 7:
                System.out.println("Julho / Agosto / Setembro"
                        + " / Outubro / Novembro / Dezembro");
                break;
                case 8:
                System.out.println("Agosto / Setembro"
                        + " / Outubro / Novembro / Dezembro");
                break;
                case 9:
                System.out.println("Setembro / Outubro / Novembro / Dezembro");
                break;
                case 10:
                System.out.println("Outubro / Novembro / Dezembro");
                break;
                case 11:
                System.out.println("Novembro / Dezembro");
                break;
                case 12:
                System.out.println("Dezembro");
                break;
             
        }
    }

}
