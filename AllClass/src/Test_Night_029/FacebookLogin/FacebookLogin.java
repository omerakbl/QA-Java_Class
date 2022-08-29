package Test_Night_029.FacebookLogin;

public class FacebookLogin {

    //try this with chrome, firefox  ,opera ,safari browsers
    //open browser    --- this step you will open different browsers
    //go to facebook -- you pass same url
    //pass credentials  -- you pass same credentials
    //end browser
    private String username;
    private String password;


    // shortcut for encapsulation
    //right click - generate - getter and setter

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public void openBrowser(){
        System.out.println("Browser started");
    }
    public void goToFacebook(){
        System.out.println("We are on the facebook login page");
    }

    public void passCredentials(String username , String password){
        setUsername(username);
        setPassword(password);

    }
    public void closeBrowser(){
        System.out.println("Browser is closed");
    }
}
