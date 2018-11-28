// http://www.zentut.com/java-swing/simple-login-dialog/

//First, we develop a login module that authenticate user based on username and password. To make it simple, we hard-code the username and password in this module. You can use different methods such as reading user’s information from database or file.

package traitements;
 
public class authentification {
 
    public static boolean authenticate (String nomutilisateur, String mdp) 
    {
        // hardcoded nomutilisateur and mdp
        if (nomutilisateur.equals("bob") && mdp.equals("secret"))
        {
            return true;
        }
        return false;
    }
}