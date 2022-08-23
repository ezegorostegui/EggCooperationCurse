package exercise02;

/**
 *  Clase Jugador: esta clase posee los siguientes atributos: id (representa el número del
 *  * jugador), nombre (Empezara con Jugador más su ID, “Jugador 1” por ejemplo) y mojado (indica
 *  * si está mojado o no el jugador). El número de jugadores será decidido por el usuario, pero
 *  * debe ser entre 1 y 6. Si no está en este rango, por defecto será 6.
 *  * Métodos:
 *  * • disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de
 *  * mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el
 *  * revolver tira el agua, el jugador se moja. El atributo mojado pasa a false y el método
 *  * devuelve true, sino false.
 */
public class Player {
    private int idPlayer;
    private String name;
    private boolean wet;
    private WaterGun watergun;


    public Player(int idPlayer, String name, boolean wet, WaterGun watergun){
        this.idPlayer = idPlayer;
        this.name = name;
        this.wet = wet;
        this.watergun = watergun;
    }
    public Player(){}

    public int getIdPlayer() {
        return idPlayer;
    }
    public void setIdPlayer(int idPlayer) {
        this.idPlayer = idPlayer;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public boolean isWet() {
        return wet;
    }
    public void setWet(boolean wet) {
        this.wet = wet;
    }

    public void shoot(WaterGun WaterGun){


    }
}
