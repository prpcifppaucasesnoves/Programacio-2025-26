private void Exercici1() {
    int[][] matriu = new int[3][3];

    // Omplim la matriu
    for (int i = 0; i < matriu.length; i++) {
        for (int j = 0; j < matriu[i].length; j++) {
            matriu[i][j] = (i * matriu[i].length) + j + 1;
        }
    }

    //Imprimim matriu
    imprimirMatriu(matriu);
}

private void imprimirMatriu(int[][] matriu) {
    System.out.println();
    System.out.println("MATRIU: " + matriu.length + " x " + matriu[0].length);
    for (int i = 0; i < matriu.length; i++) {
        for (int j = 0; j < matriu[i].length; j++) {
            System.out.print(matriu[i][j] + " ");
        }
        System.out.println();
    }
    System.out.println();
}

private void Exercici2() {
    System.out.print("De quina mida vols la matriu?: ");
    Scanner sc = new Scanner(System.in);
    int mida = sc.nextInt();

    int[][] matriu = new int[mida][mida];

    for (int i = 0; i < matriu.length; i++) {
        for (int j = 0; j < matriu[i].length; j++) {
            if (i == j) {
                matriu[i][j] = 1;
            } else {
                matriu[i][j] = 0;
            }
        }
    }

    imprimirMatriu(matriu);
}

private void Exercici3() {
    int[][] matriu = new int[5][5];

    for (int i = 0; i < matriu.length; i++) {
        for (int j = 0; j < matriu[i].length; j++) {
            if (i == 0 || j == 0 || i == matriu.length - 1 || j == matriu[i].length - 1) {
                matriu[i][j] = 1;
            } else {
                matriu[i][j] = 0;
            }
        }
    }

    imprimirMatriu(matriu);
}

private void Exercici4() {
    int[][] matriu = new int[4][4];
    Random rnd = new Random();

    for (int i = 0; i < matriu.length; i++) {
        for (int j = 0; j < matriu[i].length; j++) {
            matriu[i][j] = rnd.nextInt(10) + 1;
        }
    }

    imprimirMatriu(matriu);

    int sumatori = 0;

    for (int i = 0; i < matriu.length; i++) {
        for (int j = 0; j < matriu[i].length; j++) {
            sumatori += matriu[i][j];
        }
    }

    System.out.println("El número total es: " + sumatori);
}

private void Exercici5() {
    int[][] matriu = new int[5][5];
    Random rnd = new Random();
    for (int i = 0; i < matriu.length; i++) {
        for (int j = 0; j < matriu[i].length; j++) {
            matriu[i][j] = rnd.nextInt(10);
        }
    }

    imprimirMatriu(matriu);

    String[] nset = new String[0];

    for (int i = 0; i < matriu.length; i++) {
        for (int j = 0; j < matriu[i].length; j++) {
            if(matriu[i][j] == 7) {
                nset = Arrays.copyOf(nset, nset.length + 1);
                nset[nset.length - 1] = "[" + i + ", " + j + "]";
            }
        }
    }

    System.out.println("El número 7 s'ha trobat " + nset.length + " vegades");
    System.out.println("Les posicions del 7 són: " + Arrays.toString(nset));
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
}