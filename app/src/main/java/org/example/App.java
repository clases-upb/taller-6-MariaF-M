/*
 * This source file was generated by the Gradle 'init' task
 */
package org.example;

import org.checkerframework.checker.units.qual.N;
import org.checkerframework.checker.units.qual.t;

import com.google.common.base.Strings;
import com.google.common.util.concurrent.ExecutionError;

import java.util.Arrays;
import java.io.*;
import java.util.Scanner;
import java.util.Collections;

public class App {

    // Punto 1: Atributos estáticos globales públicos
    public static int[] v_nros;
    public static String[] v_str;
    public static boolean hacia_adelante = true, ascendente = true;;
    public static int alea;

    // Punto 4: Atributos estáticos globales públicos
    public static int[] v_elementos;
    public static int tam_v;

    // Punto 6 - punto 7 - punto 9: Atributos estáticos globales públicos
    public static int tam_m;

    // Punto 7 - punto 8: Atributos globales públicos
    public static int[][] matriz;

    public static void main(String[] args) {
        try {

            Punto_1();
            Punto_2();
            Punto_3();
            Punto_4();
            Punto_5();
            Punto_6();
            Punto_7();
            Punto_8();
            Punto_9();

        } catch (Exception e) {
            System.out.println("Ocurrió un error: " + e);
        }
    }

    /*
     * 1. Implemente un programa en java donde inserte elementos en dos vectores
     * globales de tamaños aleatorios y de contenido aleatorio (uno numérico y otro
     * de Strings). Considere dejar espacios libres en los vectores.
     * 
     * Desde un menú en el programa principal debe considerar cada opción para
     * llamar las siguientes funciones que también debe programar:
     * 
     * a. Recorrer secuencialmente (recibe un true cuando va del primero al último y
     * un false cuando va del último al primero)
     * • De primer elemento a último elemento: Imprime desde el primer elemento
     * hasta el último del vector dado en el parámetro de entrada.
     * • De último elemento al primer elemento: Imprime desde el último elemento
     * hasta el primero del vector dado en el parámetro de entrada.
     * 
     * b. Actualizar: recibe la posición que va a actualizar y el elemento. Al final
     * imprime el vector actualizado.
     * 
     * c. Añadir: después del último: recibe el elemento que va a añadir. Al final
     * imprime el vector actualizado.
     * 
     * d. Borrar: Recibe la posición donde del elemento que va a borrar.
     * 
     * e. Ordenar el vector:
     * • Ascendentemente.
     * • Descendentemente.
     * 
     * f. Búsqueda: Recibe como parámetro el elemento a buscar y devuelve un String
     * separado por el carácter '-', mostrando las posiciones donde se encuentra el
     * elemento.
     */

