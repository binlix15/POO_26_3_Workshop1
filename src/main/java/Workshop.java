import java.util.List;

public class Workshop {
    public static void main(String[] args) {

}

public int sumarDosNumeros(int a, int b) {
    return a + b;
}

public int mayorDeTresNumeros(int a, int b, int c) {
    if (a >= b && a >= c) {
        return a;
    } else if (b >= c) {
        return b;
    } else {
        return c;
    }
}

public int[] tablaDeMultiplicar(int numero, int limite) {
    int[] resultado = new int[limite];
    for (int i = 1; i <= limite; i++) {
        resultado[i - 1] = numero * i;
    }
    return resultado;
}

public int factorial(int n) {
    int resultado = 1;
    for (int i = 2; i <= n; i++) {
        resultado = resultado * i;
    }
    return resultado;
}

public boolean esPrimo(int numero) {
    if (numero < 2) {
        return false;
    }
    for (int i = 2; i * i <= numero; i++) {
        if (numero % i == 0) {
            return false;
        }
    }
    return true;
}

public int[] serieFibonacci(int n) {
    if (n < 0) {
        System.out.println("n no puede ser negativo");
        return new int[0];
    }
    int[] serie = new int[n];
    for (int i = 0; i < n; i++) {
        if (i == 0) {
            serie[i] = 0;
        } else if (i == 1) {
            serie[i] = 1;
        } else {
            serie[i] = serie[i - 1] + serie[i - 2];
        }
    }
    return serie;
}

public int sumaElementos(int[] arreglo) {
    int resultado = 0;
    for (int i = 0; i < arreglo.length; i++) {
        resultado = resultado + arreglo[i];
    }
    return resultado;
}

public double promedioElementos(int[] arreglo) {
    int suma = 0;
    for (int i = 0; i < arreglo.length; i++) {
        suma = suma + arreglo[i];
    }
    double promedio = suma / (double) arreglo.length;
    return promedio;
}

public int encontrarElementoMayor(int[] arreglo) {
    int mayor = arreglo[0];
    for (int i = 1; i < arreglo.length; i++) {
        if (arreglo[i] > mayor) {
            mayor = arreglo[i];
        }
    }
    return mayor;
}

public int encontrarElementoMenor(int[] arreglo) {
    int menor = arreglo[0];
    for (int i = 1; i < arreglo.length; i++) {
        if (arreglo[i] < menor) {
            menor = arreglo[i];
        }
    }
    return menor;
}

public boolean buscarElemento(int[] arreglo, int elemento) {
    for (int i = 0; i < arreglo.length; i++) {
        if (arreglo[i] == elemento) {
            return true;
        }
    }
    return false;
}

public int[] invertirArreglo(int[] arreglo) {
    int[] resultado = new int[arreglo.length];
    int j = arreglo.length - 1;
    for (int i = 0; i < arreglo.length; i++) {
        resultado[i] = arreglo[j];
        j = j - 1;
    }
    return resultado;
}

public int[] ordenarArreglo(int[] arreglo) {
    int[] resultado = new int[arreglo.length];
    for (int i = 0; i < arreglo.length; i++) {
        resultado[i] = arreglo[i];
    }
    for (int i = 0; i < resultado.length; i++) {
        for (int j = 0; j < resultado.length - 1 - i; j++) {
            if (resultado[j] > resultado[j + 1]) {
                int temp = resultado[j];
                resultado[j] = resultado[j + 1];
                resultado[j + 1] = temp;
            }
        }
    }
    return resultado;
}

    public int[] eliminarDuplicados(int[] arreglo) {
       int[]temp=new int[arreglo.length];
       int contador=0;
       for (int i=0;i<areglo.length;i++){
          boolean yaEsta=False;
          for (int j=0;j<contador;j++){
              if (temp[j]==arreglo[i]){
                 yaEsta=tre;
              }
           }
          if (!yaEsta){
             temp[contador]=arreglo[i];
             contador=contador+1;
           }
         }
        int[]resultado=new int[arreglo1.length+arreglo2.length];
        int pos=0;
        for (int i=0;i<arreflo2.length;i++){
            resultado[pos]=arreglo2[i];
            pos=pos+1;
        }
     return resultado;
    }

    public int[] combinarArreglos(int[] arreglo1, int[] arreglo2) {
        int[] resultado=new int[arreglo1.length+arreglo2.length];
        int pos=0;
        for (int i=0;i<arreglo1.length;i++){
            resultado[pos]=arreglo2[i];
            pos=pos+1;
         }
      return resultado;
    }

