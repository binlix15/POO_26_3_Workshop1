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

public String jugarPiedraPapelTijeraLagartoSpock(String eleccionUsuario) {
    int numero = (int)(Math.random() * 5);
    String eleccionComputadora = "";
    if (numero == 0) {
        eleccionComputadora = "Piedra";
    } else if (numero == 1) {
        eleccionComputadora = "Papel";
    } else if (numero == 2) {
        eleccionComputadora = "Tijera";
    } else if (numero == 3) {
        eleccionComputadora = "Lagarto";
    } else {
        eleccionComputadora = "Spock";
    }

    if (eleccionUsuario.equals(eleccionComputadora)) {
        return "Empate. La computadora eligio " + eleccionComputadora;
    }

    boolean gano = false;
    if (eleccionUsuario.equals("Piedra") && (eleccionComputadora.equals("Tijera") || eleccionComputadora.equals("Lagarto"))) {
        gano = true;
    }
    if (eleccionUsuario.equals("Papel") && (eleccionComputadora.equals("Piedra") || eleccionComputadora.equals("Spock"))) {
        gano = true;
    }
    if (eleccionUsuario.equals("Tijera") && (eleccionComputadora.equals("Papel") || eleccionComputadora.equals("Lagarto"))) {
        gano = true;
    }
    if (eleccionUsuario.equals("Lagarto") && (eleccionComputadora.equals("Spock") || eleccionComputadora.equals("Papel"))) {
        gano = true;
    }
    if (eleccionUsuario.equals("Spock") && (eleccionComputadora.equals("Tijera") || eleccionComputadora.equals("Piedra"))) {
        gano = true;
    }

    if (gano) {
        return "Ganaste. La computadora eligio " + eleccionComputadora;
    } else {
        return "Perdiste. La computadora eligio " + eleccionComputadora;
    }
}

public String pptls2(String game[]) {
    String jugador1 = game[0];
    String jugador2 = game[1];

    if (jugador1.equals(jugador2)) {
        return "Empate";
    }

    boolean gana1 = false;
    if (jugador1.equals("Piedra") && (jugador2.equals("Tijera") || jugador2.equals("Lagarto"))) {
        gana1 = true;
    }
    if (jugador1.equals("Papel") && (jugador2.equals("Piedra") || jugador2.equals("Spock"))) {
        gana1 = true;
    }
    if (jugador1.equals("Tijera") && (jugador2.equals("Papel") || jugador2.equals("Lagarto"))) {
        gana1 = true;
    }
    if (jugador1.equals("Lagarto") && (jugador2.equals("Spock") || jugador2.equals("Papel"))) {
        gana1 = true;
    }
    if (jugador1.equals("Spock") && (jugador2.equals("Tijera") || jugador2.equals("Piedra"))) {
        gana1 = true;
    }

    if (gana1) {
        return "Jugador 1 gana";
    } else {
        return "Jugador 2 gana";
    }
}

    public double areaCirculo(double radio) {
            double area = 3.1416 * radio * radio;
          return area;
    }
public String zoodiac(int day, int month) {
    String signo = "";
    if ((month == 3 && day >= 21) || (month == 4 && day <= 19)) {
        signo = "Aries";
    } else if ((month == 4 && day >= 20) || (month == 5 && day <= 20)) {
        signo = "Tauro";
    } else if ((month == 5 && day >= 21) || (month == 6 && day <= 20)) {
        signo = "Geminis";
    } else if ((month == 6 && day >= 21) || (month == 7 && day <= 22)) {
        signo = "Cancer";
    } else if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) {
        signo = "Leo";
    } else if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) {
        signo = "Virgo";
    } else if ((month == 9 && day >= 23) || (month == 10 && day <= 22)) {
        signo = "Libra";
    } else if ((month == 10 && day >= 23) || (month == 11 && day <= 21)) {
        signo = "Escorpio";
    } else if ((month == 11 && day >= 22) || (month == 12 && day <= 21)) {
        signo = "Sagitario";
    } else if ((month == 12 && day >= 22) || (month == 1 && day <= 19)) {
        signo = "Capricornio";
    } else if ((month == 1 && day >= 20) || (month == 2 && day <= 18)) {
        signo = "Acuario";
    } else {
        signo = "Piscis";
    }
    return signo;
}