package pl.Karmelita.Basic.Variable;

public class FinalVariables {
    private void finaVariableSample() {
        final int finalVariable = 123;   // deklaracja i inicjalizacja zmiennej finalnej typu prostego
        final long anotherFinalVariable;
        // finalVariable = 12;             // próba zmiany wartości zmiennej finalnej kończy się błędem kompilacji
        anotherFinalVariable = 12345L;  // poprawnie - inicjalizacja zmiennej finalnej
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(final String name) { //oznaczenie zmiennej finalnej typu Obiekt
        this.name = name;
    }


}

