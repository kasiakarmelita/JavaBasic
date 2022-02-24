package pl.Karmelita.Basic.Variable;

public class ExampleClass {
    private int myGlobal = 12; //deklaracja zmiennej globalnej na poziomie klasy
    void someMethod() {
        // tutaj można użyć zmiennej myGlobal
        System.out.println("My global variable: " + myGlobal);
        int myLocalVariable = 5; //deklaracja zmiennej lokalnej w metodzie
        System.out.println("My local variable: " + myLocalVariable);
    }
}
