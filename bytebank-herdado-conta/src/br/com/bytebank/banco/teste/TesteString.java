package br.com.bytebank.banco.teste;

import java.util.Locale;

public class TesteString {

    public static void main(String[] args) {
        String nome = "Alura";
        String vazio = " ";
        String outroVazio = vazio.trim();
        String newNome = nome.concat(" Cursos tops!");
        String otherName = nome.replace("l", "lt");
        String upper = nome.toUpperCase();
        String low = nome.toLowerCase();
        int pos = nome.indexOf("r");
        String sub = nome.substring(2);

//        for (int i = 0; i < nome.length(); i++) {
//            System.out.println(nome.charAt(i));
//        }
        System.out.println(outroVazio.isEmpty());
        System.out.println(vazio.isEmpty());
        System.out.println(vazio.contains(""));
//        System.out.println(nome.length());
//        System.out.println(sub);
//        System.out.println(pos);
//        System.out.println(newNome);
//        System.out.println(otherName);
//        System.out.println(upper);
//        System.out.println(low);


    }
}
