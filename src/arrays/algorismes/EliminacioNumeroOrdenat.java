void main() {
    int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    System.out.println(Arrays.toString(numeros));
    int eliminar = 6;

    int index = Arrays.binarySearch(numeros, eliminar);

//    for (int i = index; i < numeros.length - 1; i++) {
//        numeros[i] = numeros[i + 1];
//    }

    int[] resultat = new int[numeros.length - 1];

    System.arraycopy(numeros, 0, resultat, 0, index);
    System.arraycopy(numeros, index + 1, resultat, index, numeros.length - index - 1);

//    numeros = Arrays.copyOf(numeros, numeros.length - 1);

    System.out.println(Arrays.toString(resultat));
}