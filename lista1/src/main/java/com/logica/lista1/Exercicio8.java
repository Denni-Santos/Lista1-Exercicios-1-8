package com.logica.lista1;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class Exercicio8 {
    public static void resolucao2() throws InterruptedException{
Scanner sc = new Scanner(System.in);

            int tentativa = 0;
            int pontuacao = 0;
            int erros=0;
            int acertos=0;
            String resposta;


            System.out.println("SEJA BEM VINDO AO JOGO DAS 5 PERGUNTAS!!!");

            String[][] perguntas ={ 
            {"1.Quem descobriu a America?", "a) Marcus Vespucio", "b) Pedro Alvares Cabral", "c) Cristóvão Colombo", "d) Daniel Sardinha", "c"},
            {"2.Qual marca pertence o automel Fusca?", "a)Fiat", "b)Volkwagen", "c)Chevrolet", "d)"Ford, "b"},
            {"3.Como se chama a cidade do Distrito Federal?", "a)Salvador","b)Manaus","c)Rio Branco","d)Brasiiia", "d"},
            {"4.Qual é a cor da faixa que tem na Bandeira do Brasil?", "a)Azul","b)Vermelho", "c)Branco", "d)Laranja","c"},
            {"5.Onde se encontra a Estatua do Cristo Redentor?", "a)Rio de Janeiro", "b)Brasilia", "c)Salvador","d)Belo Horizonte", "a"}};

            for (int i = 0; i < perguntas.length; i++) {
                System.out.print("\033[H\033[2J");
                System.out.flush(); 
                System.out.println(perguntas[i][0]); 
                
                System.out.println(perguntas[i][1]); 
                
                System.out.println(perguntas[i][2]);
                
                System.out.println(perguntas[i][3]); 
                
                System.out.println(perguntas[i][4]); 
                
                System.out.print("Digite sua resposta: ");
                 resposta = sc.nextLine();

                if(resposta.equalsIgnoreCase(perguntas[i][5])){
                    acertos++;
                    System.out.println("Você acertou!!!");
                    TimeUnit.SECONDS.sleep(3);
                }
                else{
                    erros++;
                    System.out.println("Que pena! Você errou.");
                    TimeUnit.SECONDS.sleep(3);
                }

                if(erros==3){
                    System.out.println("Você errou 3 vezes, GAME OVER.");
                    break;
                }
                

                if(erros<3){
                    System.out.println("Você tem "+acertos+" acertos.");
                }