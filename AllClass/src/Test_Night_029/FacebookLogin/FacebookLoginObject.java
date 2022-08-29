package Test_Night_029.FacebookLogin;

public class FacebookLoginObject {

    public static void main(String[] args) {
        // login with chrome

        ChromeFacebook chromeFacebook = new ChromeFacebook();
        chromeFacebook.openBrowser();
        chromeFacebook.goToFacebook();
        chromeFacebook.passCredentials("Lucas","12312321");
        chromeFacebook.getUsername(); // encapsulation
        chromeFacebook.getPassword(); // encapsulation
        chromeFacebook.closeBrowser();

        FireFoxFacebook firefoxFacebok = new FireFoxFacebook();
        firefoxFacebok.openBrowser();
        firefoxFacebok.goToFacebook();
        firefoxFacebok.passCredentials("Lucas","12312321");
        firefoxFacebok.getUsername(); // encapsulation
        firefoxFacebok.getPassword(); // encapsulation
        firefoxFacebok.closeBrowser();

        SafariFacebook safariFacebook = new SafariFacebook();
        safariFacebook.openBrowser();
        safariFacebook.goToFacebook();
        safariFacebook.passCredentials("Lucas","12312321");
        safariFacebook.getUsername(); // encapsulation
        safariFacebook.getPassword(); // encapsulation
        safariFacebook.closeBrowser();
    }

}
