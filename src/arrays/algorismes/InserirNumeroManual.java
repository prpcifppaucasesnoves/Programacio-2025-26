/*
 * Inserció d'un número en un array ordenat de forma manual.
 *   1. Es cerca l'índex de forma manual amb un bucle while
 *   2. S'afegeixen el números anteriors a la inserció.
 *   3. S'afegeix el número en concret.
 *   4. S'afegeixen la resta dels números que segueixen a l'inserit.
 * */

import java.util.Arrays;

void main(String[] args) {
    int[] numeros = {10, 14, 16, 17, 19, 21};
    int numeroAfegir = 6;

    int index = cercaIndex(numeros, numeroAfegir);

    int[] resultat = afegirNumero(numeros, index, numeroAfegir);

    System.out.println(Arrays.toString(resultat));
}

private static int cercaIndex(int[] numeros, int numeroAfegir) {
    int index = 0;

    while (index < numeros.length && numeroAfegir > numeros[index]) {
        index++;
    }

    return index;
}

private static int[] afegirNumero(int[] numeros, int index, int numeroAfegir) {
    int[] resultat = new int[numeros.length + 1];

    System.arraycopy(numeros, 0, resultat, 0, index);

    resultat[index] = numeroAfegir;

    System.arraycopy(numeros, index, resultat, index + 1, resultat.length - index - 1);

    return resultat;
}