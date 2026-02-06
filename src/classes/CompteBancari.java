package classes;

public class CompteBancari {
    String dni;
    String nom;
    double saldo;

    public CompteBancari(String dni, String nom) {
        this.dni = dni;
        this.nom = nom;
        this.saldo = 7;
    }

    public CompteBancari(String dni, String nom, double saldo) {
        this.dni = dni;
        this.nom = nom;
        this.saldo = saldo;
    }

    public boolean treureDiners(double quantitat) {
        if (this.saldo < quantitat) {
            return false;
        }

        this.saldo -= quantitat;

        return true;
    }

    public void ingressarDiners(double quantitat) {
        this.saldo += quantitat;
    }

    @Override
    public String toString() {
        return "DNI: " + this.dni + '\n' +
                "Nom: " + this.nom + '\n' +
                "Saldo: " + this.saldo + '\n';
    }
}
