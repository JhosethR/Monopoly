
package Classes;


public class Inmobiliary {
    
    private Player owner;
    private String type;

    public Inmobiliary(Player owner, String type) {
        this.owner = owner;
        this.type = type;
    }

    public Inmobiliary() {
    }

    public Player getOwner() {
        return owner;
    }

    public void setOwner(Player owner) {
        this.owner = owner;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
