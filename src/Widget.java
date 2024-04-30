public class Widget {
    public String nom;
    public int taille;
    public String couleur;
    public Widget() {
    }
    public Widget(String nom, int taille, String couleur) {
        this.nom = nom;
        this.taille = taille;
        this.couleur = couleur;
    }
    public String getNom() {
        return nom;
    }
    public int getTaille() {
        return taille;
    }
    public String getCouleur() {
        return couleur;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setTaille(int taille) {
        this.taille = taille;
    }
    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }
    @Override
    public String toString() {
        return "Widget{" +
                "nom='" + getNom() + '\'' +
                ", taille=" + getTaille() +
                ", couleur='" + getCouleur() + '\'' +
                '}';
    }
}
