
package teststring;

public class TestString {

    public static void main(String [] args){

        String eyeTest ="\"Java study guide\"\n  by Scott and Jeane";
        System.out.println(eyeTest+"\n");

        //Java tiene los bloques de texto
        //que son una forma de crear cadenas de texto multilínea
        String blockTest ="""
                "Java study guide"
                    by Scott and Jeane
                """;
        System.out.println(blockTest+"\n");

		String piramid="""
		  *
		 * *
		* * *
		""";

		System.out.println(piramid+"\n");


        String blooString="""
                doe\
                deer
                """;
        System.out.println(blooString+"\n");


        String miString ="""
        saludos
        """;
        System.out.println("*"+miString+"*\n");


        String block = """
        	"doeeee\"\"\"
        	\"deeeeer\"""

        	""";

        System.out.println("*"+block+"*");


    }
}
