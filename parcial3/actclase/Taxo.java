class Taxo {
    public static void main(String[]args) {

    interface Carnivoro {
      public void comerCarne();
      }
      
    interface Herbivoro {
      public void comerHierba();
      }
      
    interface Omnivoro extends Carnivoro, Herbivoro {

      }
      
    interface Volador {
      public void volar();
      }

    interface Caminante {
      public void caminar();
      }

    interface Nadador {
      public void nadar();
    }  

    interface Corredor {
      public void correr();
    }  
 
      abstract class Animal {}
      abstract class Ave extends Animal {}
      abstract class Mamifero extends Animal {}
      abstract class Oviparo extends Animal {}
      abstract class Reptil extends Animal {}
      abstract class Felino extends Animal {}

    class Pinguino extends Ave implements Carnivoro, Nadador, Caminante {
      public void comerCarne() {}
      public void nadar() {}
      public void caminar() {}
    }

    class Halcon extends Ave implements Volador, Carnivoro {
      public void volar() {}
      public void comerCarne() {}
    }

    class Delfin extends Mamifero implements Carnivoro, Nadador{
      public void comerCarne() {}
      public void nadar() {}
    }

    class Vaca extends Mamifero implements Herbivoro, Caminante{ 
      public void comerHierba() {}
      public void caminar() {}
    }

      class Murcielago extends Mamifero implements Volador, Herbivoro {
      public void volar() {}
      public void comerHierba() {}
    }

    class Leon extends Felino implements Carnivoro, Caminante{
       public void comerCarne () {}
       public void caminar () {}
    }

    class Iguana extends Reptil implements Herbivoro, Caminante{
        public void comerHierba () {}
        public void caminar () {}
    }

      
    class Tortuga extends Reptil implements Caminante, Omnivoro{
      public void comerHierba() {}
      public void comerCarne() {}
      public void caminar () {}
    }
    class Oso extends Mamifero implements Omnivoro, Caminante {
      public void comerHierba() {}
      public void comerCarne() {}
      public void caminar () {}
    }

    class Gacela extends Mamifero implements Herbivoro, Caminante {
      public void comerHierba() {}
      public void caminar() {}
  }
  
    class Guepardo extends Felino implements Carnivoro, Caminante {
      public void comerCarne() {}
      public void caminar() {}
  }
  
    class Elefante extends Mamifero implements Herbivoro, Caminante {
      public void comerHierba() {}
      public void caminar() {}
  }
  
    class PezBeta extends Oviparo implements Nadador {
      public void nadar() {}
  }
  
    class PezPayaso extends Oviparo implements Nadador {
      public void nadar() {}
  }
  
    class PezLuna extends Oviparo implements Nadador {
      public void nadar() {}
  }
  
    class PezEspada extends Oviparo implements Nadador {
      public void nadar() {}
  }
  
    class Tiburon extends PezEspada implements Carnivoro {
      public void comerCarne() {}
  }
  
    class PezGlobo extends Oviparo implements Nadador {
      public void nadar() {}
  }
  
    class Salmon extends Oviparo implements Nadador {
      public void nadar() {}
  }
  
    class Gato extends Felino implements Carnivoro, Caminante {
      public void comerCarne() {}
      public void caminar() {}
  }
  
    class Perro extends Mamifero implements Carnivoro, Caminante {
      public void comerCarne() {}
      public void caminar() {}
  }
  
    class Panda extends Mamifero implements Herbivoro, Caminante {
      public void comerHierba() {}
      public void caminar() {}
  }
  
    class Serpiente extends Reptil implements Carnivoro, Caminante {
      public void comerCarne() {}
      public void caminar() {}
  }
  
    class Ballena extends Mamifero implements Carnivoro, Nadador {
      public void comerCarne() {}
      public void nadar() {}
  }
  
    class Foca extends Mamifero implements Carnivoro, Nadador {
      public void comerCarne() {}
      public void nadar() {}
  }
  
    class Toro extends Mamifero implements Herbivoro, Caminante {
      public void comerHierba() {}
      public void caminar() {}
  }
  
    class Lobo extends Mamifero implements Carnivoro, Caminante {
      public void comerCarne() {}
      public void caminar() {}
  }
  
    class Coyote extends Lobo {
      //Solo escribo el extensor de Lobo porque el Coyote es un subtipo de este.
  }
  
    class Zorro extends Mamifero implements Carnivoro, Caminante {
      public void comerCarne() {}
      public void caminar() {}
  }
  
    class Tlacuache extends Mamifero implements Omnivoro, Caminante {
      public void comerHierba() {}
      public void comerCarne() {}
      public void caminar() {}
  }
  
    class Capibara extends Mamifero implements Herbivoro, Nadador {
      public void comerHierba() {}
      public void nadar() {}
  }
  
    class Canguro extends Mamifero implements Herbivoro, Saltador {
      public void comerHierba() {}
      public void saltar() {}
  }
  
    class Ornitorrinco extends Mamifero implements Oviparo, Nadador {
      public void nadar() {}
  }
  
    class Condor extends Ave implements Volador, Carnivoro {
      public void volar() {}
      public void comerCarne() {}
  }
  
    class Lagartija extends Reptil implements Herbivoro, Caminante {
      public void comerHierba() {}
      public void caminar() {}
  }
  
    class Conejo extends Mamifero implements Herbivoro, Caminante {
      public void comerHierba() {}
      public void caminar() {}
  }
  
    class DragonDeKomodo extends Reptil implements Carnivoro, Caminante {
      public void comerCarne() {}
      public void caminar() {}
  }
  
    class Camaleon extends Reptil implements Insectivoro, Caminante {
      public void comerInsectos() {}
      public void caminar() {}
  }
  
    class Avestruz extends Ave implements Omnivoro, Corredor {
      public void comerCarne() {}
      public void comerHierba() {}
      public void correr() {}
  }
  
    class Correcaminos extends Ave implements Carnivoro, Corredor {
      public void comerCarne() {}
      public void correr() {}
  }
  
  
    

   }
}
