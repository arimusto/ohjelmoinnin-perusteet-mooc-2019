/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ari
 */
public class StringUtils {
    
    public static boolean sisaltaa(String sana, String haettava) {
        
        String thisSana = sana.toUpperCase().trim();        
        String thisHaettava = haettava.toUpperCase().trim();
        
        return thisSana.contains(thisHaettava);
    }
}
