/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManipulaCSV;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Eduardo M
 */
public class LerArquivoCSV {

    public List<String[]> LerCVS(String Arquivos) throws IOException {
        InputStream is = new FileInputStream(Arquivos);
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        List<String[]> linha= new LinkedList<>();
        while (s != null) {
            linha.add(s.split(";"));
            s = br.readLine();
        }
        br.close();
        return linha;

    }

}
