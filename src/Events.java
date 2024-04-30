public class Events extends DecorateurWidget{
    Widget w;
    public Events(Widget widget) {
        this.w=widget;
    }

    @Override
    public String getNom() {
        return w.getNom()+" we added events";
    }

    @Override
    public int getTaille() {
        return w.getTaille()+10;
    }

    @Override
    public String getCouleur() {
        return w.getCouleur();
    }
}
