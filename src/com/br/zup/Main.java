package com.br.zup;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
    while (true){
        try{
            HashMap<String, String> contato = Sistema.ataualizarContato("vinicius");
        }catch (RuntimeException exception){
            System.out.println(exception.getMessage());
        }finally {
            System.out.println("Xablau");
        }
    }


    }
}
