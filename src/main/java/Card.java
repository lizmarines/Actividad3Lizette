
public class Card {
    
    private String palo;
    private String color;
    private int valor;
    private int NumCarta;

public static final String[] tipoPalo = { "Treboles" , "Picas", "Corazones", "Diamantes"};
public static final int limiteCartas = 13;

    public Card(String palo, int valor) {
        this.palo = palo;
        this.color = asignarColor(palo);
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "La carta es: " + "palo=" + palo + ", color=" + color + ", valor=" + valor + '.';
    }


    public String asignarColor(String palo) {
            if (palo == "Corazones"|| palo=="Diamantes"){
                return  "Rojo";
                }
            else {
                return "Negro";
            }
            
    
           
    }
        
}
/*


/*
public void mostrarLaCarta() {

    System.out.print("La carta es un " + valor + " de " + palo +" color " + color + "");

    }
}
*/