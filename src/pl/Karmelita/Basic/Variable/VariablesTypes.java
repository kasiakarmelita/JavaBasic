package pl.Karmelita.Basic.Variable;

import java.math.BigDecimal;

public class VariablesTypes {
    byte byte1 = 1;
    short short1 = 1234;
    int int1 = 123456;
    long long1 = 123123444341L; //musi być L w deklaracji

    float float1 = 123.42314f; //musi być f w deklaracji, miejsca dzieiętne oddzielamy .
    double double1 = 1234.4115355436d;//musi być d w deklaracji, miejsca dzieiętne oddzielamy .
    BigDecimal bigDecimal; //klasa służąca do obliczeń finansowych -> typy proste mogą nie być wystarczjąco dokładne

    boolean myFalseValue = false;
    boolean myTrueValue = true;
    boolean myBooleanValue = myFalseValue && myTrueValue; // myBooleanValue będzie miała wartość 'false'

    char signValue = 'y'; //pojedyńczy znak
    char tab = '\t'; //znak specjalny tabulator \n nowa linia, \r powrót karetki

    String someText = "This is a simple text.";
}
