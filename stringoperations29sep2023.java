//1) Salatations removal from the name
//2) Replacement of some special characters
//3) Removal of some characters
//4) Swapping certain names
//Total 7 steps mentioned in the below comments.

public class Main {
  public static void main(String[] args) {
    String string1 = "    Thambi      ";
    String string2 = "    Thambi        Subbaiah       ";
        
        //String string1="Thambi";
        //String string2="Thambi Subbaiah";

       // String string1="          Mr. Vinit Kumar      ";
//        String string2="     Vinitkumar       ";

        //1. trim the begin and end - spaces
        string1 = string1.trim();
        string2 = string2.trim();

       //2. replace any number of spaces with 1 space
       string1 = string1.replaceAll(" +", " ");
       string2 = string2.replaceAll(" +", " ");
       
       
    System.out.println(string1);
    System.out.println(string2);
    //3. replace single quote with null
    string1 = string1.replaceAll("\'","");
    string2 = string2.replaceAll("\'","");
    
    //4. replace hyphen with 1 space
    string1 = string1.replaceAll("-"," ");
    string2 = string2.replaceAll("-"," ");
    
    //5. replace . with 1 space
    string1 = string1.replace("."," ");
    string2 = string2.replace("."," ");
    
    

    String[] salutations = {"Miss", "Miss.", "Mr", "Mr.", "Mrs", "Mrs.", "Ms", "Ms."};
    
    string1 = string1.trim();
    
    //6. Salutation removal
    for(String name : salutations)
    {
         if (string1.startsWith(name)){
        	System.out.println(name);
            string1=string1.substring(name.length()).trim();
            break;
          }
         
    }
    
    for(String name : salutations)
    {
         if (string2.startsWith(name)){
        	System.out.println(name);
            string2=string2.substring(name.length()).trim();
            break;
          }
         
    }
    
    
     //find word length
     int string1wordlength = string1.split(" ").length;
     int string2wordlength = string2.split(" ").length;
   

     //7. logic for swapping
    if ((string1.replaceAll(" ", "").length() == string2.replaceAll(" ", "").length() && string1wordlength > string2wordlength) || (string1.replaceAll(" ", "").length() < string2.replaceAll(" ", "").length() && string1wordlength < string2wordlength)){
  	    string1 = string1 + string2;
        string2 = string1.substring(0, string1.length() - string2.length());
        string1 = string1.substring(string2.length());
     }
     
     
    
    System.out.println(string1);
    System.out.println(string2);


        
  }
}
