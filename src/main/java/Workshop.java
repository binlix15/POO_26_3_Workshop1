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
    int[] temp = new int[arreglo.length];
    int contador = 0;
    for (int i = 0; i < arreglo.length; i++) {
        boolean yaEsta = false;
        for (int j = 0; j < contador; j++) {
            if (temp[j] == arreglo[i]) {
                yaEsta = true;
            }
        }
        if (!yaEsta) {
            temp[contador] = arreglo[i];
            contador = contador + 1;
        }
    }
    int[] resultado = new int[contador];
    for (int i = 0; i < contador; i++) {
        resultado[i] = temp[i];
    }
    return resultado;
}

public int[] combinarArreglos(int[] arreglo1, int[] arreglo2) {
    int[] resultado = new int[arreglo1.length + arreglo2.length];
    int pos = 0;
    for (int i = 0; i < arreglo1.length; i++) {
        resultado[pos] = arreglo1[i];
        pos = pos + 1;
    }
    for (int i = 0; i < arreglo2.length; i++) {
        resultado[pos] = arreglo2[i];
        pos = pos + 1;
    }
    return resultado;
}

public int[] rotarArreglo(int[] arreglo, int posiciones) {
    int n = arreglo.length;
    int[] resultado = new int[n];
    for (int i = 0; i < n; i++) {
        int nuevaPosicion = (i + posiciones) % n;
        resultado[nuevaPosicion] = arreglo[i];
    }
    return resultado;
}

public int contarCaracteres(String cadena) {
    return cadena.length();
}

public String invertirCadena(String cadena) {
    String resultado = "";
    for (int i = cadena.length() - 1; i >= 0; i--) {
        resultado = resultado + cadena.charAt(i);
    }
    return resultado;
}

public boolean esPalindromo(String cadena) {
    String invertida = "";
    for (int i = cadena.length() - 1; i >= 0; i--) {
        invertida = invertida + cadena.charAt(i);
    }
    return cadena.equals(invertida);
}

public int contarPalabras(String cadena) {
    String[] partes = cadena.trim().split("\\s+");
    return partes.length;
}

public String convertirAMayusculas(String cadena) {
    return cadena.toUpperCase();
}

public String convertirAMinusculas(String cadena) {
    return cadena.toLowerCase();
}

public String reemplazarSubcadena(String cadena, String antiguaSubcadena, String nuevaSubcadena) {
    int indice = cadena.indexOf(antiguaSubcadena);
    if (indice == -1) {
        return cadena;
    }
    String antes = cadena.substring(0, indice);
    String despues = cadena.substring(indice + antiguaSubcadena.length());
    return antes + nuevaSubcadena + despues;
}

public int buscarSubcadena(String cadena, String subcadena) {
    int i = 0;
    while (i <= cadena.length() - subcadena.length()) {
        if (cadena.substring(i, i + subcadena.length()).equals(subcadena)) {
            return i;
        }
        i = i + 1;
    }
    return -1;
}

public boolean validarCorreoElectronico(String correo) {
    int posArroba = -1;
    int posPunto = -1;
    int i = 0;
    while (i < correo.length()) {
        if (correo.charAt(i) == '@') {
            posArroba = i;
        }
        i = i + 1;
    }
    if (posArroba == -1) {
        return false;
    }
    i = posArroba;
    while (i < correo.length()) {
        if (correo.charAt(i) == '.') {
            posPunto = i;
        }
        i = i + 1;
    }
    if (posPunto == -1 || posPunto < posArroba) {
        return false;
    }
    return true;
}

public double promedioLista(List<Integer> lista) {
    int suma = 0;
    int i = 0;
    while (i < lista.size()) {
        suma = suma + lista.get(i);
        i = i + 1;
    }
    return suma / (double) lista.size();
}

public String convertirABinario(int numero) {
    if (numero == 0) {
        return "0";
    }
    String resultado = "";
    int n = numero;
    while (n > 0) {
        int residuo = n % 2;
        resultado = residuo + resultado;
        n = n / 2;
    }
    return resultado;
}

public String convertirAHexadecimal(int numero) {
    if (numero == 0) {
        return "0";
    }
    String digitos = "0123456789ABCDEF";
    String resultado = "";
    int n = numero;
    while (n > 0) {
        int residuo = n % 16;
        resultado = digitos.charAt(residuo) + resultado;
        n = n / 16;
    }
    return resultado;
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

