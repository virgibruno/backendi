package logger2;

public class Main {
    public static void main(String[] args) {
        Animal a1 = new Leon("Simba", 15, false);
        Animal a2 = new Tigre("nala", 15);
        Animal a3 = new Leon("mufasa", 20, true);

        a1.correr();
        a2.esMayourA10();
        a1.esMayourA10();
        a3.esMayourA10();
    }
}
