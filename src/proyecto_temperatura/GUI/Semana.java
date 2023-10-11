package proyecto_temperatura.GUI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Fabian
 */
public class Semana {

    private List<Dia> listaDias; // Declaración de la lista de objetos de la clase Dia

    public Semana() {
        listaDias = new ArrayList<>();
    }

    public List<Dia> getListaDias() {
        return listaDias;
    }

    public void setListaDias(List<Dia> listaDias) {
        this.listaDias = listaDias;
    }

    public void AgregarDia(Dia day) {
        listaDias.add(day);
    }

    public double CalcularMedia() {
        double sumaTemperaturaMañana = 0;
        double sumaTemperaturaMedioDia = 0;
        double sumaTemperaturaNoche = 0;

        if (listaDias != null && !listaDias.isEmpty()) {
            for (Dia dia : listaDias) {
                sumaTemperaturaMañana += dia.getTemperaturaMañana();
                sumaTemperaturaMedioDia += dia.getTemperaturaMedioDia();
                sumaTemperaturaNoche += dia.getTemperaturaNoche();
            }

            int totalDias = listaDias.size();

            double mediaTemperaturaMañana = sumaTemperaturaMañana / totalDias;
            double mediaTemperaturaMedioDia = sumaTemperaturaMedioDia / totalDias;
            double mediaTemperaturaNoche = sumaTemperaturaNoche / totalDias;

            System.out.println("Media Temperatura Mañana: " + mediaTemperaturaMañana);
            System.out.println("Media Temperatura Medio Día: " + mediaTemperaturaMedioDia);
            System.out.println("Media Temperatura Noche: " + mediaTemperaturaNoche);
            double mediaGeneral = (mediaTemperaturaMañana + mediaTemperaturaMedioDia + mediaTemperaturaNoche) / 3;
            return mediaGeneral;
        } else {
            System.out.println("La lista de días está vacía.");
            return 0;
        }

    }

    public double CalcularMediana() {
        List<Double> temperaturas = new ArrayList<>();

        for (Dia dia : listaDias) {
            temperaturas.add(dia.getTemperaturaMañana());
            temperaturas.add(dia.getTemperaturaMedioDia());
            temperaturas.add(dia.getTemperaturaNoche());
        }

        Collections.sort(temperaturas);

        for (double temp : temperaturas) {
            System.out.println(temp);
        }

        int totalDatos = temperaturas.size();
        if (totalDatos % 2 == 0) {
            // Si hay un número par de datos, la mediana es el promedio de los dos valores del medio.
            int medio = totalDatos / 2;
            double valor1 = temperaturas.get(medio - 1);
            double valor2 = temperaturas.get(medio);
            return (valor1 + valor2) / 2.0;
        } else {
            // Si hay un número impar de datos, la mediana es el valor del medio.
            int medio = totalDatos / 2;
            return temperaturas.get(medio);
        }
    }

    public String CalcularModa() {
        List<Double> temperaturas = new ArrayList<>();

        for (Dia dia : listaDias) {
            temperaturas.add(dia.getTemperaturaMañana());
            temperaturas.add(dia.getTemperaturaMedioDia());
            temperaturas.add(dia.getTemperaturaNoche());
        }

        List<Double> modes = new ArrayList<>();
        int maxFrequency = 0;

        for (int i = 0; i < temperaturas.size(); i++) {
            double temperature = temperaturas.get(i);
            int frequency = 1;

            for (int j = i + 1; j < temperaturas.size(); j++) {
                if (temperature == temperaturas.get(j)) {
                    frequency++;
                }
            }

            if (frequency > maxFrequency) {
                maxFrequency = frequency;
                modes.clear();
                modes.add(temperature);
            } else if (frequency == maxFrequency) {
                modes.add(temperature);
            }
        }

        if (modes.isEmpty()) {
            // No hay moda.
            return "No hay moda.";
        }

        StringBuilder modaString = new StringBuilder("| ");
        for (Double mode : modes) {
            modaString.append(mode).append(" | ");
        }

        return modaString.toString();
    }
    
    public double MaximaTemperatura() {
        List<Double> temperaturas = new ArrayList<>();

        for (Dia dia : listaDias) {
            temperaturas.add(dia.getTemperaturaMañana());
            temperaturas.add(dia.getTemperaturaMedioDia());
            temperaturas.add(dia.getTemperaturaNoche());
        }

        Collections.sort(temperaturas);
        
        int maxTamaño = temperaturas.size();
        
        double maxTemperatura = temperaturas.get(maxTamaño-1);
        
        return maxTemperatura;
    }
    
    public double MinimaTemperatura() {
        List<Double> temperaturas = new ArrayList<>();

        for (Dia dia : listaDias) {
            temperaturas.add(dia.getTemperaturaMañana());
            temperaturas.add(dia.getTemperaturaMedioDia());
            temperaturas.add(dia.getTemperaturaNoche());
        }

        Collections.sort(temperaturas);
        
        double minTemperatura = temperaturas.get(0);
        
        return minTemperatura;
    }
    
    

}
