//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Widget w1=new Agrandissable();
        System.out.println("widget 1:"+w1);



        Events w1_eve=new Events(w1);
        System.out.println("w + eve"+w1_eve);
    }
}