    public static void Punto_1() throws Exception {
        try {

            System.out.println("\n\nPunto 1:\n");

            // Crear variables
            String opcion, opcion_a, opcion_b, opcion_d, opcion_e, opcion_f;
            Scanner teclado = new Scanner(System.in);

            Crear_vectores();
            System.out.println(Arrays.toString(v_nros) + "\n");
            System.out.println(Arrays.toString(v_str));

            // Crear menú
            do {

                System.out.println("Ingrese la opcion del menú, digite S para salir");
                System.out.println("a. Recorrer secuencialmente");
                System.out.println("b. Actualizar");
                System.out.println("c. Añadir");
                System.out.println("d. Borrar");
                System.out.println("e. Ordenar el vector");
                System.out.println("f. Búsqueda");
                System.out.println("S. Salir");
                opcion = teclado.next();

                switch (opcion.charAt(0)) {
                    case 'a':

                        System.out.println("Lo quiere imprimir hacia adelante o hacia atras");
                        System.out.println("1. Adelante: ");
                        System.out.println("2. Atras: ");
                        opcion_a = teclado.next();

                        switch (opcion_a) {
                            case "1":
                                hacia_adelante = true;
                                break;
                            default:
                                hacia_adelante = false;
                                break;
                        }
                        System.out.println(Recorrer_secuencialmente(hacia_adelante));
                        break;

                    case 'b':

                        System.out.println("Que posición quiere actualizar: ");
                        opcion_b = teclado.next();
                        Actualizar(Integer.parseInt(opcion_b));
                        break;

                    case 'c':
                        Añadir();
                        break;

                    case 'd':

                        System.out.println("Que posición quiere borrar: ");
                        opcion_d = teclado.next();
                        Borrar(Integer.parseInt(opcion_d));
                        break;

                    case 'e':

                        System.out.println("Lo quiere ordenar ascendentemente o descendentemente: ");
                        System.out.println("1. Ascendentemente");
                        System.out.println("2. Descendentemente:");
                        opcion_e = teclado.next();

                        switch (opcion_e) {
                            case "1":
                                ascendente = true;
                                break;
                            default:
                                ascendente = false;
                                break;
                        }
                        System.out.println(Ordenar(ascendente));
                        break;

                    case 'f':
                        System.out.println("Ingrese el elemento a buscar (en vector numérico): ");
                        opcion_f = teclado.next();
                        System.out.println(Buscar(Integer.parseInt(opcion_f)));
                        break;

                    case 'S':
                        System.out.println("Finaliza");
                }
            }

            while (opcion.toUpperCase().charAt(0) != 'S');

        } catch (

        Exception e) {
            System.out.println("Ocurrió un error en el Punto_1: " + e);
        }
    }

    public static void Crear_vectores() throws Exception {
        try {

            alea = (int) (Math.random() * (5 - 1 + 1) + 1);

            v_nros = new int[alea];
            v_str = new String[alea];

            int alea_nro = 0, alea_str;

            for (int pos = 0; pos < v_nros.length; pos++) {
                alea_nro = (int) (Math.random() * 10);
                v_nros[pos] = alea_nro;
            }

            for (int pos = 0; pos < v_str.length; pos++) {
                alea_str = (int) (Math.random() * (9 - 0 + 1) + 0);

                if (alea_str == 0) {
                    v_str[pos] = "";
                } else {
                    v_str[pos] = Integer.toString(alea_str);
                }
            }

        } catch (Exception e) {
            throw new Exception("Ocurrió un error en Crear_vectores " + e);
        }
    }

    public static String Recorrer_secuencialmente(boolean adelante) throws Exception {
        try {

            String texto = "";

            // Devolver texto hacia adelante
            if (adelante == true) {

                texto += "Texto hacia adelante: \n";

                // Vector números
                texto += "- Vector números: \n ";
                for (int pos = 0; pos < v_nros.length; pos++) {
                    texto += v_nros[pos] + " ";
                }

                // Vector strings
                texto += "\n- Vector strings: \n ";
                for (int pos = 0; pos < v_str.length; pos++) {
                    texto += v_str[pos] + " ";
                }

                // Devolver texto hacia atras
            } else {
                texto += "Texto hacia atras: \n";

                // Vector números
                texto += "- Vector números: \n ";
                for (int pos = v_nros.length - 1; pos >= 0; pos--) {
                    texto += v_nros[pos] + " ";
                }

                // Vector strings
                texto += "\n- Vector strings: \n ";
                for (int pos = v_str.length - 1; pos >= 0; pos--) {
                    texto += v_str[pos] + " ";
                }
            }
            return texto;
        } catch (Exception e) {
            throw new Exception("Ocurrió un error en Recorrer_secuencialmente " + e);
        }
    }

    public static void Actualizar(int posicion) throws Exception {
        try {

            int alea_nro = (int) (Math.random() * 10);
            int alea_str = (int) (Math.random() * (9 - 0 + 1) + 0);

            v_nros[posicion - 1] = alea_nro;

            if (alea_str == 0) {
                v_str[posicion - 1] = "";
            } else {
                v_str[posicion - 1] = Integer.toString(alea_str);
            }

        } catch (Exception e) {
            throw new Exception("Ocurrió un error en Actualizar " + e);
        }
    }

