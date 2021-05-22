/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import ManipulaCSV.*;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Eduardo M
 */
public class principal {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        EscreverArquivo ea = new EscreverArquivo();
        LerArquivoCSV la = new LerArquivoCSV();
        String arquivos, Teclado;
        List<String> GravaLista = new LinkedList<>();
        List<String[]> ListaRetorno;
        String[] lista;
        int operacao, i = 0;

        arquivos = "C:\\Users\\Eduardo\\Documents\\NetBeansProjects\\manipulaCSV\\ArquivoCSV/Teste.csv";
       // ea.CRIARARQUIVO(arquivos);
        do {

            System.out.println("Digite o Nome do produto");
            Teclado = sc.next() + ";";
            System.out.println("Digite o Custo do produto");
            Teclado = Teclado + sc.next() + ";";
            System.out.println("Digite o valor de venda do produto");
            Teclado = Teclado + sc.next() + ";";
            System.out.println("Digite a quantidade do produto");
            Teclado = Teclado + sc.next() + ";";
            System.out.println("Digite o Fonecedor do produto");
            Teclado = Teclado + sc.next()+ ";";
            GravaLista.add(Teclado);
            System.out.println("Digite 1 para add produto ou Digite 2 para terminar de add");
            operacao = sc.nextInt();
            i++;
        } while (operacao != 2);
        ea.GravarCSV(arquivos, GravaLista);
        ListaRetorno = la.LerCVS(arquivos);
        System.out.println("");
        System.out.println("------------------------------------------");
        for (i = 0; i < ListaRetorno.size(); i++) {
            lista = ListaRetorno.get(i);
            System.out.println("Nome: " +lista[0] );
            System.out.println("Custo: " + lista[0+1]);
            System.out.println("Valor de venda: " + lista[0+2]);
            System.out.println("quantidade: " + lista[0+3]);
            System.out.println("Fonecedor: " + lista[0+4]);
            System.out.println("------------------------------------------");
        }

    }
}
