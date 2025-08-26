package varsample;
public class Zoo {

    static java.util.logging.Logger log = java.util.logging.Logger.getLogger(Zoo.class.getName());
    public static void main(String[] args) {


	       //en este punto me encuentro imprimiendo todo lo que le pase
        /*for(int i=0; i<args.length; i++) {
           log.info(args[i]);
        }*/
    		/*
    			con esto estamos realizando que solo se lea el argumento 0 y 1
    			si pasamos otro argumento, la aplicacion se va a caer por que sobrepasaremos
    			el indice del arreglo de string o argumentos :;)
    		*/
		     log.info(args[0]);
		     log.info(args[1]);

          // Puedes agregar más lógica aquí para manejar otros animales o interacciones
    }

    public void whatTypeAmi(){
      var name ="Alberto";
      var size = 7;
    }

}
