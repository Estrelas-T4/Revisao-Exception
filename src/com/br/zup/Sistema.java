package com.br.zup;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Sistema {
    public final static List<HashMap<String, String>> agenda = new ArrayList<>();

    public static HashMap<String, String> procurarContato(String nome){
        for (HashMap<String, String> contato : agenda){
            if(contato.get("nome") == nome){
                return contato;
            }
        }

        throw new RuntimeException("Não encontrei o Contato");
    }

    public static HashMap<String, String> ataualizarContato(String nome){
        HashMap<String, String> contato = procurarContato(nome);
        contato.put(scanner("Digite o campo").nextLine(), scanner("Digite novo valor").nextLine());
        contato.put(scanner("Digite o campo").nextLine(), scanner("Digite novo valor").nextLine());
        contato.put(scanner("Digite o campo").nextLine(), scanner("Digite novo valor").nextLine());
        return contato;
    }

    private static Scanner scanner(String mensagem){
        System.out.println(mensagem);
        return new Scanner(System.in);
    }

}
