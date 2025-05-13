package ficheros;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("""
                ---MENÚ---
                1. Añadir cliente
                2. Listar clientes
                3. Buscar clientes
                4. Borrar cliente
                5. Borrar fichero de clientes
                6. Salir
                """);

            System.out.print("Introduce una opción: ");
            int opcion = entrada.nextInt();

            switch (opcion) {
                case 1 -> {
                    System.out.print("DNI: ");
                    String dni = entrada.next();
                    System.out.print("Nombre: ");
                    String nombre = entrada.next();
                    System.out.print("Teléfono: ");
                    int telefono = entrada.nextInt();
                    System.out.print("Dirección: ");
                    String direccion = entrada.next();
                    System.out.print("Deuda: ");
                    double deuda = entrada.nextDouble();

                    File fichero = new File("clientes.dat");
                    try {
                        ObjectOutputStream oos = fichero.exists()
                            ? new MiObjectOutputStream(new FileOutputStream(fichero, true))
                            : new ObjectOutputStream(new FileOutputStream(fichero));

                        oos.writeObject(new Persona(dni, nombre, telefono, direccion, deuda));
                        oos.close();
                        System.out.println("Cliente añadido correctamente.");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                case 2 -> {
                    try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("clientes.dat"))) {
                        while (true) {
                            Persona p = (Persona) ois.readObject();
                            System.out.println(p);
                        }
                    } catch (EOFException ignored) {
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                case 3 -> {
                    System.out.print("Introduce el DNI a buscar: ");
                    String buscarDni = entrada.next();
                    boolean encontrado = false;
                    try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("clientes.dat"))) {
                        while (true) {
                            Persona p = (Persona) ois.readObject();
                            if (p.getDni().equalsIgnoreCase(buscarDni)) {
                                System.out.println("Cliente encontrado: " + p);
                                encontrado = true;
                                break;
                            }
                        }
                    } catch (EOFException ignored) {
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    if (!encontrado) {
                        System.out.println("No hay ningún cliente con ese DNI");
                    }
                }
                case 4 -> {
                    System.out.print("Introduce el DNI a borrar: ");
                    String borrarDni = entrada.next();
                    File original = new File("clientes.dat");
                    File temporal = new File("clientes_tmp.dat");
                    boolean encontrado = false;

                    try (
                        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(original));
                        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(temporal))
                    ) {
                        while (true) {
                            Persona p = (Persona) ois.readObject();
                            if (p.getDni().equalsIgnoreCase(borrarDni)) {
                                System.out.println("Cliente borrado: " + p);
                                encontrado = true;
                            } else {
                                oos.writeObject(p);
                            }
                        }
                    } catch (EOFException ignored) {
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    if (!encontrado) {
                        System.out.println("No se encontró ningún cliente con ese DNI.");
                    }

                    if (original.delete()) {
                        temporal.renameTo(original);
                    } else {
                        System.out.println("No se pudo sobrescribir el fichero original.");
                    }
                }
                case 5 -> {
                    File fichero = new File("clientes.dat");
                    if (fichero.exists() && fichero.delete()) {
                        System.out.println("Fichero eliminado correctamente.");
                    } else {
                        System.out.println("No se pudo eliminar el fichero o no existe.");
                    }
                }
                case 6 -> {
                    continuar = false;
                    entrada.close();
                    System.out.println("Saliendo...");
                }
                default -> System.out.println("Opción no válida.");
            }
        }
    }
}

// Clase auxiliar para evitar escribir cabeceras duplicadas
class MiObjectOutputStream extends ObjectOutputStream {
    public MiObjectOutputStream(OutputStream out) throws IOException {
        super(out);
    }
    @Override
    protected void writeStreamHeader() throws IOException {
        // No escribas cabecera adicional
    }
}

