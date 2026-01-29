void main() {
    int[] numeros = {1, 5, 3, 12, 7, 9, 2};
    System.out.println(Arrays.toString(numeros));
    int numeroEliminar = 7;

    int index = 0;
    boolean trobat = false;
    while (index < numeros.length && !trobat) {
        if (numeros[index] == numeroEliminar) {
            trobat = true;
        } else {
            index++;
        }
    }

    numeros[index] = numeros[numeros.length - 1];
    numeros = Arrays.copyOf(numeros, numeros.length -1);

    System.out.println(Arrays.toString(numeros));
}