    public static void Añadir() throws Exception {
        try {

            alea += 1;
            int[] l_nros = new int[alea];
            String[] l_str = new String[alea];

            for (int pos = 0; pos < v_nros.length; pos++) {
                l_nros[pos] = v_nros[pos];
            }

            for (int pos = 0; pos < v_str.length; pos++) {
                l_str[pos] = v_str[pos];
            }

            int alea_nro = (int) (Math.random() * 10);
            int alea_str = (int) (Math.random() * (9 - 0 + 1) + 0);

            l_nros[alea - 1] = alea_nro;

            if (alea_str == 0) {
                l_str[alea - 1] = "";
            } else {
                l_str[alea - 1] = Integer.toString(alea_str);
            }

            v_nros = l_nros;
            v_str = l_str;

            System.out.println("\nVector números: " + Arrays.toString(v_nros));
            System.out.println("\nVector string: " + Arrays.toString(v_str));
        } catch (Exception e) {
            throw new Exception("Ocurrió un error en Añadir " + e);
        }
    }

    public static void Borrar(int posicion) throws Exception {
        try {

            v_nros[posicion - 1] = 0;
            v_str[posicion - 1] = "";

        } catch (Exception e) {
            throw new Exception("Ocurrió un error en Borrar " + e);
        }
    }

    public static String Ordenar(boolean asc) throws Exception {
        try {

            String texto = "";

            // Devolver texto ascendente
            if (asc) {

                texto += "Texto ascendente: \n";

                Arrays.sort(v_nros);
                Arrays.sort(v_str);

                // Vector números
                texto += "- Vector números: \n ";
                for (int pos = 0; pos < v_nros.length; pos++) {
                    texto += v_nros[pos] + " ";
                }

                // Vector strings
                texto += "\n- Vector strings: \n ";
                for (int pos = 0; pos < v_str.length; pos++) {
                    texto += v_str[pos] + " ";
                }

            } else {

                // Devolver texto descendente
                texto += "Texto descendente: \n";

                // Vector números
                texto += "- Vector números: \n ";
                for (int pos = v_nros.length - 1; pos >= 0; pos--) {
                    texto += v_nros[pos] + " ";
                }

                // Vector strings
                texto += "\n- Vector strings: \n ";
                for (int pos = v_str.length - 1; pos >= 0; pos--) {
                    texto += v_str[pos] + " ";
                }
            }
            return texto;
        } catch (Exception e) {
            throw new Exception("Ocurrió un error en Ordenar " + e);
        }
    }

    public static String Buscar(int valor) throws Exception {
        try {
            String texto = "";
            boolean encontrado = false;
    
            texto += "Buscando el valor " + valor + " en el vector de números: \n";
    
            // Búsqueda en el vector de números (v_nros)
            for (int pos = 0; pos < v_nros.length; pos++) {
                if (v_nros[pos] == valor) {
                    texto += "Encontrado en el vector de números en la posición: " + (pos + 1) + "\n";
                    encontrado = true;
                }
            }
    
            texto += "Buscando el valor " + valor + " en el vector de strings: \n";
    
            // Búsqueda en el vector de strings (v_str)
            String valorStr = Integer.toString(valor);
            for (int pos = 0; pos < v_str.length; pos++) {
                if (v_str[pos].equals(valorStr)) {
                    texto += "Encontrado en el vector de strings en la posición: " + (pos + 1) + "\n";
                    encontrado = true;
                }
            }
    
            if (!encontrado) {
                texto += "No se encontró el valor en ninguno de los vectores.\n";
            }
    
            return texto;
        } catch (Exception e) {
            throw new Exception("Ocurrió un error en la búsqueda: " + e);
        }
    }

