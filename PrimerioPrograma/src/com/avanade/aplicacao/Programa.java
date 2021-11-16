package com.avanade.aplicacao;

import com.avanade.aplicacao.servicos.ServicoProcessarArquivos;

public class Programa {

//    static Integer inteiro = 10;
//    long longo;
//    double decimal;
//    float decimal2;
//    boolean boleando;
//
//    String texto = null;//por padrão é nulo

    //    public static void main(String...args) {
//        System.out.println("Hello Word!");
//
//        boolean continuar = true;
//        if(continuar){
//
//            Integer quantidade = 10;//se for usar so dentro do metodo, so declarar ele no metodo.
//        }
//
//
//    }
//
//    public static void executa(){
//
//    }
    public static void main(String[] args)
    {
        if (args.length == 0)
        {
            System.out.println("Parâmetro caminho obrigatório");
            System.out.println("Uso:");
            System.out.println("java com.avanade.aplicacao.Programa [CAMINHO]");
            System.exit(-1);
            return;
        }
        System.out.println("Iniciando aplicação");
        Programa programa = new Programa();
        programa.iniciar(args[0]);
    }

    public void iniciar(String caminhoDirEntrada)
    {
        ServicoProcessarArquivos servico = new ServicoProcessarArquivos(caminhoDirEntrada);
        servico.executar();
    }
}
