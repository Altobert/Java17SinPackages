package typeinference;

import java.util.ArrayList;
import java.util.List;

public class PileOfPapersToFileInFilingCabinet {
    // attributes variables 
    static List<String> papers = new ArrayList<>();
    private String namePaper;

    //constructor
    public PileOfPapersToFileInFilingCabinet(String namePaper) {        
        System.out.println(" A pile of papers to file in a filing cabinet has been created. ");
    }

    public void addPaper(String paper) {
        papers.add(paper);
    }

    public void removePaper(String paper) {
        papers.remove(paper);
    }

    public void clearPapers() {
        papers.clear();
    }

    public void setNamePaper(String namePaper) {
        this.namePaper = namePaper;
    }

    public String getNamePaper() {
        return namePaper;
    }

    // show papers
    public void showPapers() {
        for (String paper : papers) {
            System.out.println(" Paper: " + paper);
        }
    }

    @Override
    public String toString() {
        return " PileOfPapersToFileInFilingCabinet [papers=" + papers + ", namePaper=" + namePaper + "]";
    }   
 
}