    public int[] rotarArreglo(int[] arreglo, int posiciones) {
           int n=arreglo.length;
           int[]resultado=new int[n];
           for (int i=0;i<n;i++){
               int nuevaPosicion=(i+posiciones)%n;
               resultado[nuevaPosicion]=arreglo[i];
           }
    return resultado;
    }

    public int contarCaracteres(String cadena) {
           return cadena.length();
    }

    public String invertirCadena(String cadena) {
           String resultado="";
           for (int i=cadena.length()-1;i>=0;i-){
           resultado=resultado+cadena.charAt(i);
           }
      return cadena.equals(invertida);
    }

     public boolean esPalindromo(String cadena) {
          String invertida="";
          for (int i=cadena.length()-1;i>=0;i-){
              invertida=invertida+cadena.charAt(i);
          }
      return cadena.equals(invertida);
    }

    public int contarPalabras(String cadena) {
           String[] partes=cadena.trim().split("");
           return partes.length;
    }

    public String convertirAMayusculas(String cadena) {
        return cadena.toUpperCase();
    }

    public String convertirAMinusculas(String cadena) {
        return cadena.toLowerCase();
    }

    // Método que reemplaza una subcadena en una cadena por otra subcadena
    public String reemplazarSubcadena(String cadena, String antiguaSubcadena, String nuevaSubcadena) {
        // TODO: Implementar el método para reemplazar una subcadena en una cadena por otra subcadena.
        // Ejemplo: Si cadena = "Hello Java", antiguaSubcadena = "Java", y nuevaSubcadena = "world", el resultado debería ser "Hello world".
        return "";
    }

    // Método que busca una subcadena en una cadena y retorna su índice
    public int buscarSubcadena(String cadena, String subcadena) {
        // TODO: Implementar el método para buscar una subcadena en una cadena y retornar su índice.
        // Ejemplo: Si cadena = "Hello world" y subcadena = "world", el resultado debería ser 6.
        return -1;
    }

    // Método que valida un correo electrónico
    public boolean validarCorreoElectronico(String correo) {
        // TODO: Implementar el método para validar un correo electrónico.
        // Ejemplo: Si correo = "test@example.com", el resultado debería ser true.
        return false;
    }

    // Método que calcula el promedio de una lista de números

    public double promedioLista(List<Integer> lista) {
        // TODO: Implementar el método para calcular el promedio de una lista de números.
        // Ejemplo: Si lista = [1, 2, 3, 4, 5], el resultado debería ser 3.0.
        return 0.0;
    }

    // Método que convierte un número en su representación binaria
    public String convertirABinario(int numero) {
        // TODO: Implementar el método para convertir un número en su representación binaria.
        // Ejemplo: Si numero = 10, el resultado debería ser "1010".
        return "";
    }

    // Método que convierte un número en su representación hexadecimal
    public String convertirAHexadecimal(int numero) {
        // TODO: Implementar el método para convertir un número en su representación hexadecimal.
        // Ejemplo: Si numero = 255, el resultado debería ser "FF".
        return "";
    }

    // Método para el juego de piedra, papel, tijera, lagarto, Spock
    public String jugarPiedraPapelTijeraLagartoSpock(String eleccionUsuario) {
        // TODO: Implementar el método para el juego de Piedra, Papel, Tijera, Lagarto, Spock.
        // Las reglas del juego son:
        // - Piedra vence a Tijera y Lagarto
        // - Papel vence a Piedra y Spock
        // - Tijera vence a Papel y Lagarto
        // - Lagarto vence a Spock y Papel
        // - Spock vence a Tijera y Piedra


        // El método debe retornar un mensaje indicando el resultado del juego.
        // Ejemplo: Si la eleccionUsuario es "Piedra", el resultado podría ser "Ganaste" o "Perdiste" dependiendo de la elección de la computadora.
        return "";
    }

    public String pptls2(String game[]) {
        //Retornar player ganador o empate
            /*
            Rock = R
            Paper = P
            Scissors = S
            Lizard = L
            Spock = V
        Scissors cuts Paper
Paper covers Rock
Rock crushes Lizard
Lizard poisons Spock
Spock smashes Scissors
Scissors decapitates Lizard
Lizard eats Paper
Paper disproves Spock
Spock vaporizes Rock
Rock crushes Scissors
         */
        return "";
    }

    public double areaCirculo(double radio) {
        return 0.0;
    }

    public String zoodiac(int day, int month) {
        return "";
    }


}

