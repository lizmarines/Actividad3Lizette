import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Iterator;
import static java.util.Spliterators.iterator;
import java.util.Stack;
    

public class Deck {
    
    private Card cartas[];
    private List<Card> cardslist =new ArrayList<>();
    private int posSiguienteCarta;
    private int cartasQueHanSalido=0;
    private int cartaRandomMostrada;
//    private int [] cartasHand = new int [4];
    private int cartasHand[];
    private int numeroAleatoriopick;
    
    public static final int numCartas=52;
    
    public Deck(){
        this.cartas = new Card[numCartas];
        //this.posSiguienteCarta = 0;
        crearDeck();
        shuffle();
    }

    
    private void crearDeck(){
        String[] palos = Card.tipoPalo;
        int contadorCartasCreadas=0;
        
        for (int i=0; i<palos.length;i++){
            for (int j=0; j < Card.limiteCartas ; j++){
                cartas[contadorCartasCreadas] = new Card(palos[i],j+1);
                ++contadorCartasCreadas;
                }
        }
    }
    
    public void shuffle(){
          
        /*
        int cartaAleatoria = 0;
        Card c;
        
        for (int i=0; i<cartas.length;i++) {
            cartaAleatoria = generaNumeroEnteroAleatorio(0,numCartas-1);
            c= cartas[i];
            cartas[i] = cartas[cartaAleatoria];
            cartas[cartaAleatoria] = c;
            System.out.println("Al tomar la primera carta del deck sale "+ cartas[i]);
        */
        
        //*Card[] intArray = cartas;
        cardslist = Arrays.asList(cartas);
        Collections.shuffle(cardslist);
        cardslist.toArray(cartas);
        //System.out.println(cardslist.size());
        System.out.println("Se mezclo el Deck, iniciamos con 52 cartas");
        //cardslist.remove(Integer.valueOf(1));        
        //cardslist.remove(cartas[0]);
       // System.out.println(cardslist.size());
      
      
    }
    
     public void head(){
        System.out.println("Al tomar la primera carta del deck sale "+ cartas[0]);
           int Cartasquedan=0;
       System.out.println("Quedan " +( numCartas-cartasQueHanSalido) + " cartas");
       cartasQueHanSalido++;
        //cardslist.remove(Integer.valueOf(1));        
        //cardslist.remove(1);
        //System.out.println(cardslist.size());
        
        }
     
       public void pick(){
        //int numeroAleatoriopick=0;
        int numeroAleatoriopick = (int)(Math.random()*52+1);
        System.out.println("Al tomar una carta random del deck " + cartas[numeroAleatoriopick]);
        cartaRandomMostrada=numeroAleatoriopick;
        cartasQueHanSalido++;
        System.out.println("Quedan " +( numCartas-cartasQueHanSalido) + " cartas");
        
       }
       
       public void hand(){
          System.out.println("Se dara un juego, son 5 cartas: ");
          int pos;
            int nCartas = 52;
            Stack < Integer > pCartas = new Stack < Integer > ();
            for (int i = 0; i < 5 ; i++) {
                
              pos = (int) Math.floor(Math.random() * nCartas );
              if (pos != numeroAleatoriopick && pos!=0) {
              while (pCartas.contains(pos)) {
                pos = (int) Math.floor(Math.random() * nCartas );
              }
              }
              pCartas.push(pos);
              System.out.println("Carta de tu mano es "+ cartas[pos]);
              cartasQueHanSalido++;
              
            
            
            }
            System.out.println("Quedan " +( numCartas-cartasQueHanSalido) + " cartas");
       }
}
       
     

/* System.out.println("Núm. aleatorios sin repetición:");
            System.out.println(pCartas.toString());
          
do int numerorandom = (int)(Math.random()*52+1);
           
           while (cartasHand=cartaDada null){

int cartaAleatoria = 0;
        Card c;
        
        for (int i=0; i<cartas.length;i++) {
            cartaAleatoria = generaNumeroEnteroAleatorio(0, numCartas - 1);
            c= cartas[i];
            cartas[i] = cartas[cartaAleatoria];
            System.out.println(cartas[cartaAleatoria]);
        }
     /*   
       int cartaAleatoria = 0;
        Card c;
        
        for (int i=0; i<cartas.length;i++) {
            cartaAleatoria = generaNumeroEnteroAleatroio();
            c= cartas[i];
            cartas[i] = cartas[cartaAleatoria];
            //return cartas[cartaAleatoria];
            System.out.println("Al tomar la primera carta del deck sale "+ cartas[i]);
        }
              
    
    }

   
        public Int numeroDeCartas(int){
        
        return numCartas-posSiguienteCarta;
        
    }    
    
    
      private int generaNumeroEnteroAleatroio(int 0,int 51) {
        int num=(int)Math.floor(Math.random()*(0-(51+1))+(51+1));
        return num;
        }
    */    
       
    
    
    