    /*
     * 2. Escriba un algoritmo que calcule aleatoriamente N temperaturas, las lleve
     * a un vector y luego calcule su media, cuántas temperaturas están por encima
     * de la media y cuántas por debajo.
     */

    public static void Punto_2() throws Exception {
        try {
            System.out.println("\n\nPunto 2:\n");
            System.out.println(Calcular_Temperatura(10));
        } catch (Exception e) {
            System.out.println("Ocurrió un error en el Punto_2: " + e);
        }
    }

    public static String Calcular_Temperatura(int N) throws Exception {

        try {

            // Asegurar que N sea mayor que 0

            if (N <= 0) {
                return "N tiene que ser mayor que 0";
            }

            // Definir variables y array
            int t_alea, max = 100, min = -100, suma = 0, c_superior = 0, c_inferiror = 0;
            double media;
            int[] v_temperaturas = new int[N];
            String texto = "";

            // Ciclo aleatorios de temperaturas entre (-50° y 50°)
            for (int p_tem = 0; p_tem < N; p_tem++) {
                t_alea = (int) (Math.random() * (max - min + 1) + min);
                v_temperaturas[p_tem] = t_alea;
                suma += v_temperaturas[p_tem];
            }

            // Calcular la media
            media = (double) suma / N;

            // Retornar temperaturas que superan la media y las que no
            for (int p_tem = 0; p_tem < N; p_tem++) {

                if (v_temperaturas[p_tem] < media) {
                    c_inferiror++;
                } else if (v_temperaturas[p_tem] > media) {
                    c_superior++;
                }
            }
            texto = "Temperaturas: " + Arrays.toString(v_temperaturas) + "\n" + "Media: " + media + "\n"
                    + "Temperaturas que seperan la media: " + c_superior + "\n"
                    + "Temperaturas que no seperan la media: " + c_inferiror;
            return texto;
        } catch (Exception e) {
            throw new Exception("Ocurrió un error en Calcular_Temperatura " + e);
        }
    }

    /*
     * 3. Cargue un vector a partir de un archivo de palabras, con mínimo 10
     * palabras. Ordene el vector de manera ascendente y luego de forma descendente.
     * 
     * Escriba el vector inicial sin ordenar, los vectores ordenados.
     */

    public static void Punto_3() throws Exception {
        try {
            System.out.println("\n\nPunto 3:\n");
            System.out.println(Ordenar_palabras());
        } catch (Exception e) {
            System.out.println("Ocurrió un error en el Punto_3: " + e);
        }
    }

    public static String Ordenar_palabras() throws Exception {
        try {

            // Abrir archivo
            BufferedReader bu_pal = new BufferedReader(new FileReader(
                    "taller-6-MariaF-M-main\\taller-6-MariaF-M-main\\app\\src\\resources\\Palabras.txt"));

            // Definir variables
            int contador = 0;
            String linea = bu_pal.readLine();
            String resultado = "";

            // Verificar contenido del archivo
            if (linea == null) {
                bu_pal.close();
                return "El archivo está vacío";
            } else {
                while (linea != null) {
                    contador++;
                    linea = bu_pal.readLine();
                }
                bu_pal.close();
            }

            // Verificar 10 palabras mínimo
            if (contador < 10) {
                return "El archivo debe de tener más de 10 palabras";
            }

            // Reabrir el archivo para leer las palabras en el arreglo
            String[] v_palabras = new String[contador];
            BufferedReader bu_pal2 = new BufferedReader(new FileReader(
                    "taller-6-MariaF-M-main\\taller-6-MariaF-M-main\\app\\src\\resources\\Palabras.txt"));
            for (int pos = 0; pos < v_palabras.length; pos++) {
                v_palabras[pos] = bu_pal2.readLine();
            }
            bu_pal2.close();

            resultado += "- El vector inicial es: " + Arrays.toString(v_palabras);

            Arrays.sort(v_palabras);
            String[] v2_palabras = Arrays.copyOf(v_palabras, v_palabras.length);

            // Mostrar el vector de forma ascendente
            resultado += "\n- Vector de forma ascendente: " + Arrays.toString(v_palabras);

            // Mostrar el vector de forma descendete
            resultado += " \n- Vector de forma descendete: ";
            int pos2 = v2_palabras.length - 1;
            for (int pos = 0; pos <= pos2; pos++) {

                v_palabras[pos] = v2_palabras[pos2 - pos];
            }
            resultado += Arrays.toString(v_palabras);

            return resultado;
        } catch (Exception e) {
            throw new Exception("Ocurrió un error en Ordenar_palabras " + e);
        }
    }

