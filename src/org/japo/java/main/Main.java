/* 
 * Copyright 2019 AdrianGV  adrian.gimeno.alum@iescamp.es.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author AdrianGV adrian.gimeno.alum@iescamp.es
 */
public final class Main {

    public static final Random RND = new Random();
    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    public static void main(String[] args) {

        //Horas de banco
        int horaBancoIni = 10;
        int mintuoBancoIni = 30;
        int horaBancoFin = 12;
        int minutoBancoFin = 15;

        //HorasRandom
        int horaRND = RND.nextInt(23 - 0 + 1) + 0;
        int minutoRND = RND.nextInt(59 - 0 + 1) + 0;

        //Minutos
        int minutosInic = horaBancoIni * 60 + 30;
        int minutosFinal = horaBancoFin * 60 + 15;
        int minutosRandom = horaRND * 60 + minutoRND;

        try {
            
            System.out.print("Hora actual ..:");
            int horaMano = SCN.nextInt();
            System.out.print("Minuto actual ..:");
            int minutoMano = SCN.nextInt();

            //Minutos a mano
            int minutosMano = horaMano * 60 + minutoMano;

            String Horario;
            Horario = (minutosMano >= minutosInic && minutosMano <= minutosFinal) ? "Horario Correcto" : "Horario Incorrecto";

            System.out.println(Horario);

            System.out.println("================");
            System.out.println("HORARIO RANDOM");
            System.out.printf("Hora %02d:%02d%n", horaRND, minutoRND);
            
           String Horario2;
            Horario2 = (minutosRandom >= minutosInic && minutosRandom <= minutosFinal) ? "Horario Correcto" : "Horario Incorrecto";

            System.out.println(Horario2);

        } catch (Exception e) {
            System.out.println("Error Entrada incorrecta");
        } finally {
            SCN.nextLine();
        }

    }
}
