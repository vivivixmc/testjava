package configuration;

import resources.CCluster;
import resources.CNamespace;

import java.util.ArrayList;

public class config {
    String login;
    String passwd;
    ArrayList<CCluster> NS = new ArrayList<CCluster>();

    private final configparser cfg = new configparser();
    public String getLogin() {return login;}

    public void setLogin(String login) {this.login = cfg.getLogin();}

    public String getPasswd() {return passwd;}

    public void setPasswd(String passwd) {this.passwd = cfg.getPasswd();}
}
