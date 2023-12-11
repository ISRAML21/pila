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
            System.out.println("LA PILA ESTÁ VACÍA.");
            return null;
        }
    }

    public T peek() {
        if (!pila.isEmpty()) {
            return pila.peek();
        } else {
            System.out.println("LA PILA ESTÁ VACÍA.");
            return null;
        }
    }

    public void mostrarElementos() {
        if (!pila.isEmpty()) {
            System.out.println("ELEMETOS DE LA PILA: " + pila);
        } else {
            System.out.println("LA PILA ESTÁ VACÍA.");
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
            System.out.println("\n--- Menú de Pila ---");
            System.out.println("1. AGREGAR ELEMENTO (Push) ");
            System.out.println("2. QUITAR ELEMENTO (Pop) ");
            System.out.println("3. VER ELEMENTO SUPERIOR (Peek) ");
            System.out.println("4. MOSTRAR ELEMENTOS DE LA PILA ");
            System.out.println("5. TAMAÑO DE LA PILA ");
            System.out.println("6. ¿LA PILA ESTÁ VACÍA? ");
            System.out.println("7. SALIR ");
            System.out.print("INGRESE SU OPCIÓN: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("INGRESE EL ELEMENTO A AGREGAR: ");
                    int elementoPush = scanner.nextInt();
                    pila.push(elementoPush);
                    break;

                case 2:
                    Integer elementoPop = pila.pop();
                    if (elementoPop != null) {
                        System.out.println("ELEMENTO REMOVIDO: " + elementoPop);
                    }
                    break;

                case 3:
                    Integer elementoSuperior = pila.peek();
                    if (elementoSuperior != null) {
                        System.out.println("ELEMENTO SUPERIOR: " + elementoSuperior);
                    }
                    break;

                case 4:
                    pila.mostrarElementos();
                    break;

                case 5:
                    System.out.println("TAMAÑO DE LA PILA: " + pila.obtenerTamaño());
                    break;

                case 6:
                    System.out.println("¿LA PILA ESTÁ VACÍA? " + pila.estaVacia());
                    break;

                case 7:
                    System.out.println("SALIENDO DEL PROGRAMA...");
                    break;

                default:
                    System.out.println("OPCION INNVALIDA, INTENTE NUEVAMENTE.");
                    break;
            }
        } while (opcion != 7);

        scanner.close();
    }
}