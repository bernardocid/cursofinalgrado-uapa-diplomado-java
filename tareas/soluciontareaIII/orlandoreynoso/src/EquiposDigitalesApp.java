import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class EquiposDigitalesApp {

    public static void main(String[] args) throws ParseException {

        {
            String Wifi;
            String G3;
            String Pantalla;
            String Pantalla1;

            NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.getDefault());
            SimpleDateFormat formatdate = new SimpleDateFormat("dd-mm-yyyy");

            SmartPhone Smart = new SmartPhone("Motorola", "Moto X", "4GB", true,"4.5 Pulg", "Virtual", formatdate.parse("02-02-2014"), 8000, true, false);
            Tablet Tableta = new Tablet("SamSung", "Galaxy tab", "16GB", false,"7.0 Pulg", "Virtual", formatdate.parse("14-08-2012"), 15000, true, true, "Android");
            Celular celulares = new Celular("Alcatel", "Samsung", "256MB", false,"1.5 Pulg", "Fisico", formatdate.parse("14-08-2003"), 0);

            if (Smart.Wifi == true) {
                Wifi = "Si";
            } else {
                Wifi = "No";
            }

            if (Smart.G3 == true) {
                G3 = "Si";
            } else {
                G3 = "No";
            }

            if (Smart.pantalla == true) {
                Pantalla = "Tactil";
            } else {
                Pantalla = "Multitactil";
            }

            if (Tableta.Wifi == true) {
                Wifi = "Si";
            } else {
                Wifi = "No";
            }

            if (Tableta.G3 == true) {
                G3 = "Si";
            } else {
                G3 = "No";
            }

            if (Tableta.pantalla == true) {
                Pantalla1 = "Tactil";
            } else {
                Pantalla1 = "MultiTactil";
            }

            String setTextRed = "\033[31m";
            String setTextblue = "\033[34m";
            String setTextYellow = "\033[33m";

            System.out.println(setTextRed + "Telefonos Inteligentes:");
            System.out.println(setTextblue + "Marca" + "      Modelo" + "      Memoria" + "     Pantalla" +"        Dimen Pantalla" + "      Teclado" + "     WiFi" + "    3G" + "       Fecha de Lanzamiento" + "        Precio");
            System.out.println(Smart.getMarca() + "   " + Smart.getModelo() + "       " + Smart.getAI() + "         " + Pantalla + "            " + Smart.getDP() + "         " + Smart.getTeclado() + "      " + Wifi + "     " + G3 + "            " + formatdate.format(Smart.getFecha()) + "            " + nf.format(Smart.CalcularPrecio())+ "\n");

            System.out.println(setTextYellow + "*******************************************************************************************************************************************************");

            System.out.println(setTextRed + "Tabletas:");
            System.out.println(setTextblue + "Marca" + "     Modelo" + "        Sistema Operativo" + "    Memoria" + "    Pantalla" + "      Dimen Pantalla" + "    Teclado" + "    WiFi" + "  3G" + "    Fecha de Lanzamiento" + "    Precio");
            System.out.println(Tableta.getMarca() + "   " + Tableta.getModelo() + "        " + Tableta.OS + "           " + Tableta.getAI() + "      " + Pantalla1 +"      "+ Tableta.getDP() + "       " + Tableta.getTeclado() + "     " + Wifi + "   " + G3 + "        " + formatdate.format(Tableta.getFecha()) + "         " + nf.format(Tableta.CalcularPrecio()) + "\n");

            System.out.println(setTextYellow + "********************************************************************************************************************************************************");

            System.out.println(setTextRed + "Celulares:");
            System.out.println(setTextblue + "Marcas" + "           Fecha de Lanzamiento" + "          Precio");

            System.out.println(celulares.getMarca() + "              " + formatdate.format(celulares.getFecha()) + "               " + nf.format(celulares.CalcularPrecio()));

        }
    }
}
