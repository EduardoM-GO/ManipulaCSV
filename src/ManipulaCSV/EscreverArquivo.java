/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManipulaCSV;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.List;

/**
 *
 * @author Eduardo M
 */
public class EscreverArquivo {

    public static void CRIARARQUIVO(String ARQUIVO) throws IOException {

        FileWriter FILE = new FileWriter(ARQUIVO);

    }

    public void GravarCSV(String Arquivo, String Nome, String Custo, String venda, String quantidade, String fornecedor) throws FileNotFoundException, IOException {
        OutputStream os = new FileOutputStream(Arquivo);
        OutputStreamWriter osw = new OutputStreamWriter(os);
        BufferedWriter bw = new BufferedWriter(osw);
        String c = "Deu certo ;";
       
            
        bw.write(c); 
 
        bw.newLine();
        bw.close();
        bw.write(Nome + ";" + Custo + ";" + venda + ";" + quantidade + ";" + fornecedor);
        bw.newLine();
        bw.close();
    }

    public void GravarCSV(String Arquivo, List<String> Conteudo) throws FileNotFoundException, IOException {
        OutputStream os = new FileOutputStream(Arquivo);
        OutputStreamWriter osw = new OutputStreamWriter(os);
        BufferedWriter bw = new BufferedWriter(osw);
        for (int i = 0; i < Conteudo.size(); i++) {
            bw.write(Conteudo.get(i));
            bw.newLine();
        }
        bw.close();
    }
}