    /*
     * 4. Escriba un algoritmo que cree un vector de N elementos (el N es dado por
     * el usuario) de números short aleatorios positivos mayores que cero, y luego
     * le pregunte al usuario qué posición quiere eliminar. Luego por un menú
     * presente las opciones: Dejar la casilla en 0 o desplazar los elementos de
     * manera que el cero quede en la última posición del vector. Después de la
     * operación mostrará el vector cómo va quedando y volverá a preguntar qué
     * posición quiere borrar y mostrará nuevamente el menú. En el menú aparecerá la
     * opción para terminar el programa.
     */

    public static void Punto_4() throws Exception {
        try {

            System.out.println("\n\nPunto 4:\n");

            String opcion = "";

            System.out.println("Ingrese el número de elementos que quiere en el vector: ");
            Scanner teclado = new Scanner(System.in);
            tam_v = teclado.nextInt();

            // Retornar Crear_vector
            System.out.println(Crear_vector());

            do {

                // Posición a eliminar
                System.out.println("Digíte la posición que quiere eliminar: ");
                int pos_eliminar = teclado.nextInt();
                System.out.println();

                if (pos_eliminar > tam_v || pos_eliminar <= 0) {
                    System.out.println("La posición a elminar esta fuera del rango del vector");
                    return;
                } else {

                    // Menú
                    System.out.println("Ingrese la opcion del menú, digite S para salir");
                    System.out.println("1. Dejar la casilla en 0");
                    System.out.println(
                            "2. Desplazar los elementos de manera que el cero quede en la última posición del vector");
                    System.out.println("S. Salir");

                    opcion = teclado.next();

                    // Switch
                    switch (opcion.charAt(0)) {
                        case '1':
                            Eliminar_posicion_0(pos_eliminar);
                            System.out.println(Arrays.toString(v_elementos));
                            break;

                        case '2':
                            Eliminar_posicion_mover(pos_eliminar);
                            System.out.println(Arrays.toString(v_elementos));
                            break;

                        case 'S':
                            System.out.println("Finaliza");
                    }
                }
            } while (opcion.toUpperCase().charAt(0) != 'S');

        } catch (Exception e) {
            System.out.println("Ocurrió un error en el Punto_4: " + e);
        }
    }

    public static String Crear_vector() throws Exception {
        try {

            if (tam_v <= 0) {
                return "El número de elementos dentro del vector tiene que ser un valor entero mayor que 0";
            }

            // Definir variables y array
            int max = 100, min = 1;
            short n_alea;
            String texto = "";
            v_elementos = new int[tam_v];

            // Asignarle los números aleatorios
            for (int pos = 0; pos < tam_v; pos++) {
                n_alea = (short) (Math.random() * (max - min + 1) + min);
                v_elementos[pos] = n_alea;
            }

            // Retorna el vector
            return Arrays.toString(v_elementos);

        } catch (Exception e) {
            throw new Exception("Ocurrió un error en Crear_vector " + e);
        }
    }

    public static void Eliminar_posicion_0(int pos_eliminar) throws Exception {

        try {
            v_elementos[pos_eliminar - 1] = 0;
        } catch (Exception e) {
            throw new Exception("Ocurrió un error en Eliminar_posicion " + e);
        }
    }

