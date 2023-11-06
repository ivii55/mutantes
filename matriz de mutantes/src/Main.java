public class Main {
    public static void main(String[] args) {

        /*

        //creamos la matriz
        String  mutantDna[][] = new String [6][6];
        String nonMutantDna [][] = new String [6][6];

        //cargamos la matriz
        Scanner teclado = new Scanner(System.in);


        for (int f = 0; f < 6; f++) {
            for (int c = 0; c < 6; c++) {
                System.out.println("Ingrese un juego de combinaciones de letras T,G,C Y A " + f + "  " + c);
                mutantDna[f][c] = teclado.next(); //en la fila y columna donde estoy le asigno el nume q ingreso
            }
        }
        */

        //creo una matriz mutannte y no mutante

        String[][] adnMutante1 = {
                {"C", "G", "T", "A", "C", "G"},
                {"C", "A", "G", "T", "G", "C"},
                {"T", "T", "A", "T", "G", "T"},
                {"A", "G", "A", "A", "G", "G"},
                {"C", "C", "C", "C", "T", "A"},
                {"T", "A", "A", "A", "A","G"}
        };
        String[][] adnMutante2 = {
                {"A", "C", "A", "T", "C", "G"},
                {"C", "A", "G", "T", "G", "C"},
                {"T", "T", "A", "T", "G", "T"},
                {"A", "G", "A", "T", "G", "G"},
                {"C", "C", "C", "C", "G", "A"},
                {"T", "C", "A", "C", "T", "G"}
        };
        String[][] adnMutante3 = {
                {"A", "A", "A", "A", "C", "G"},
                {"C", "A", "G", "T", "G", "G"},
                {"T", "T", "A", "T", "G", "G"},
                {"A", "G", "A", "A", "G", "G"},
                {"C", "C", "C", "C", "T", "A"},
                {"T", "C", "A", "C", "T", "T"}
        };
        String[][] adnMutante4 = {
                {"A", "A", "T", "A", "C", "G"},
                {"C", "A", "G", "T", "G", "G"},
                {"T", "T", "T", "T", "G", "G"},
                {"A", "G", "A", "C", "G", "G"},
                {"C", "A", "C", "C", "C", "C"},
                {"T", "C", "A", "C", "T", "G"}
        };
        String[][] adnMutante5 = {
                {"A", "T", "A", "A", "C", "G"},
                {"C", "A", "G", "T", "G", "C"},
                {"T", "T", "G", "T", "G", "T"},
                {"A", "G", "A", "G", "G", "G"},
                {"C", "A", "C", "C", "G", "A"},
                {"T", "C", "A", "C", "T", "G"}
        };
        String[][] adnHumano1 = {
                {"T", "T", "T", "C", "G", "A"},
                {"C", "C", "C", "A", "T", "C"},
                {"G", "G", "G", "C", "G", "A"},
                {"A", "A", "A", "C", "T", "A"},
                {"T", "T", "T", "G", "T", "C"},
                {"G", "G", "G", "C", "G", "A"}
        };
        String[][] adnHumano2 = {
                {"C", "T", "G", "A", "A", "A"},
                {"A", "C", "T", "C", "C", "C"},
                {"A", "T", "C", "G", "G", "G"},
                {"C", "G", "A", "T", "T", "T"},
                {"G", "C", "A", "C", "C", "C"},
                {"A", "C", "G", "T", "T", "T"}
        };
        String[][] adnHumano3 = {
                {"A", "T", "G", "C", "G", "A"},
                {"C", "A", "G", "T", "T", "C"},
                {"T", "T", "A", "T", "G", "T"},
                {"A", "T", "C","A", "A", "A"},
                {"C", "T", "G", "T", "T", "T"},
                {"A", "G", "C", "G", "G", "G"}
        };
        String[][] adnHumano4 = {
                {"A", "G", "C", "T", "T", "T",},
                {"C", "T", "A", "C", "C", "C"},
                {"A", "G", "C", "G", "G", "G"},
                {"A", "G", "C", "A", "G", "G"},
                {"C", "C", "T", "A", "T", "A"},
                {"T", "C", "A", "C", "T", "G"}
        };
        String[][] adnHumano5 = {
                {"A", "T", "G", "C", "G", "A"},
                {"C", "A", "G", "T", "T", "C"},
                {"T", "T", "A", "T", "G", "T"},
                {"A", "G", "C", "A", "G", "G"},
                {"C", "C", "T", "A", "T", "A"},
                {"T", "C", "A", "C", "T", "G"}
        };

        analizo(adnMutante1);
        analizo(adnMutante2);
        analizo(adnMutante3);
        analizo(adnMutante4);
        analizo(adnMutante5);
        analizo(adnHumano1);
        analizo(adnHumano2);
        analizo(adnHumano3);
        analizo(adnHumano4);
        analizo(adnHumano5);
    }

            public static void analizo(String matrizz [][]) {
                try {
                    Proceso proceso = new Proceso();
                    System.out.println("La siguiente matriz:");
                    mostrar(matrizz);
                    if (proceso.isMutant(matrizz))
                        System.out.println("el humano es mutante");
                    else
                        System.out.println("el humanoo no  es mutante");
                } catch (MatrizException e) {
                    System.out.println("matrix no sedeable, ingrese otra " + e.getMessage());
                }
            }

            public static void mostrar(String matrizz [][]) {
                for (int f = 0; f < matrizz.length; f++) {
                    for (int c = 0; c < matrizz[0].length; c++) {
                        System.out.print(matrizz[f][c] + " ");
                    }
                    System.out.println("");
                }
            }

}