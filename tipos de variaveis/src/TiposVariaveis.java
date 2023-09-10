public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        //tipos de variaveis na linguagem java

        //primitivos int, byte , short ,long , float , double , boolean e char
        //string para texto
        String meuNome = "Cauan Nogueira ";
        // esses tipo de  variaveis não são consideradas objetos
        // são parecido com a linguagem C/C++


        // variaveis constantes devem serem escrita em caixa alta
        long cachorro =  12121313L;//variaveis long, sempre devem ter um 'l' no final
        float pi = 3.14f;//variaveis float, sempre devem ter 'f' em seu final
        System.out.println(pi);// ex
        System.out.println(cachorro);//ex 2

        //final para 'declarar uma variavel como constante constante
        //sempre declarar uma variavel constante em caixa altas
        System.out.println(meuNome + "é lindo");
        final double PI = 3.14;
        System.out.println(PI);

    }
}