    public static void Eliminar_posicion_mover(int pos_eliminar) throws Exception {

        try {
            int pos;

            for (pos = pos_eliminar; pos < v_elementos.length; pos++) {
                v_elementos[pos - 1] = v_elementos[pos];
            }
            v_elementos[pos - 1] = 0;

        } catch (Exception e) {
            throw new Exception("Ocurrió un error en Eliminar_posicion " + e);
        }
    }

    /*
     * 5. Escriba un algoritmo para convertir un número decimal en un número
     * hexadecimal, apoyado en vectores.
     */

    private static void Punto_5() throws Exception {
        try {
            System.out.println("\n\nPunto 5:\n");
            System.out.println(Convertir_a_hexadecimal(7945));

        } catch (Exception e) {
            System.out.println("Ocurrió un error en el Punto_5: " + e);
        }
    }

    public static String Convertir_a_hexadecimal(int nro) throws Exception {
        try {
            // Definir variables
            int division = nro, contador = 0;
            String texto = "";
            final byte divisor = 16;

            // Obtener tamaño arreglo
            do {
                division = division / divisor;
                contador++;

            } while (division > divisor);

            // Definir array
            int[] v_residuos = new int[contador + 1];
            division = nro;

            // Llenar el vector con el residuo
            for (int pos = 0; pos <= contador; pos++) {

                v_residuos[pos] = division % divisor;
                division = division / divisor;
            }

            // Recorrer el archivo y cambiar a hexadecimal
            for (int pos = v_residuos.length - 1; pos >= 0; pos--) {

                switch (v_residuos[pos]) {
                    case 10:
                        texto += "A";
                        break;
                    case 11:
                        texto += "B";
                        break;
                    case 12:
                        texto += "C";
                        break;
                    case 13:
                        texto += "D";
                        break;
                    case 14:
                        texto += "E";
                        break;
                    case 15:
                        texto += "F";
                        break;

                    default:
                        texto += v_residuos[pos] + "";
                        break;
                }
            }
            texto = "Número deciamal: " + nro + "\nNúmero hexadecimal: " + texto;
            return texto;

        } catch (Exception e) {
            throw new Exception("Ocurrió un error en Convertir_a_hexadecimal " + e);
        }
    }

    /*
     * 6. Escriba un algoritmo que solicite al usuario el orden de una matriz
     * cuadrática, implemente su matriz transpuesta (investiga qué es) y la imprima.
     */

    private static void Punto_6() {

        try {

            System.out.println("\n\nPunto 6:\n");

            // Preguntar al usuario
            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingrese un valor para definir el orden de la matriz: ");
            tam_m = teclado.nextInt();

            if (tam_m <= 0) {
                System.out.println(
                        "El número de elementos dentro de la matriz tiene que ser un valor entero mayor que 0");
            } else {
                System.out.println(Crear_matriz_cudratica());
            }

        } catch (Exception e) {
            System.out.println("Ocurrió un error en el Punto_6: " + e);
        }
    }

    public static String Crear_matriz_cudratica() throws Exception {
        try {

            // Definir variables y arrays
            int nro_alea;
            String resultado = "";
            int[][] m_cuadratica = new int[tam_m][tam_m];
            int[][] m_transpuesta = new int[tam_m][tam_m];

            // Matriz original
            resultado += "\nMatriz original: \n";
            for (int fil = 0; fil < tam_m; fil++) {
                for (int col = 0; col < tam_m; col++) {
                    nro_alea = (int) (Math.random() * 100);
                    m_cuadratica[fil][col] = nro_alea;
                    resultado += m_cuadratica[fil][col] + " ";
                }
                resultado += "\n";
            }

            // Matriz transpuesta
            resultado += "\nMatriz transpuesta: \n";
            for (int fil = 0; fil < tam_m; fil++) {
                for (int col = 0; col < tam_m; col++) {
                    m_transpuesta[fil][col] = m_cuadratica[col][fil];
                    resultado += m_transpuesta[fil][col] + " ";
                }
                resultado += "\n";
            }
            return resultado;
        } catch (Exception e) {
            throw new Exception("Ocurrió un error en Crear_matriz_cudratica " + e);
        }
    }

