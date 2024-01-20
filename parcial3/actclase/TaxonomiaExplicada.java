/*
Las interfaces se pueden refinar para complementar un contrato. Si un omnívoro tiene el comportamiento de un carnívoro y un herbívoro, entonces es posible "reunir" su comportamiento con un "extends"

NOTA: el refinamiento de interfaces NO ES HERENCIA.

Clase abstracta es algo que no se conoce con certeza, se utiliza para definir un comportamiento común y general. No se pueden crear objetos.

Clase concreta es algo que ya se sabe qué es, cómo funciona y cuándo utilizarlo. Se pueden crear objetos.
*/

interface Carnivoro {
  public void comerCarne();
}

interface Herbivoro {
  public void comerHierba();
}

interface Omnivoro extends Carnivoro, Herbivoro {}


class Oso extends Mamifero implements Omnivoro {
  public void comerHierba() {}
  public void comerCarne() {}
}

abstract class Animal {}
abstract class Ave extends Animal {}
abstract class Mamifero extends Animal {}

interface Volador {
  public void volar();
}

class Murcielago extends Mamifero implements Volador, Herbivoro {
  public void volar() {
    System.out.println("El murciélago vuela");
  }
  public void comerHierba() {}
  public void comerCarne() {}
}

class Halcon extends Ave implements Volador, Carnivoro {
  public void volar() {
    System.out.println("El halcón vuela");
  }
  public void comerHierba() {}
  public void comerCarne() {}
}

public class TaxonomiaExplicada {
  public static void main(String[]args) {
    Murcielago m = new Murcielago();
    Volador v = new Murcielago();
    Halcon h = new Halcon();
    v = h;
  }
}