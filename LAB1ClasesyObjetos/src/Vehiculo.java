
/**
 * Una clase para representar vehículos y su funcionamiento simplificado.
 * Cada vehículo está determinado por un conjunto de características físicas
 * y atributos de funcionamiento.
 *
 * @version 1.0, 18/04/22
 * @author Pamela Gatica
 */
public class Vehiculo {

    private String patente;
    private String marca;
    private String modelo;
    private int velocidad;
    private int marcha;
    private int velocidadMax;
    private int marchaMax;

    /**
     * Constructor por defecto. Velocidad inicial del vehículo es inicializada
     * en 0. Marcha inicial del vehículo es inicializada en 0. Velocidad máxima
     * es definida en 140 km/hr y marcha máxima es definida en 5 ambas por
     * defecto.
     */
    public Vehiculo() {
        this.velocidad = 0;
        this.marcha = 0;
        this.velocidadMax = 140;
        this.marchaMax = 5;
    }

    /**
     * Constructor personalizado. Velocidad inicial del vehículo es inicializada
     * en 0. Marcha inicial del vehículo es inicializada en 0. Velocidad máxima
     * del vehículo y marcha máxima es asignada
     *
     * @param velocidadMax Velocidad máxima del vehículo
     * @param marchaMax Cantidad de marchas del vehículo
     */
    public Vehiculo(int velocidadMax, int marchaMax) {
        this.velocidadMax = velocidadMax;
        this.marchaMax = marchaMax;
    }

    /**
     * Accesador patente
     *
     * @return patente
     */
    public String getPatente() {
        return patente;
    }

    /**
     * Mutador patente
     *
     * @param patente
     */
    public void setPatente(String patente) {
        this.patente = patente;
    }

    /**
     * Accesador marca
     *
     * @return marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Mutador marca
     *
     * @param marca
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Accesador modelo
     *
     * @return modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Mutador modelo
     *
     * @param modelo
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * Accesador velocidad
     *
     * @return velocidad
     */
    public int getVelocidad() {
        return velocidad;
    }

    /**
     * Accesador marcha
     *
     * @return marcha
     */
    public int getMarcha() {
        return marcha;
    }

    /**
     * Accesador velocidadMax
     *
     * @return velocidadMax
     */
    public int getVelocidadMax() {
        return velocidadMax;
    }

    /**
     * Mutador velocidadMax
     *
     * @param velocidadMax
     */
    public void setVelocidadMax(int velocidadMax) {
        this.velocidadMax = velocidadMax;
    }

    /**
     * Accesador marchaMax
     *
     * @return marchaMax
     */
    public int getMarchaMax() {
        return marchaMax;
    }

    /**
     * Mutador marchaMax
     *
     * @param marchaMax
     */
    public void setMarchaMax(int marchaMax) {
        this.marchaMax = marchaMax;
    }

    /**
     * Aumenta la velocidad en 10 km/hr.
     */
    public void acelerar() {
        if (this.marcha != 0) {
            int nuevaVelocidad = this.velocidad + 10;
            if (nuevaVelocidad <= this.velocidadMax) {
                this.velocidad = nuevaVelocidad;
            } else {
                this.velocidad = this.velocidadMax;
            }
        }

    }

    /**
     * Disminuye la velocidad en 5 km/hr.
     */
    public void frenar() {
        int nuevaVelocidad = this.velocidad - 5;
        if (nuevaVelocidad > 0) {
            this.velocidad = nuevaVelocidad;
        } else {
            this.velocidad = 0;
        }
    }

    /**
     * Sube una marcha
     */
    public void subirMarcha() {
        if (this.marcha < this.marchaMax) {
            this.marcha++;
        }
    }

    /**
     * Baja una marcha
     */
    public void bajarMarcha() {
        if (this.marcha > -1) {
            this.marcha--;
        }
    }

    /**
     * Pone la marcha indicada
     *
     * @param marcha marcha a poner (entre -1 a marchaMax)
     */
    public void ponerMarcha(int marcha) {
        if (marcha >= -1 && marcha <= this.marchaMax) {
            this.marcha = marcha;
        }
    }

    public String getMarchaString() {
        switch (this.marcha) {
            case -1:
                return "Reversa";
            case 0:
                return "Neutro";
            case 1:
                return "Primera";
            case 2:
                return "Segunda";
            case 3:
                return "Tercera";
            case 4:
                return "Cuarta";
            case 5:
                return "Quinta";
            case 6:
                return "Sexta";
            default:
                return "Error";
        }
    }

    /**
     * Información del vehículo
     *
     * @return Cadena con información del vehículo en formato solicitado
     */
    public String getInfo() {
        return "\n" + this.marca + " " + this.modelo + " patente: " + this.patente
                + "\nVelocidad: " + this.velocidad + " km/hr  Marcha: " + this.getMarchaString();
    }
}
