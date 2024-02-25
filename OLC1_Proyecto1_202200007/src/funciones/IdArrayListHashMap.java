/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funciones;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Collections;
import java.util.Map.Entry;
/**
 *
 * @author natalia
 */
    
public class IdArrayListHashMap {
    private HashMap<String, ArrayList<Object>> idArrayListMap;

    // Constructor
    public IdArrayListHashMap() {
        idArrayListMap = new HashMap<>();
    }

    // Getter for idArrayListMap
    public HashMap<String, ArrayList<Object>> getIdArrayListMap() {
        return idArrayListMap;
    }

    // Setter for idArrayListMap
    public void setIdArrayListMap(HashMap<String, ArrayList<Object>> idArrayListMap) {
        this.idArrayListMap = idArrayListMap;
    }

    // Getter for ArrayList corresponding to a specific ID
    public ArrayList<Object> getArrayListById(String id) {
         //System.out.println("buscando el array en el hashmap");
        return idArrayListMap.get(id);
    }

    // Setter for ArrayList corresponding to a specific ID
    public void setArrayListById(String id, ArrayList<Object> arrayList) {
        idArrayListMap.put(id, arrayList);
        //System.out.println("agregada");
    }


    // MEDIANA
    public double calculateMedian(ArrayList<Object> arrayList) {
        int size = arrayList.size();
        // SORT
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (toDouble(arrayList.get(i)) > toDouble(arrayList.get(j))) {
                    // MOVER
                    Object temp = arrayList.get(i);
                    arrayList.set(i, arrayList.get(j));
                    arrayList.set(j, temp);
                }
            }
        }

        if (size % 2 == 0) {
            int midIndex1 = size / 2 - 1;
            int midIndex2 = size / 2;
            double value1 = toDouble(arrayList.get(midIndex1));
            double value2 = toDouble(arrayList.get(midIndex2));
            return (value1 + value2) / 2.0;
        } else {
            int midIndex = size / 2;
            return toDouble(arrayList.get(midIndex));
        }
    }



        // MODA
    public double calculateMode(ArrayList<Object> arrayList) {
        HashMap<Object, Integer> frequencyMap = new HashMap<>();
        for (Object element : arrayList) {
            frequencyMap.put(element, frequencyMap.getOrDefault(element, 0) + 1);
        }
        Object mode = null;
        int maxFrequency = 0;
        for (Entry<Object, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                mode = entry.getKey();
                maxFrequency = entry.getValue();
            }
        }
        return toDouble(mode);
    }

        // PROMEDIO
        public double calculateMean(ArrayList<Object> arrayList) {
            double sum = 0;
            int count = 0;
            for (Object element : arrayList) {
                if (element instanceof Number) {
                    sum += ((Number) element).doubleValue();
                    count++;
                }
            }
            return sum / count;
        }

    // MAX
    public double calculateMax(ArrayList<Object> arrayList) {
        double max = toDouble(arrayList.get(0));
        for (Object element : arrayList) {
            if (toDouble(element) > max) {
                max = toDouble(element);
            }
        }
        return max;
    }

    // MIN
    public double calculateMin(ArrayList<Object> arrayList) {
        double min = toDouble(arrayList.get(0));
        for (Object element : arrayList) {
            if (toDouble(element) < min) {
                min = toDouble(element);
            }
        }
        return min;
    }

    // VER QUE SEA DOUBLE
    private double toDouble(Object obj) {
        if (obj instanceof Number) {
            return ((Number) obj).doubleValue();
        } else {
            throw new IllegalArgumentException("NO ES UN NUMERO");
        }
    }

    /**
     * Calculate the variance of the elements in the given ArrayList.
     * @param arrayList The ArrayList containing elements to calculate variance.
     * @return The variance of the elements in the ArrayList.
     */
    public double calculateVariance(ArrayList<Object> arrayList) {
        double mean = calculateMean(arrayList);
        double sumSquaredDiff = 0;
        int count = 0;
        for (Object element : arrayList) {
            if (element instanceof Number) {
                double diff = ((Number) element).doubleValue() - mean;
                sumSquaredDiff += diff * diff;
                count++;
            } else {

                 System.out.println("ERROR SE ESTA INTENDO USAR UN ARREGLO QUE CONTIEN TIPO CHAR");
            }
        }
        if (count == 0) {
            return Double.NaN; // If no elements, variance is undefined
        }
        return sumSquaredDiff / count; // Divide by total number of elements
    }
   
}
