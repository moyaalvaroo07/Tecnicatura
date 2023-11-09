
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author homer
 */
public class NewClass {
    public static void main(String args[]) {
        String nomus;
        JOptionPane.showMessageDialog(null, "......................:::Arranca con Fuerza:::........................");
        nomus = JOptionPane.showInputDialog("Escriba su nombre: ");
        JOptionPane.showMessageDialog(null, "Bienvenido " + nomus);
        System.out.print(" ");
        menu();
    }

    // menu interactivo
    public static void menu() {
        int elemenu;
        // grafica de pago
        elemenu = Integer.parseInt(JOptionPane.showInputDialog(
                "MENU\n" +
                "1. Planes de Pago\n" +
                "2. Elegir Turno\n" +
                "3. Rutina a entrenar\n" +
                "4. Contador de series en el ejercicio\n" +
                "5. Salir"));
        switch (elemenu) {
            case 1 -> planesdepago();
            case 2 -> turno();
            case 3 -> rut();
            case 4 -> cont();
            case 5 -> JOptionPane.showMessageDialog(null, "Gracias por venir purasangre!");
            default -> {
                JOptionPane.showMessageDialog(null, "La opcion elegida es incorrecta, vuelva a seleccionar otra");
                menu();
            }
        }
    }

    public static void planesdepago() {
        int vol;

        JOptionPane.showMessageDialog(null,
                "                                                     Planes del Gym\n" +
                "Dias disponibles    | Lunes |" + "| Martes |" + "| Miercoles |" + "| Jueves |" + "| Viernes |" + "| Sabado |" + "| Domingo |\n" +
                "1 vez x semana                                  $400\n" +
                "2 veces x semana                             $2000\n" +
                "3 veces x semana                             $3000\n" +
                "6 veces x semana                             $5000\n" +
                "¿Desea volver al menu?");

        vol = Integer.parseInt(JOptionPane.showInputDialog(
                "1. Si desea volver coloque 1\n" +
                "2. Si desea salir coloque 2"));
        // EXPRESIÓN
        switch (vol) {
            case 1 -> menu();
            case 2 -> JOptionPane.showMessageDialog(null, "Gracias por venir pura sangre".toUpperCase());
            default -> {
                while (vol > 2) {
                    vol = Integer.parseInt(JOptionPane.showInputDialog("La opcion es incorrecta, vuelve a elegir otra opcion".toUpperCase()));
                }
                while (vol == 1) {
                    menu();
                }

                JOptionPane.showMessageDialog(null, "Gracias por venir pura sangre".toUpperCase());
            }
        }
    }

    public static void turno() {
        int i;
        String nomusu;
        int precios[];
        // iterador que recorre los precios en el arreglo
        // arreglo con los precios de los dintintos planes de rutina
        precios = new int[4];
        precios[0] = 400;
        precios[1] = 2000;
        precios[2] = 3000;
        precios[3] = 5000;

        JOptionPane.showMessageDialog(null, "¿Nombre del que solicita el turno?: ");
        nomusu = JOptionPane.showInputDialog("Escriba su nombre: ");
        JOptionPane.showMessageDialog(null,
                "1. 1 dias a la semana son $400\n" +
                "2. 2 dias a la semana son $2000\n" +
                "3. 3 dias a la semana son $3000\n" +
                "4. 6 dias a la semana son $5000");
        i = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos dias va a asistir?"));
        while (i > 4) {
            i = Integer.parseInt(JOptionPane.showInputDialog("La opcion es incorrecta, vuelva a elegir el plan"));
        }
        if (i == 1) {
            JOptionPane.showMessageDialog(null,
                    " ________________________________\n" +
                    "| Nombre del usuario: " + nomusu + "\n" +
                    "|--------------------------------|\n" +
                    "| Dias: 1                          \n" +
                    "|--------------------------------|\n" +
                    "| Precio:$ " + precios[0] + "\n" +
                    "| --------------------------------");
        } else {
            if (i == 2) {
                JOptionPane.showMessageDialog(null,
                        " ________________________________\n" +
                        "| Nombre del usuario: " + nomusu + "\n" +
                        "|--------------------------------|\n" +
                        "| Dias: 2                         \n" +
                        "|--------------------------------|\n" +
                        "| Precio: $" + precios[1] + "\n" +
                        "| --------------------------------");
            } else {
                if (i == 3) {
                    JOptionPane.showMessageDialog(null,
                            " ________________________________\n" +
                            "| Nombre del usuario: " + nomusu + "\n" +
                            "|--------------------------------|\n" +
                            "| Dias: 3                          \n" +
                            "|--------------------------------|\n" +
                            "| Precio:$ " + precios[2] + "\n" +
                            "| --------------------------------");
                } else {
                    if (i == 4) {
                        JOptionPane.showMessageDialog(null,
                                " ________________________________\n" +
                                "| Nombre del usuario: " + nomusu + "\n" +
                                "|--------------------------------|\n" +
                                "| Dias: 6                            \n" +
                                "|--------------------------------|\n" +
                                "| Precio:$ " + precios[3] + "\n" +
                                "| --------------------------------");
                    }
                }
            }
        }
        JOptionPane.showMessageDialog(null, "¿Desea realizar otra operacion?".toUpperCase());
        menu();
    }

