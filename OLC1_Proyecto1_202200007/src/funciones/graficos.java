/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funciones;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import funciones.acumulador;

import javax.swing.*;
import java.awt.*;
import java.text.DecimalFormat;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * @author natalia
 */
public class graficos extends JFrame {

    public graficos(String title) {
        super(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // metodos para crear la de BARRAS
    public static void createBarGraph(String chartTitle, String xAxisLabel, String yAxisLabel, List<Object> ejex, List<Object> ejey, Color color) {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for (int i = 0; i < ejex.size(); i++) {
            dataset.addValue((Double) ejey.get(i), "Data", (String) ejex.get(i));
        }
        JFreeChart barChart = ChartFactory.createBarChart(chartTitle, xAxisLabel, yAxisLabel, dataset, PlotOrientation.VERTICAL, true, true, false);
        barChart.getCategoryPlot().getRenderer().setSeriesPaint(0, color);
        displayChart(barChart, chartTitle);
    }

    // PIEEEEEEEEEEEEEEEEEEEEEEEEEEEEE
    public static void createPieGraph(String chartTitle, List<Object> labels, List<Object> values, Color color) {
        DefaultPieDataset dataset = new DefaultPieDataset();
        for (int i = 0; i < labels.size(); i++) {
            dataset.setValue((String) labels.get(i), (Double) values.get(i));
        }
        JFreeChart pieChart = ChartFactory.createPieChart(chartTitle, dataset, true, true, false);
        pieChart.getPlot().setBackgroundPaint(color);
        displayChart(pieChart, chartTitle);
    }

    // GARFO DE LINEA
     public static void createLineGraph(String title, String xAxisLabel, String yAxisLabel,
                                       List<Object> xData, List<Object> yData, Color lineColor) {
        DefaultCategoryDataset categoryDataset = new DefaultCategoryDataset();

        // X STRING Y Y DOUBLE, LO CONVIERTE Y VERIFICA
        for (int i = 0; i < xData.size(); i++) {
            categoryDataset.addValue((Number) yData.get(i), "Series 1", (Comparable<?>) xData.get(i));
        }

        JFreeChart chart = ChartFactory.createLineChart(
                title,
                xAxisLabel,
                yAxisLabel,
                categoryDataset
        );

        chart.getCategoryPlot().getRenderer().setSeriesPaint(0, lineColor);

        ChartPanel chartPanel = new ChartPanel(chart);
        JFrame frame = new JFrame(title);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.add(chartPanel, BorderLayout.CENTER);
        frame.pack();
        frame.setSize(600, 450);
        frame.setVisible(true);
    }

    // CREAR EL HISTOGRAMA
    public static void createHistogram(String chartTitle, List<Object> valores, Color color) {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        // MAPEO PARA LE FRECUENCIA
        Map<Object, Long> frequencyMap = valores.stream()
                .collect(Collectors.groupingBy(v -> v, Collectors.counting()));

        // CADA VALOR UNICO SU BARRITA UNICA
        for (Map.Entry<Object, Long> entry : frequencyMap.entrySet()) {
            dataset.addValue(entry.getValue(), "Frequency", entry.getKey().toString());
        }

        // SE CREA
        JFreeChart histogram = ChartFactory.createBarChart(
                chartTitle,
                "Value",
                "Frequency",
                dataset,
                PlotOrientation.VERTICAL,
                true,
                true,
                false
        );

        // EL COLOR
        histogram.getCategoryPlot().getRenderer().setSeriesPaint(0, color);

        // MOSTRAR EN LA JFRAME
        displayChart(histogram, chartTitle);

        // TABLA FRECUENCIA
        printFrequencyTable(frequencyMap, valores.size());
    }
    
    private static void printFrequencyTable(Map<Object, Long> frequencyMap, int total) {
        DecimalFormat df = new DecimalFormat("#.##%");
        long cumulativeFrequency = 0;
        System.out.println("Valor\t| Frecuencia\t| Fecuencia Acumulada\t| Frecuencia relativa");
        acumulador.addToOutput("Valor\t| Frecuencia\t| Fecuencia Acumulada\t| Frecuencia relativa" );
        System.out.println("-----------------------------------------------------------------");
        acumulador.addToOutput("-----------------------------------------------------------------");
        for (Map.Entry<Object, Long> entry : frequencyMap.entrySet()) {
            cumulativeFrequency += entry.getValue();
            double relativeFrequency = (double) entry.getValue() / total;
            double finalRel = relativeFrequency*100;
            System.out.println(entry.getKey() + "\t| " + entry.getValue() + "\t\t| " + cumulativeFrequency + "\t\t\t\t| " + finalRel);
            acumulador.addToOutput(entry.getKey() + "\t| " + entry.getValue() + "\t| " + cumulativeFrequency + "\t\t| " + finalRel);
            
        }
    }

    //CREA EL JFRAME
    private static void displayChart(JFreeChart chart, String title) {
        ChartPanel chartPanel = new ChartPanel(chart);
        JFrame frame = new JFrame(title);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.add(chartPanel, BorderLayout.CENTER);
        frame.pack();
        frame.setSize(600, 450);
        frame.setVisible(true);
    }
    

    
}
