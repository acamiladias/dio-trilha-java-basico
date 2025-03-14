public class TiposVariaveis {
        // O 'throws Exception' indica que o metodo pode gerar uma exceção.
    // Como não há operações que possam causar erros, essa cláusula não é necessária.
    public static void main(String[] args) throws Exception {
        double salarioMInimo = 2_500;

        short numeroCurto =1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

    // Variavéis vs constantes
    final int NUMERO = 5;
    //NUMERO = 10; vai dar erro e mandar eu retirar pq já disse que ela é uma final
            // e se colocar final deve colocar a variavel em CAIXA ALTA
    System.out.println(NUMERO);

    }
}