    public static void rut() {
        int i;
        int j;
        String rutina[];

        rutina = new String[7];
        rutina[0] = "Pecho";
        rutina[1] = "Espalda";
        rutina[2] = "Pierna";
        rutina[3] = "Bicep";
        rutina[4] = "Tricep";
        rutina[5] = "Hombro";
        rutina[6] = "Abs";

        i = Integer.parseInt(JOptionPane.showInputDialog(
                "Seleccione su sexo\n" +
                "1. Mujer\n" +
                "2. Hombre"));
        while (i > 2) {
            i = Integer.parseInt(JOptionPane.showInputDialog("Usted eligió una opción incorrecta, vuelva a seleccionar su sexo"));
        }
        j = Integer.parseInt(JOptionPane.showInputDialog(
                "Seleccione los dias a trabajar\n" +
                "1. 1 dia a la semana\n" +
                "2. 2 dias a la semana\n" +
                "3. 3 dias a la semana\n" +
                "4. 6 dias a la semana"));
        while (j > 4) {
            j = Integer.parseInt(JOptionPane.showInputDialog("Usted eligió una opción incorrecta, seleccione nuevamente su rutina"));
        }
        if (i == 1 && j == 1) {
            JOptionPane.showMessageDialog(null,
                    "                            plan de ejercitacion de 1 dia\n" +
                    "|  Lunes  |   Martes  |   Miercoles   |  Jueves   |  Viernes   |  Sabado   |  Domingo |\n" +
                    "------------------------------------------------------------------------------------------------------------\n" +
                    "|  nada    |   nada      |     " + rutina[2] + "        |   nada       |   nada      |   nada       | descanso |\n" +
                    "|  nada    |   nada      |     " + rutina[6] + "             |   nada       |   nada      |   nada       | descanso |\n" +
                    "|  nada    |   nada      |     " + rutina[1] + "     |   nada       |   nada       |   nada       | descanso |\n" +
                    "------------------------------------------------------------------------------------------------------------\n" +
                    "¿Desea realizar otra operacion?");
            menu();
        } else {
            if (i == 1 && j == 2) {
                JOptionPane.showMessageDialog(null,
                        "                            plan de ejercitacion de 2 dias\n" +
                        "|  Lunes  |   Martes  |   Miercoles   |  Jueves   |  Viernes   |  Sabado   |  Domingo |\n" +
                        "------------------------------------------------------------------------------------------------------------\n" +
                        "|   nada   |  " + rutina[2] + "    |     nada          |   " + rutina[3] + "     |    nada       |    nada      | descanso |\n" +
                        "|   nada   |   " + rutina[6] + "        |     nada          |   " + rutina[2] + "    |    nada       |    nada      | descanso |\n" +
                        "|   nada   |   " + rutina[1] + " |    nada          |   " + rutina[5] + "  |    nada       |    nada      | descanso |\n" +
                        "------------------------------------------------------------------------------------------------------------\n" +
                        "¿Desea realizar otra operacion?");
                menu();
            } else {
                if (i == 1 && j == 3) {
                    JOptionPane.showMessageDialog(null,
                            "                            plan de ejercitacion de 3 dias\n" +
                            "|  Lunes  |   Martes  |   Miercoles   |  Jueves   |  Viernes   |  Sabado   |  Domingo |\n" +
                            "------------------------------------------------------------------------------------------------------------\n" +
                            "|  " + rutina[2] + " |   nada       |     " + rutina[3] + "        |    nada      |  " + rutina[0] + "     |    nada      | descanso |\n" +
                            "|   " + rutina[6] + "     |   nada       |    " + rutina[2] + "       |    nada       |  " + rutina[4] + "    |    nada      | descanso |\n" +
                            "| " + rutina[1] + "|   nada       |   " + rutina[5] + "     |    nada       |  " + rutina[2] + "    |    nada      | descanso |\n" +
                            "------------------------------------------------------------------------------------------------------------\n" +
                            "¿Desea realizar otra operacion?");
                    menu();
                } else {
                    if (i == 1 && j == 4) {
                        JOptionPane.showMessageDialog(null,
                                "                             plan de ejercitacion de 6 dias\n" +
                                "|  Lunes  |   Martes  |   Miercoles   |  Jueves   |  Viernes   |  Sabado   |  Domingo |\n" +
                                "------------------------------------------------------------------------------------------------------------\n" +
                                "|  " + rutina[2] + "  |     " + rutina[6] + "     |      " + rutina[0] + "       |     " + rutina[6] + "      |    " + rutina[0] + "    |a eleccion| descanso |\n" +
                                "|    " + rutina[6] + "     |   " + rutina[3] + "    |      " + rutina[2] + "       |   " + rutina[4] + "   |   " + rutina[5] + "  |a eleccion| descanso |\n" +
                                "| " + rutina[1] + " |   " + rutina[4] + "  |     " + rutina[5] + "     | " + rutina[1] + "  |    " + rutina[2] + "    |a eleccion| descanso |\n" +
                                "------------------------------------------------------------------------------------------------------------\n" +
                                "¿Desea realizar otra operacion?");
                        menu();
                    } else {
                        if (i == 2 && j == 1) {
                            JOptionPane.showMessageDialog(null,
                                    "                             plan de ejercitacion de 1 dia\n" +
                                    "|  Lunes  |   Martes  |   Miercoles   |  Jueves   |  Viernes   |  Sabado   |  Domingo |\n" +
                                    "------------------------------------------------------------------------------------------------------------\n" +
                                    "|  nada    |    nada     |      " + rutina[0] + "       |    nada     |     nada      |    nada     | descanso |\n" +
                                    "|  nada    |    nada     |       " + rutina[3] + "       |    nada     |     nada      |    nada     | descanso |\n" +
                                    "|  nada    |    nada     |       " + rutina[4] + "      |    nada     |     nada      |    nada     | descanso |\n" +
                                    "------------------------------------------------------------------------------------------------------------\n" +
                                    "¿Desea realizar otra operacion?");
                            menu();
                        } else {
                            if (i == 2 && j == 2) {
                                JOptionPane.showMessageDialog(null,
                                        "                             plan de ejercitacion de 2 dias\n" +
                                        "|  Lunes  |   Martes  |   Miercoles   |  Jueves   |  Viernes   |  Sabado   |  Domingo |\n" +
                                        "------------------------------------------------------------------------------------------------------------\n" +
                                        "|   nada   |   " + rutina[0] + "   |        nada        |  " + rutina[1] + " |      nada     |     nada    | descanso |\n" +
                                                    
                        
                    }
                }
            }
        }
    }
}
}
