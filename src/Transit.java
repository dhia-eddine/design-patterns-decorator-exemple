public class Transit extends DecorateurWidget{
    Widget w;
    public Transit(Widget widget) {
        this.w=widget;
    }

    @Override
    public String getNom() {
        return w.getNom()+" we added transit";
    }

    @Override
    public int getTaille() {
        return w.getTaille()+5;
    }

    @Override
    public String getCouleur() {
        return w.getCouleur()+" we changet to green";
    }


}
