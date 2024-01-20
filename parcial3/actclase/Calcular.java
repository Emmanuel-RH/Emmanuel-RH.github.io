abstract class Operacion {
  abstract void calcular (int i, int j);
  public void imprimir (int i) {
	system.out.println(i);
  }
}

class Suma extends Operacion {
  void calcular (int i, int j) {
    imprimir(i+j);
  }
}

class Resta extends Operacion {
  void calcular (int i, int j) {
    imprimir(i-j);
  }
}

class Multiplicacion extends Operacion {
  void calcular (int i, int j) {
    imprimir(i*j);
  }
}

class Resto extends Operacion {
  void calcular (int i, int j) {
    imprimir(i % j);
  }
}