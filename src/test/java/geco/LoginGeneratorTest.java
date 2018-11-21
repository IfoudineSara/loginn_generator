package geco;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LoginGeneratorTest {
    LoginGenerator loginGenerator;
    LoginService loginService;
    @Before
    public void setUp() throws Exception {
        loginService = new LoginService(new String[] {"JROL",
                "BPER", "CGUR", "JDU", "JRAL", "JRAL1"});
        loginGenerator = new LoginGenerator(loginService);

    }

    @Test
    public void generateLoginForNomAndPrenom() {
        String prenom ="Paul";
        String nom = "Durand";
        String s = loginGenerator.generateLoginForNomAndPrenom(nom,prenom);
        loginService.addLogin(s);
        assertTrue(loginService.loginExists("PDUR"));
    }

    @Test
    public void CT2() {
        String prenom ="Jean";
        String nom = "Rolling";
        String s = loginGenerator.generateLoginForNomAndPrenom(nom,prenom);
        loginService.addLogin(s);
        assertTrue(loginService.loginExists("JROL1"));
    }

    @Test
    public void CT3() {
        String prenom = "Paul";
        String nom = "Dùrand";
        String s = loginGenerator.generateLoginForNomAndPrenom(nom, prenom);
        loginService.addLogin(s);
        assertTrue(loginService.loginExists("PDUR"));
    }

    @Test
    public void generateLoginForNomAndPrenom2() {
        String prenom ="John";
        String nom = "Ralling";
        String s = loginGenerator.generateLoginForNomAndPrenom(nom,prenom);
        loginService.addLogin(s);
        assertTrue(loginService.loginExists("JRAL2"));
    }
}