public class Mycalendar extends DecorateurWidget{

    Widget w;
    public Mycalendar(Widget widget) {
        this.w=widget;
    }

    @Override
    public String getNom() {
        return w.getNom()+" we added calendar";
    }

    @Override
    public int getTaille() {
        return w.getTaille()+8;
    }

    @Override
    public String getCouleur() {
        return w.getCouleur();
    }
}