    /*
     * 7. Escriba un algoritmo que calcule el producto y la división. Los operandos
     * serán la suma de elementos de la diagonal principal y la suma de los
     * elementos de la diagonal secundaria. Los elementos de la matriz deben ser
     * llenados usando la función random para calcular números aleatorios entre 10 y
     * 100.
     */

    public static void Punto_7() throws Exception {
        try {
            System.out.println("\n\nPunto 7:\n");
            System.out.println(Calcular_producto_division());
        } catch (Exception e) {
            System.out.println("Ocurrió un error en el Punto_7: " + e);
        }
    }

    public static String Calcular_producto_division() throws Exception {
        try {
            // Definir variables y arrays
            tam_m = (int) (Math.random() * (10 - 2 + 1) + 2);
            matriz = new int[tam_m][tam_m];
            String texto = "";
            int nro_alea, suma_diagonal1 = 0, suma_diagonal2 = 0, producto;
            double division;

            // Lelnar matriz con aleatorios
            for (int fil = 0; fil < tam_m; fil++) {
                for (int col = 0; col < tam_m; col++) {
                    nro_alea = (int) (Math.random() * (100 - 10 + 1) + 10);
                    matriz[fil][col] = nro_alea;
                    texto += matriz[fil][col] + " ";
                }
                texto += "\n";
            }

            // Suma diagonal primaria
            for (int pos = 0; pos < tam_m; pos++) {
                suma_diagonal1 += matriz[pos][pos];
            }
            texto += "\nSuma diagonal primaria: " + suma_diagonal1;

            // Suma diagonal secundaria
            int fil = matriz.length - 1;
            for (int pos = 0; pos < tam_m; pos++) {
                suma_diagonal2 += matriz[fil][pos];
                fil--;
            }
            texto += "\nSuma diagonal secundaria: " + suma_diagonal2;

            // Calcular producto
            producto = suma_diagonal1 * suma_diagonal2;
            texto += "\n\nProducto: " + producto;

            // Calcular división
            division = (double) suma_diagonal1 / suma_diagonal2;
            texto += "\nDivisión: " + division;

            return texto;

        } catch (Exception e) {
            throw new Exception("Ocurrió un error en Calcular_producto_division " + e);
        }
    }

    /*
     * 8. Escriba un algoritmo que llene de manera aleatoria una matriz de 100 filas
     * por 3 columnas con Xs y Os. Y mediante un vector cuente el número de Xs y Os
     * en cada fila. Imprima la matriz antes de llenarla, luego de llenarla y el
     * vector con el resultado.
     */

    public static void Punto_8() throws Exception {
        try {
            System.out.println("\n\nPunto 8:\n");
            System.out.println(Llenar_matriz_y_contar());

        } catch (Exception e) {
            System.out.println("Ocurrió un error en el Punto_8: " + e);
        }
    }

