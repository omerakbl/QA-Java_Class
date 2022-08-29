package Test_Night_029.FacebookLogin;

import javax.jws.soap.SOAPBinding;

public class ChromeFacebook extends FacebookLogin{
    // get , set method will be inherited for this class
    // openbrowser, closebrowser setcredentials, gotofacebook will be inherited

@Override
public void openBrowser(){
    System.out.println("Chrome browser started");
}
}
