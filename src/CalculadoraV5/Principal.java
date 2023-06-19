package CalculadoraV5;

import CalculadoraV4.*;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int continuar;
        double num1;
        double num2;
        int operacao;
        double resultado = 0;

        do
        {
            num1 = EntradaSaida.solicitaNumero("1º");
            num2= EntradaSaida.solicitaNumero("2º");
            System.out.println();
            operacao = EntradaSaida.solicitaOperacao();

            switch (operacao)
            {
                case 1:
                    Soma soma = new Soma();

                    soma.setNum1(num1);
                    soma.setNum2(num2);

                    resultado = soma.calcula();
                    break;

                case 2:
                    Subtracao sub = new Subtracao();

                    sub.setNum1(num1);
                    sub.setNum2(num2);

                    resultado = sub.calcula();
                    break;

                case 3:
                    Multiplicacao multi = new Multiplicacao();

                    multi.setNum1(num1);
                    multi.setNum2(num2);

                    resultado = multi.calcula();
                    break;

                case 4:
                    while(num2 == 0)
                    {
                        num2 = EntradaSaida.solicitaNumero("2º");
                    }
                    Divisao divi = new Divisao();

                    divi.setNum1(num1);
                    divi.setNum2(num2);

                    resultado = divi.calcula();
                    break;

                default:
                    System.out.println("Operação inválida! A calculadora será encerrada!");
                    System.exit(0);
            }

            System.out.println();
            EntradaSaida.mostraResultado(resultado, operacao);
            System.out.println();

            System.out.println("Deseja continuar calculando? 1 - Sim | 2 - Não");
            continuar = sc.nextInt();
        }while (continuar == 1);

    }
}
