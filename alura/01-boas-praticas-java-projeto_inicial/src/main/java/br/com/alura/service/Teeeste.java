package br.com.alura.service;

public class Teeeste {
    public class Principal {
        public static void main (String x) {
            Teste t = new Teste();

            t.chamarOperacao();
        }
    }

    public class Teste {

        public void chamarOperacao( ) {
            System.out.println("Chamando método de outra classe");
        }

    }

}
