/*
* Inserció d'un número en un array ordenat amb funció Arrays.sort.
*   1. Es fa una còpia d'un array amb un longitud de +1
*   2. S'afegeix el nou element a la darrera posició
*   3. S'ordena amb Arrays.sort
* */

import java.util.Arrays;

void main(String[] args) {
    int[] numeros = {10, 14, 16, 17, 19, 21};
    int numeroAfegir = 6;

    int[] resultat = afegirNumero(numeros, numeroAfegir);

    System.out.println(Arrays.toString(resultat));
}

private static int[] afegirNumero(int[] numeros, int numeroAfegir) {
    int[] resultat = Arrays.copyOf(numeros, numeros.length + 1);

    resultat[resultat.length - 1] = numeroAfegir;

    Arrays.sort(resultat);

    return resultat;
}