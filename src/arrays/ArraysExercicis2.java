private void Exercici1() {
    double[] temperatures = new double[12];
    for (int i = 0; i < temperatures.length; i++) {
        System.out.print("La temperatura el mes de " + traduirMes(i + 1) + " ha estat: ");
        Scanner sc = new Scanner(System.in);
        temperatures[i] = sc.nextDouble();
    }

    double tempMaxima = temperaturaMaxima(temperatures);
    double tempMinima = tempareturaMinima(temperatures);
    double tempMitja = temperaturaMitjana(temperatures);

    System.out.println("La temperatura mitja de l'any ha estat: " + tempMitja + " graus");

    int indexMax = cercaIndex(temperatures, tempMaxima);
    int indexMin = cercaIndex(temperatures, tempMinima);

    System.out.println("El mes més calorós ha estat el " + traduirMes(indexMax + 1) + " amb " + tempMaxima + " graus.");
    System.out.println("El mes més fred ha estat el " + traduirMes(indexMin + 1) + " amb " + tempMinima + " graus.");
}

private static double temperaturaMaxima(double[] temperatures) {
    double maxima = temperatures[0];
    for (int i = 1; i < temperatures.length; i++) {
        if (temperatures[i] > maxima) {
            maxima = temperatures[i];
        }
    }

    return maxima;
}

private static double tempareturaMinima(double[] temperatures) {
    double minima = temperatures[0];
    for (int i = 1; i < temperatures.length; i++) {
        if (temperatures[i] < minima) {
            minima = temperatures[i];
        }
    }

    return minima;
}

private static double temperaturaMitjana(double[] temperatures) {
    double suma = 0;
    for (int i = 1; i < temperatures.length; i++) {
        suma += temperatures[i];
    }

    return suma / temperatures.length;
}

private static String traduirMes(int mes) {
    return switch (mes) {
        case 1 -> "gener";
        case 2 -> "febrer";
        case 3 -> "març";
        case 4 -> "abril";
        case 5 -> "maig";
        case 6 -> "juny";
        case 7 -> "juliol";
        case 8 -> "agost";
        case 9 -> "setembre";
        case 10 -> "octubre";
        case 11 -> "novembre";
        default -> "desembre";
    };
}

private static int cercaIndex(double[] temperatures, double temperatura) {
    boolean trobat = false;
    int index = 0;
    while (index < temperatures.length && !trobat) {
        if (temperatures[index] == temperatura) {
            trobat = true;
        } else {
            index++;
        }
    }

    return trobat ? index : -1;
}

private void Exercici2() {
    int[] n = {1, 2, 3, 4, 5};
    System.out.println("Array normal: " + Arrays.toString(n));

    inverteixArray(n);

    System.out.println("Array invertit: " + Arrays.toString(n));
}

private static void inverteixArray(int[] n) {
    for (int i = 0; i < n.length / 2; i++) {
        int aux = n[i];
        n[i] = n[n.length - i - 1];
        n[n.length - i - 1] = aux;
    }
}

private void Exercici3() {
    boolean acaba = false;

    String[] xat = new String[0];

    do {
        System.out.print("Missatge: ");
        Scanner sc = new Scanner(System.in);
        String missatge = sc.nextLine();

        if (missatge.equalsIgnoreCase("fi")) {
            acaba = true;
        } else {
            xat = Arrays.copyOf(xat, xat.length + 1);
            xat[xat.length - 1] = missatge;
        }

    } while (!acaba);

    for (String missatge : xat) {
        System.out.println(missatge);
    }
}

private void Exercici4() {
    int[] grupA = {1, 2, 3};
    int[] grupB = {4, 5, 6, 7};

    int[] total = new int[grupA.length + grupB.length];

    for (int i = 0; i < grupA.length; i++) {
        total[i] = grupA[i];
    }

    for (int i = 0; i < grupB.length; i++) {
        total[i + grupA.length] = grupB[i];
    }

    System.out.println("Concatenació d'arrays manual");
    System.out.println("Array 1: " + Arrays.toString(grupA));
    System.out.println("Array 2: " + Arrays.toString(grupB));
    System.out.println("Array total: " + Arrays.toString(total));

    total = new int[grupA.length + grupB.length];

    System.arraycopy(grupA, 0, total, 0, grupA.length);
    System.arraycopy(grupB, 0, total, grupA.length, grupB.length);

    System.out.println("Concatenació d'arrays copiant");
    System.out.println("Array 1: " + Arrays.toString(grupA));
    System.out.println("Array 2: " + Arrays.toString(grupB));
    System.out.println("Array total: " + Arrays.toString(total));
}

private void Exercici5() {
    int[] punts = {1000, 800, 500, 200, 100};
    inverteixArray(punts);
    int usuari = 650;

    System.out.println(Arrays.toString(punts));

    int index = cercaIndex(punts, usuari);

    int[] nousPunts = new int[punts.length + 1];

    System.arraycopy(punts, 0, nousPunts, 0, index);
    nousPunts[index] = usuari;
    System.arraycopy(punts, index, nousPunts, index + 1, nousPunts.length - index - 1);

    System.out.println(Arrays.toString(nousPunts));
}

private static int cercaIndex(int[] punts, int usuari) {
    int posicio = Arrays.binarySearch(punts, usuari);
    return posicio < 0 ? (posicio * -1) - 1 : posicio;
}

private void Exercici6() {
    String[] noms = {"Anna", "Bernat", "Carles", "Anna", "David"};
    String usuari = "Anna";

    int j = 0;
    for (int i = 0; i < noms.length; i++) {
        if (!noms[i].equals(usuari)) {
            noms[j++] = noms[i];
        }
    }

    noms = Arrays.copyOf(noms, j);

    System.out.println(Arrays.toString(noms));
}

void main() {
    System.out.println("Exercici 1");
    Exercici1();

    System.out.println("Exercici 2");
    Exercici2();

    System.out.println("Exercici 3");
    Exercici3();

    System.out.println("Exercici 4");
    Exercici4();

    System.out.println("Exercici 5");
    Exercici5();

    System.out.println("Exercici 6");
    Exercici6();
}