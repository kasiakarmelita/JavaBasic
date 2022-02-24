package pl.Karmelita.Basic.Variable;

public class main {
    public static void main(String[] args) {
        ExampleClass exampleClass = new ExampleClass();
        exampleClass.someMethod();

        final FinalVariables finalVariables = new FinalVariables();
        finalVariables.setName("Kasia"); // mogę zmienić stan wewnętrzny obiektu
        // finalVariables = new FinalVariables(); // błąd kompilacji, nie mogę zmienić wartości referencji
    }
}
