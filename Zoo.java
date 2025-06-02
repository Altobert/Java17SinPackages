
public class Zoo {
    public static void main(String[] args) {

        java.util.logging.Logger log = java.util.logging.Logger.getLogger(Zoo.class.getName());                
	//en este punto me encuentro imprimiendo todo lo que le pase
        /*for(int i=0; i<args.length; i++) {
           log.info(args[i]);             
        }*/            
	log.info(args[0]);             
	log.info(args[1]); 
        // Puedes agregar más lógica aquí para manejar otros animales o interacciones
    }
}
