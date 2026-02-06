import classes.CompteBancari;

void main() {
    CompteBancari compteBancari = new CompteBancari("34523421Y", "Josep");

    System.out.println(compteBancari);
    compteBancari.ingressarDiners(100);
    System.out.println(compteBancari);
    compteBancari.treureDiners(50);
    System.out.println(compteBancari);
}