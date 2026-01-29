private static void Exercici1() {
    Scanner sc = new Scanner(System.in);

    System.out.print("Usuari: ");
    String usuari = sc.nextLine();
    System.out.print("Password: ");
    String password = sc.nextLine();

    if (validarUsuari(usuari) && validarPassword(password)) {
        System.out.println("Usuari validat! :)");
        return;
    }

    System.out.println("Usuari incorrecte :(");
}

private static boolean validarPassword(String password) {
    return password.length() > 8 && (password.contains("?") || password.contains("!"));
}

private static boolean validarUsuari(String usuari) {
    return !usuari.contains(" ");
}

private static void Exercici2() {
    System.out.print("Escriu una paraula: ");
    Scanner sc = new Scanner(System.in);
    String paraula = sc.nextLine();

    if (esCapicua(paraula)) {
        System.out.println("És capicua!");
        return;
    }

    System.out.println("No és capicua");
}

private static boolean esCapicua(String paraula) {
    int iterador = 0;
    while (iterador < (paraula.length() / 2)) {
        if (paraula.charAt(iterador) != paraula.charAt(paraula.length() - 1 - iterador)) {
            return false;
        }

        iterador++;
    }

    return true;
}

private static void Exercici3() {
    if (dataValida(30, 1, 2026)) {
        System.out.println("Data no validada");
        return;
    }

    System.out.println("Data no validada");
}

private static boolean dataValida(int dia, int mes, int any) {
    if (dia < 1 || dia > 31) {
        return false;
    }

    if (mes < 1 || mes > 12) {
        return false;
    }

    return any < 0;
}

private static void Exercici4() {
    Scanner sc = new Scanner(System.in);
    System.out.println("1 -> Pedra, 2 -> Paper, 3 -> Tisores");
    System.out.print("Tria la jugada: ");
    int jugadaJugador = sc.nextInt();
    System.out.println("El jugador ha triat: " + traduirJugada(jugadaJugador));

    int jugadaOrdinador = generarJugadaOrdinador();
    System.out.println("L'ordinador ha triat: " + traduirJugada(jugadaOrdinador));

    int guanyador = determinarGuanyador(jugadaJugador, jugadaOrdinador);

    switch (guanyador) {
        case 0:
            System.out.println("Empat");
            break;
        case 1:
            System.out.println("Jugador ha guanyat");
            break;
        case 2:
            System.out.println("Ordinador ha guanyat");
            break;
    }
}

private static int generarJugadaOrdinador() {
    Random rnd = new Random();
    return rnd.nextInt(3) - 1;
}

private static String traduirJugada(int jugada) {
    return switch (jugada) {
        case 1 -> "Pedra";
        case 2 -> "Paper";
        default -> "Tisores";
    };
}

private static int determinarGuanyador(int jUsuari, int jOrdinador) {
    String usuari = traduirJugada(jUsuari);
    String ordinador = traduirJugada(jOrdinador);

    if (usuari.equalsIgnoreCase(ordinador)) {
        return 0;
    }

    if(usuari.equalsIgnoreCase("Pedra") && ordinador.equalsIgnoreCase("Tisores")) {
        return 1;
    }

    if(usuari.equalsIgnoreCase("Paper") && ordinador.equalsIgnoreCase("Pedra")) {
        return 1;
    }

    return 2;
}

private static void Exercici5() {
    int resultat1 = tirarDau(6);
    System.out.println("Dau 1: " + resultat1);
    int resultat2 = tirarDau(6);
    System.out.println("Dau 2: " + resultat2);

    if (resultat1 == resultat2) {
        System.out.println("Tornes a tirar!");
    }
}

private static int tirarDau() {
    Random rnd = new Random();
    return rnd.nextInt(6) - 1;
}

private static int tirarDau(int cares) {
    Random rnd = new Random();
    return rnd.nextInt(cares) - 1;
}

private static void Exercici6() {
    double areaQuadrat = calcularArea(4.0);
    System.out.println("Àrea del quadrat: " + areaQuadrat);
    double areaRectangle = calcularArea(2.0, 3.0);
    System.out.println("Àrea del rectangle: " + areaRectangle);
    double areaCercle = calcularArea(5, true);
    System.out.println("Àrea del cercle: " + areaCercle);
}

private static double calcularArea(double costat) {
    return costat * costat;
}

private static double calcularArea(double base, double altura) {
    return base * altura;
}

private static double calcularArea(double radi, boolean esCercle) {
    if (esCercle) {
        return Math.PI * radi * radi;
    }

    return 0;
}

private static void Exercici7() {
    int numero = 10;
    System.out.println("El fibonacci del numero " + numero + " és: " + fibonacci(10));
}

private static int fibonacci(int n) {
    if (n == 0) {
        return 0;
    }

    if (n == 1) {
        return 1;
    }

    return fibonacci(n - 1) + fibonacci(n - 2);
}

private static void Exercici8() {
    int numero = 4500;
    System.out.println("Els digits de " + numero + " són: " + comptarDigits(4500));
}

private static int comptarDigits(int n) {
    if (n < 10) {
        return 1;
    }

    return 1 + comptarDigits(n / 10);
}

private static void Exercici9() {
    Scanner sc = new Scanner(System.in);

    System.out.println("Nom?");
    String nom = sc.next();
    System.out.println("Sou brut?");
    double sou = sc.nextDouble();

    double irpf = calcularIRPF(sou);

    double descompte = calcularDescompte(sou, irpf);
    double souNet = calcularSouNet(sou, descompte);

    System.out.println(construirNomina(nom, descompte, souNet));
}

private static double calcularSouNet(double sou, double descompte) {
    return sou - descompte;
}

private static double calcularDescompte(double sou, double irpf) {
    return sou * (irpf / 100);
}

private static double calcularIRPF(double sou) {
    double irpf = 0;
    if (sou < 12000) irpf = 10;
    else if (sou < 25000) irpf = 15;
    else irpf = 20;

    return irpf;
}

private static String construirNomina(String nom, double descompte, double souNet) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("--- NÒMINA ---" + "\n");
    stringBuilder.append("Client: " + nom + "\n");
    stringBuilder.append("Retenció: " + descompte + "\n");
    stringBuilder.append("Net: " + souNet + "\n");

    return stringBuilder.toString();
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
}
