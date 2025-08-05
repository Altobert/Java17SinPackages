package varsample;

public class VarKeyboard{
  //var tricky="Hello"; error por que aca no esta permitido usar var
  public void trickyMethod(){
    var tricky2 = "World";
    System.out.println(tricky2);
  }
  // No compila por que no se permite le keyboard var
  // en el lugar donde se declaran las variables de instancia.
}