    public static String Llenar_matriz_y_contar() throws Exception {
        try {

            // Definir variables y arrays
            final int tam_fil = 100, tam_col = 3;
            String[][] matriz_letras = new String[tam_fil][tam_col];
            String texto = "";
            int alea, contador_Xs = 0, contador_Os = 0;
            String[] v_contador = new String[tam_fil];

            // Matriz sin llenar
            texto += "Matriz sin llenar: \n";
            for (int fil = 0; fil < tam_fil; fil++) {
                for (int col = 0; col < tam_col; col++) {
                    texto += matriz_letras[fil][col] + " ";
                }
                texto += "\n";
            }

            // Llenar matriz
            texto += "\nMatriz llena: \n";
            for (int fil = 0; fil < tam_fil; fil++) {

                // Reiniciar el conteo en cada fila
                contador_Xs = 0;
                contador_Os = 0;

                for (int col = 0; col < tam_col; col++) {
                    alea = (int) (Math.random() * (2 - 1 + 1) + 1);
                    switch (alea) {
                        case 1:
                            matriz_letras[fil][col] = "Xs";
                            contador_Xs++; // Agregar el contador de Xs
                            break;
                        case 2:
                            matriz_letras[fil][col] = "Os";
                            contador_Os++; // Agregar el contador de Os
                            break;
                    }
                }
                v_contador[fil] = "\nFila " + (fil + 1) + ":\n - Xs: " + contador_Xs + "\n - Os: " + contador_Os;
            }

            // Mostrar matriz llena
            for (int fil = 0; fil < matriz_letras.length; fil++) {
                texto += (Arrays.toString(matriz_letras[fil]));
                texto += "\n";
            }

            // Imprimir conteo
            texto += "\nConteo por filas:\n";
            for (int fil = 0; fil < tam_fil; fil++) {
                texto += v_contador[fil] + "\n";
            }

            return texto;

        } catch (Exception e) {
            throw new Exception("Ocurrió un error en Llenar_matriz_y_contar " + e);
        }
    }

    /*
     * 9. Llene una matriz de 5x5 con números aleatorios entre 1 y 9. En un vector
     * adicional, calcule la cantidad de números repetidos por cada fila y en otro
     * vector la cantidad de números repetidos de cada columna.
     */

    public static void Punto_9() throws Exception {
        try {
            System.out.println("\n\nPunto 9:\n");
            System.out.println(Calcular_repeticiones());

        } catch (Exception e) {
            System.out.println("Ocurrió un error en el Punto_9: " + e);
        }
    }

    public static String Calcular_repeticiones() throws Exception {
        try {

            // Definir variables y array
            tam_m = 5;
            int alea, max = 9, min = 1;
            String texto = "";
            int[][] m_nros_alea = new int[tam_m][tam_m];
            int[] v_col = new int[tam_m];

            // Llenar matriz con aleatorios
            for (int fil = 0; fil < tam_m; fil++) {

                for (int col = 0; col < tam_m; col++) {
                    alea = (int) (Math.random() * (max - min + 1) + min);
                    m_nros_alea[fil][col] = alea;
                    texto += m_nros_alea[fil][col] + " ";
                }
                texto += "\n";
            }

            // Contar repetidos por fila
            texto += "\nContar filas: \n";

            for (int fil = 0; fil < tam_m; fil++) {
                texto += "Fila " + (fil + 1) + ": " + Contar_repetidos_vector(m_nros_alea[fil]) + "\n";
            }

            // Contar repetidos por columna
            texto += "\nContar columnas: \n";

            for (int col = 0; col < tam_m; col++) {
                for (int fil = 0; fil < tam_m; fil++) {
                    v_col[fil] = m_nros_alea[fil][col];
                }
                texto += "Columna " + (col + 1) + ": " + Contar_repetidos_vector(v_col) + "\n";
            }
            return texto;

        } catch (Exception e) {
            throw new Exception("Ocurrió un error en Calcular_repeticiones " + e);
        }
    }

    public static int Contar_repetidos_vector(int[] fila) throws Exception {
        try {

            int[] contador = new int[fila.length];
            int suma = 0;

            for (int pos_co = 0; pos_co < fila.length; pos_co++) {
                contador[pos_co] = 0;

                if (fila[pos_co] != 0) {

                    for (int pos = pos_co + 1; pos < fila.length; pos++) {

                        if (fila[pos] != 0) {

                            if (fila[pos] == fila[pos_co]) {
                                fila[pos] = 0;
                                contador[pos_co] = 1;
                            }
                        }
                    }
                }
            }

            for (int sum_pos = 0; sum_pos < contador.length; sum_pos++) {
                suma += contador[sum_pos];
            }

            return suma;
        } catch (Exception e) {
            throw new Exception("Ocurrió un error en Contar_repetidos_fila " + e);
        }
    }
}
