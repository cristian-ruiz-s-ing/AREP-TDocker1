package org.example;

import static spark.Spark.*;

public class SparkWebServer {
    public static void main(String[] args) {
        port(getPort());
        get("/home", (req, res) -> WebPage.getWebPage());

        get("hello", (req, res) -> "Hello Docker");

        get("/sin/:valor", (req, res) -> getSin(req.params("valor")));

        get("/cos/:valor", (req, res) -> getCos(req.params("valor")));

        get("/palindromo/:cadena", (req, res) -> getPalindromo(req.params("cadena")));

        get("/vector/:param1/:param2", (req, res) -> getMagnitud(req.params("param1"), req.params("param2")));
    }

    private static double getMagnitud(String param1, String param2) {
        double p1 = Double.parseDouble(param1);
        double p2 = Double.parseDouble(param2);
        return Math.sqrt(Math.pow(p1, 2)+ Math.pow(p2, 2));
    }

    private static boolean getPalindromo(String cadena) {
        String invertida = new StringBuilder(cadena).reverse().toString();
        return cadena.equals(invertida);
    }

    private static double getCos(String valor) {
        double val = Double.parseDouble(valor);
        return Math.cos(val);
    }

    private static double getSin(String valor) {
        double val = Double.parseDouble(valor);
        return Math.sin(val);
    }

    private static int getPort() {
        if (System.getenv("PORT")!= null){
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }
}
