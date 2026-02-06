private void Exercici1() {
    int[] assistencia = {45, 23, 67, 87, 98, 12, 45, 67,68, 90};

    double mitjana = calculaMitjana(assistencia);

    int diesMesMitjana = diesMesMitjana(assistencia, mitjana);
    int diaMaximaAfluencia = maximaAfluencia(assistencia);
    int diaMinimaAfluencia = miniimaAfluencia(assistencia);

    System.out.println("La mitjana d'assistència es: " + mitjana);
    System.out.println("El dies que han superat la mitjana han estat: " + diesMesMitjana);
    System.out.println("El dia de màxima afluencia ha estat: " + diaMaximaAfluencia);
    System.out.println("El dia de mínima afluencia ha estat: " + diaMinimaAfluencia);
}

private int miniimaAfluencia(int[] numeros) {
    int minim = numeros[0];
    int index = 0;
    for (int i = 1; i < numeros.length; i++) {
        if (minim > numeros[i]) {
            minim = numeros[i];
            index = i;
        }
    }

    return  index + 1;
}

private int maximaAfluencia(int[] numeros) {
    int maxim = numeros[0];
    int index = 0;
    for (int i = 1; i < numeros.length; i++) {
        if (maxim < numeros[i]) {
            maxim = numeros[i];
            index = i;
        }
    }

    return  index + 1;
}

private double calculaMitjana(int[] numeros) {
    double sumatori = 0;
    for (int numero : numeros) {
        sumatori += numero;
    }

    return sumatori / numeros.length;
}

private int diesMesMitjana(int[] numeros, double mitjana) {
    int contador = 0;
    for (int numero : numeros) {
        if (numero > mitjana) {
            contador++;
        }
    }

    return contador;
}

private void Exercici2() {
    int[] parking = new int[10];

    boolean acabar = false;
    do {
        printMenu();
        Scanner sc = new Scanner(System.in);
        int opcio = sc.nextInt();

        switch (opcio) {
            case 1:
                boolean aparcat = entrarCotxer(parking);
                if (!aparcat) {
                    System.out.println("No s'ha pogut aparcar el cotxe, parking ple.");
                }
                break;
            case 2:
                System.out.print("Tria una plaça de parking: ");
                sc = new Scanner(System.in);
                int placa = sc.nextInt();
                boolean desaparcat = sortirCotxe(parking, placa);
                if (!desaparcat) {
                    System.out.println("Plaça ja buida");
                }
                break;
            case 3:
                System.out.println(Arrays.toString(parking));
                break;
            default:
                acabar = true;
        }
    } while (!acabar);
}

private boolean entrarCotxer(int[] parking) {
    boolean acabar = false;
    int index = 0;

    while (index < parking.length && !acabar) {
        if (parking[index] == 0) {
            acabar = true;
            parking[index] = 1;
        } else {
            index++;
        }
    }

    return acabar;
}

private boolean sortirCotxe(int[] parking, int placa) {
    if (parking[placa] == 0) {
        return false;
    }

    parking[placa] = 0;
    return true;
}

private void printMenu() {
    System.out.println("MENU");
    System.out.println("1. Entrar cotxe");
    System.out.println("2. Sortir cotxe");
    System.out.println("3. Estat parking");
    System.out.print("Opció: ");
}

void main() {
    System.out.println("Exercici 1");
    Exercici1();

    System.out.println("Exercici 2");
    Exercici2();
}