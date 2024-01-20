/*Con base en una taxonomía simple a partir de Animal, Ave, Mamífero, Reptil y Pez; realizar una taxonomía con los siguientes seres vivos:

Pingüino.
Halcón.
Delfín.
Vaca.
Murciélago.
León.
Iguana.
Tortuga.
Oso.
Gacela.
Guepardo.
Elefante.
Pez Beta.
Pez Payaso.
Pez Luna.
Pez Espada.
Tiburón.
Pez Globo.
Salmón.
Gato.
Perro.
Panda.
Serpiente.
Ballena.
Foca.
Toro.
Lobo.
Coyote.
Zorro.
Tlacuache.
Capibara.
Canguro.
Ornitorrinco.
Condor.
Tiburón.
Lagartija.
Conejo.
Dragón de Komodo.
Camaleón.
Avestruz.
Correcaminos.

Hay características transversales que comparten algunos animales aunque no son de la misma familia (interfaces):

Volador (método volar).
Nadador (método nadar).
Caminador (método caminar).
Carnívoro (método comerCarne).
Herbívoro (método comerHierba).
Omnívoro (método comerCarne y comerHierba).

No todas las aves vuelan, no todos los mamíferos son carnívoros y no todos los mamíferos viven en tierra, de modo que se requiere que haya una composición con las interfaces previas.
*/

//opulido@uv.com

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