package multiplevariables;

public class Multiplevar {

    public Multiplevar(){

    }

    void sandFence(){
		//valores declarados
        try {
         String s1 , s2;

		//valores inicializados
		String s3=null, s4 = "capicua";
        
        // no se puede usar si no se encuentra inicializada.
        //System.out.println("s1: " + s1  + " s2: " + s2);

        System.out.println("s3: " + s3  + " s4: " + s4);
        System.out.println("no hay error declarar string y no inicializarlos");   
        } catch (Exception e) {
            // TODO: handle exception
        }		

	}

    void paintFence(){
		int i1, i2, i3=0;
        //no se puede usar si no se encuentra inicializada.
        //System.out.println("i1: " + i1  + " i2: " + i2 + " i3: " + i3);
        System.out.println("i3: " + i3);
	}

    public static void main(String[] args) {
        Multiplevar mv = new Multiplevar();
        System.out.println(Multiplevar.class.getName());
        // valla de arena
        mv.sandFence();

        //pintar la valla
        mv.paintFence();
    }
    

}
