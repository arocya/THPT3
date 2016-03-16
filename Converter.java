package THPT3;


/**
 * Converter class houses the Converter method which changes digits 0-9 in strings
 * to the string form of the number.  A seperate if is used for the first character
 * to make it uppercase.  This also solved the issue with having to check each character 
 * before and after the one being tested.  When you set the for loop to check every character
 * and had statements to check i-1 and i+1 it would immediately throw an error because it
 * can't check i at -1.  By using the seperate if for the first character the for loop can 
 * start at 1 and therfore check digits 0 and 2 to make sure it is not a double digit number.
 * 
 * @author Arion Almond     Lab: L06     
 * @version 2/19/2014
 */
public class Converter
{

    private StringBuilder stbrLines;
    private String stringLines;
    
    /**
     * 
     * Constructor method used to convert the StringBuilder.  This method reads
     * in to arguments wich are a string and a StringBuilder.  
     * @param String - the value of the string
     * @param StringBuilder - the value of the StringBuilder
     * 
     */
    
    public void Converter(String lines, StringBuilder cLines)
    {
        if(Character.isDigit(cLines.charAt(0)))//seperate if for the character at the 0 position
            {
                 switch(cLines.charAt(0))
                {
                    case '0': cLines.replace(0,1,"Zero");  //sets the first character to the correct string and uppercases the first letter
                        break;
                    case '1': cLines.replace(0,1,"One");
                        break;
                    case '2': cLines.replace(0,1,"Two");
                        break;
                    case '3': cLines.replace(0,1,"Three");
                        break;
                    case '4': cLines.replace(0,1,"Four");
                        break;
                    case '5': cLines.replace(0,1,"Five");
                        break;
                    case '6': cLines.replace(0,1,"Six");
                        break;
                    case '7': cLines.replace(0,1,"Seven");
                        break;
                    case '8': cLines.replace(0,1,"Eight");
                        break;
                    case '9': cLines.replace(0,1,"Nine");
                        break;
                        
                   
                }
                
            
            }
            
            for(int i = 1 ; i < lines.length() ; i++)// this for is used to check the remaining characters after the first character
            {
                if(Character.isDigit(cLines.charAt(i)))
                {   
                      if(Character.isSpaceChar(cLines.charAt(i+1))&& Character.isSpaceChar(cLines.charAt(i-1)))//if statement to make sure its not a double digit
                      {
                            switch(cLines.charAt(i))
                            {
                                case '0': cLines.replace(i,i+1,"zero");//statements for switch to change digits to strings lowercase
                                    break;
                                case '1': cLines.replace(i,i+1,"one");
                                    break;
                                case '2': cLines.replace(i,i+1,"two");
                                    break;
                                case '3': cLines.replace(i,i+1,"three");
                                    break;
                                case '4': cLines.replace(i,i+1,"four");
                                    break;
                                case '5': cLines.replace(i,i+1,"five");
                                    break;
                                case '6': cLines.replace(i,i+1,"six");
                                    break;
                                case '7': cLines.replace(i,i+1,"seven");
                                    break;
                                case '8': cLines.replace(i,i+1,"eight");
                                    break;
                                case '9': cLines.replace(i,i+1,"nine");
                                    break;
                                    
                               
                            }
                      }
                }
            }    
            
        stbrLines = cLines;
        stringLines = lines;
    }
    
    /**
     * This method has no arguments and returns the converted string and
     * StringBuilder from the Converter method/constructor.
     * @return - the values for the String and StringBuilder
     */
    public StringBuilder getConvert()//returns the converted string
    {
        return stbrLines;
    }
}
