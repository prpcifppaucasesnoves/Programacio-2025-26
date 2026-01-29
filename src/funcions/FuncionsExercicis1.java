import java.lang.Math;

private static void Exercici1() {
    mostraTitol("PROGRAMACIÓ");
}

private static void mostraTitol(String titol) {
    System.out.println("****************");
    System.out.println("***" + titol + "***");
    System.out.println("****************");
}

private static void Exercici2() {
    int numero = 2;
    System.out.println("La taula del número " + numero + " és:");
    imprimirTaula(numero);
}

private static void imprimirTaula(int n) {
    if (n > 10 || n < 0) {
        System.out.println("No se pot imprimir la taula");
    }

    for (int i = 1; i < 11; i++) {
        System.out.println("El número multiplicat per " + i + " dona: " + (i * n));
    }
}

private static void Exercici3() {
    String moneda = "USD";
    int quantitat = 100;
    double resultat = canviMoneda(100, moneda);
    System.out.println(quantitat + " d'euros equival a: " + resultat + " " + moneda);
}

private static double getChangeRate(String moneda) {
    if (moneda.equalsIgnoreCase("USD")) {
        return 0.9;
    }

    return 1.1;
    //return (moneda.equalsIgnoreCase("USD")) ? 0.9 : 1.1;
}

private static double canviMoneda(double quantitat, String moneda) {
    return quantitat * getChangeRate(moneda);
}

private static void Exercici4() {
    System.out.println("20 graus celsius són: " + celsiusToFahrenheit(20.0) + " fahrenheit");
}

private static double celsiusToFahrenheit(double celsius) {
    return ((celsius * 9) / 5) + 32.0;
}

private static void Exercici5() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Escriu un número: ");
    int numero = sc.nextInt();

    while(esParell(numero)) {
        System.out.println("El número " + numero + " seleccionat és parell");
        System.out.print("Escriu un altre número: ");
        numero = sc.nextInt();
    }
}

private static boolean esParell(int n) {
    return n % 2 == 0;
}

private static void Exercici6() {
    char[] lletresDNI = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

    int valor = 43462824 % 23;

    System.out.println("Lletra: " + lletresDNI[valor]);
}

private static void Exercici7() {
    double areaResultant = areaAnella(6, 2);
    System.out.println("El radi resultant és: " + areaResultant);
}

private static double areaAnella(double radiGran, double radiPetit) {
    return areaCercle(radiGran) - areaCercle(radiPetit);
}

private static double areaCercle(double radi) {
    return Math.round(Math.PI * radi * radi);
}

private static void Exercici8() {

    dibuixarPiramide();

    dibuixarPiramide(3);

    dibuixarPiramide(6, '#');
}

static void dibuixarPiramide(int alçada, char simbol) {
    System.out.println("--- Piràmide d'alçada " + alçada + " amb '" + simbol + "' ---");

    for (int i = 1; i <= alçada; i++) {
        for (int espais = 0; espais < alçada - i; espais++) {
            System.out.print(" ");
        }

        for (int j = 0; j < (i * 2) - 1; j++) {
            System.out.print(simbol);
        }

        System.out.println();
    }
    System.out.println();
}

static void dibuixarPiramide(int alçada) {
    dibuixarPiramide(alçada, '*');
}

static void dibuixarPiramide() {
    dibuixarPiramide(5);
}

private static void Exercici9() {
    int resultat = sumaRecursiva(5);

    System.out.println("El resultat de la suma recursiva és: " + resultat);
}

private static int sumaRecursiva(int n) {
    if (n == 1) {
        return 1;
    }

    return n + sumaRecursiva(n-1);
}

private static void Exercici10() {
    String paraula = "Hola";
    System.out.println("Si invertim la paraula " + paraula + " surt: " + invertir(paraula));
}

private static String invertir(String paraula) {
    if (paraula.length() == 1) {
        return paraula;
    }

    char darrerCaracter = paraula.charAt(paraula.length() - 1);

    return darrerCaracter + invertir(paraula.substring(0, paraula.length() - 1));
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

    System.out.println("Exercici 7");
    Exercici7();

    System.out.println("Exercici 8");
    Exercici8();

    System.out.println("Exercici 9");
    Exercici9();

    System.out.println("Exercici 10");
    Exercici10();
}


