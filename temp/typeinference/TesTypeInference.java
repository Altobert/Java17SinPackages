package typeinference;
import typeinference.PileOfPapersToFileInFilingCabinet;

public class TesTypeInference {

    public static void main(String[] args) {

        // Using 'var' for local variable type inference
        String message = "Testing type inference with 'var' in Java.";
        var pile = new PileOfPapersToFileInFilingCabinet(message);        
        pile.setNamePaper("ImportanteSII-1");
        pile.addPaper("Document 1");
        pile.setNamePaper("ImportanteSII-2");
        pile.addPaper("Document 2");
        pile.showPapers();
        System.out.println("A pile of papers has been created."+pile.toString());

    }

}
