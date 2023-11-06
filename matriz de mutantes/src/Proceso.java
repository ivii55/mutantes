public class Proceso {
    // metodo pedido en donde verifico si la matriz ingresada es correcta y aparti de ello genero un variable contador
    public boolean isMutant(String[][] dna) throws MatrizException {
        int n = dna.length;
        if (n == 0) {
            throw new MatrizException("la matriz que ingreso esta vacia");
        }
        for (int f = 0; f < n; f++) {
            if (dna[f].length != n) {
                throw new MatrizException("la matriz de entrada no es cuadrada");
            }
            for (int c = 0; c < n; c++) {
                if (!dna[f][c].matches("[ATCG]")) {
                    throw new MatrizException("la matriz contiene caracteres no validos");
                }
            }
        }
        int contador = 0;
        contador += contadorHorizontal(dna);
        contador += contadorVertical(dna);
        contador += contadorDiagonal(dna);
        return contador >= 2;
    }
     // metodo que recorre la matriz de forma horizontal
    private int contadorHorizontal(String[][] dna) {
        int contador = 0;
        for (int f = 0; f < dna.length; f++) {
            for (int c = 0; c < dna[f].length - 3; c++) {
                if (dna[f][c].equals(dna[f][c+1]) && dna[f][c].equals(dna[f][c+2]) && dna[f][c].equals(dna[f][c+3])) {
                    contador++;
                }
            }
        }
        return contador;
    }

    private int contadorVertical(String[][] dna) {
        int contador = 0;
        for (int f = 0; f < dna.length - 3; f++) {
            for (int c = 0; c < dna[f].length; c++) {
                if (dna[f][c].equals(dna[f+1][c]) && dna[f][c].equals(dna[f+2][c]) && dna[f][c].equals(dna[f+3][c])) {
                    contador++;
                }
            }
        }
        return contador;
    }



    private int contadorDiagonalArribaIzquierdaAbajoDerecha(String[][] dna) {
        int contador = 0;
        for (int f = 0; f < dna.length - 3; f++) {
            for (int c = 0; c < dna[f].length - 3; c++) {
                if (dna[f][c].equals(dna[f+1][c+1]) && dna[f][c].equals(dna[f+2][c+2]) && dna[f][c].equals(dna[f+3][c+3])) {
                    contador++;
                }
            }
        }
        return contador;
    }

    private int contadorDiagonalAbajoIzquierdaArribaDerecha(String[][] dna) {
        int contador = 0;
        for (int f = 3; f < dna.length; f++) {
            for (int c = 0; c < dna[f].length - 3; c++) {
                if (dna[f][c].equals(dna[f-1][c+1]) && dna[f][c].equals(dna[f-2][c+2]) && dna[f][c].equals(dna[f-3][c+3])) {
                    contador++;
                }
            }
        }
        return contador;
    }

    // metodo q recorre lamatriz de foma diagonal
    private int contadorDiagonal(String[][] dna) {
        int contador = 0;
        contador += contadorDiagonalArribaIzquierdaAbajoDerecha(dna);
        contador += contadorDiagonalAbajoIzquierdaArribaDerecha(dna);
        return contador;
    }
}
