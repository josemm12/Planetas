public class Planeta {
    String nombre;
    int cantidadSatelites;
    double masa;
    double volumen;
    double diametro;
    double distanciaAlsol;
    boolean esObservable;
   

    public Planeta(String nombre, int cantidadSatelites, double masa, double volumen, double diametro,
            double distanciaAlsol, boolean esObservable) {
        this.nombre = nombre;
        this.cantidadSatelites = cantidadSatelites;
        this.masa = masa;
        this.volumen = volumen;
        this.diametro = diametro;
        this.distanciaAlsol = distanciaAlsol;
        this.esObservable = esObservable;
    }

    public double getMasa() {
        return masa;
    }

    public void setMasa(double masa) {
        this.masa = masa;
    }

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    } 

    public double calcularDensidad() {
        return masa / volumen;
    }

    
    public void imprimirInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Cantidad de satélites: " + cantidadSatelites);
        System.out.println("Masa: " + masa);
        System.out.println("Volumen: " + volumen);
        System.out.println("Diámetro: " + diametro);
        System.out.println("Distancia al sol: " + distanciaAlsol);
        System.out.println("¿Es Observable?:" + esObservable);
        System.out.println("Densidad: " + calcularDensidad());
    }
  
}
