import java.util.Arrays;

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

    System.out.println("Exercici 7");
    Exercici7();

    System.out.println("Exercici 8");
    Exercici8();
}

private void Exercici1() {
    String[] mesos = {"gener", "febrer", "març", "abril", "maig", "juny",
            "juliol", "agost", "setembre", "octubre", "novembre", "desembre"};

    System.out.println(mesos[0]);
    System.out.println(mesos[11]);
    System.out.println(mesos.length);
    System.out.println(mesos[mesos.length-5]);
}

private void Exercici2(){
    double[] numeros = new double[50];
    Arrays.fill(numeros, -1.0);
    Arrays.fill(numeros, 0, 10, 5.5);
    System.out.println(Arrays.toString(numeros));
}

private void Exercici3() {
    int[] numeros = new int [20];
    for (int i = 0; i < numeros.length; i++) {
        numeros[i] = (int)(Math.random()*100);
    }

    System.out.println(Arrays.toString(numeros));
    int sumatori = 0;
    for(int numero : numeros) {
        sumatori += numero;
    }

    double resultat = (double) sumatori / numeros.length;
    System.out.println("Mitjana: " + resultat);
    int maxim = 0;
    for (int numero : numeros) {
        if (maxim < numero) {
            maxim = numero;
        }
    }

    System.out.println("Maxim: " + maxim);
}

private void Exercici4() {
    int[] numeros =  {1, 5, 3, 5, 2, 5, 8, 5, 0};

    Scanner sc = new Scanner(System.in);
    System.out.print("Quin número vols buscar: ");
    int nusuari = sc.nextInt();

    int nvegades = 0;
    for (int numero : numeros) {
        if (numero == nusuari) {
            nvegades++;
        }
    }

    System.out.println("El número apareix " + nvegades + " vegades");
}

private void Exercici5() {
    System.out.print("Quants productes vols comprar: ");
    Scanner sc = new Scanner(System.in);

    int midaArray = sc.nextInt();
    String[] productes = new String[midaArray];

    for (int i = 0; i < productes.length; i++) {
        System.out.print("Insereix nom del producte " + i + ": ");
        Scanner pd = new Scanner(System.in);
        productes[i] = pd.nextLine();
    }

    System.out.println(Arrays.toString(productes));
}

private void Exercici6() {
    int[] numeros = new int[5];

    for (int i = 0; i < numeros.length; i++) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Afegeix un número: ");
        numeros[i] = sc.nextInt();
    }

    System.out.println("Array usuari: " + Arrays.toString(numeros));

    String resultat = "Array invers: [";

    for (int i = numeros.length-1; i >= 0; i--) {
        resultat += numeros[i];
        if (i != 0) {
            resultat += ", ";
        }
    }

    resultat += "]";

    System.out.println(resultat);
}

private void Exercici7() {
    double[] notes = {4.5, 8.0, 9.5, 2.0};
    System.out.println(Arrays.toString(notes));

    pujarNota(notes);

    System.out.println(Arrays.toString(notes));
}

private void pujarNota(double[] notes) {
    for (int i = 0; i < notes.length; i++) {
        notes[i]++;
    }
}

private void Exercici8() {
    int[] a = {10, 20, 30};

    int[] b = a;
    System.out.println("b[0]: " + b[0]);

    b[0] = 99;
    System.out.println("a[0]: " + a[0]);

    int[] c = new int[3];
    for (int i = 0; i < c.length; i++) {
        c[i] = a[i];
    }

    c[0] = 50;
    System.out.println("c[0]: " + c[0]);
    System.out.println("a[0]: " + a[0]);
    System.out.println("b[0]: " + b[0]);
}
