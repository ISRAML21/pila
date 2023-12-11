import java.util.Scanner;
import java.util.Stack;

public class Pila<T> {
    private Stack<T> pila;

    public Pila() {
        pila = new Stack<>();
    }

    public void push(T elemento) {
        pila.push(elemento);
    }

    public T pop() {
        if (!pila.isEmpty()) {
            return pila.pop();
        } else {
            System.out.println("La pila está vacía.");
            return null;
        }
    }

    public T peek() {
        if (!pila.isEmpty()) {
            return pila.peek();
        } else {
            System.out.println("La pila está vacía.");
            return null;
        }
    }

    public void mostrarElementos() {
        if (!pila.isEmpty()) {
            System.out.println("Elementos de la pila: " + pila);
        } else {
            System.out.println("La pila está vacía.");
        }
    }

    public int obtenerTamaño() {
        return pila.size();
    }

    public boolean estaVacia() {
        return pila.isEmpty();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pila<Integer> pila = new Pila<>();

        int opcion;

        do {
            System.out.println("\n=== Menú de Pila ===");
            System.out.println("1. Push (Agregar elemento)");
            System.out.println("2. Pop (Quitar elemento)");
            System.out.println("3. Peek (Ver elemento superior)");
            System.out.println("4. Mostrar elementos de la pila");
            System.out.println("5. Tamaño de la pila");
            System.out.println("6. ¿La pila está vacía?");
            System.out.println("0. Salir");
            System.out.print("Ingrese su opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el elemento a agregar: ");
                    int elementoPush = scanner.nextInt();
                    pila.push(elementoPush);
                    break;

                case 2:
                    Integer elementoPop = pila.pop();
                    if (elementoPop != null) {
                        System.out.println("Elemento removido: " + elementoPop);
                    }
                    break;

                case 3:
                    Integer elementoSuperior = pila.peek();
                    if (elementoSuperior != null) {
                        System.out.println("Elemento superior: " + elementoSuperior);
                    }
                    break;

                case 4:
                    pila.mostrarElementos();
                    break;

                case 5:
                    System.out.println("Tamaño de la pila: " + pila.obtenerTamaño());
                    break;

                case 6:
                    System.out.println("¿La pila está vacía? " + pila.estaVacia());
                    break;

                case 0:
                    System.out.println("Saliendo del programa.");
                    break;

                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
                    break;
            }
        } while (opcion != 0);

        scanner.close();
    }
}