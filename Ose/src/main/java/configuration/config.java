package configuration;

import resources.CCluster;
import resources.CNamespace;

import java.util.ArrayList;

public class config {
    private final jsonparser cfg = new jsonparser();

    private String login;
    private String passwd;
    ArrayList<CCluster> clusters = new ArrayList<CCluster>();

    public void authData(){
        setLogin();
        setPasswd();
    }

    public void setClusters(config conf){
        jsonparser jp = new jsonparser();
        jp.getClusters(conf);
    }

    public void getClusters(){
        for (int i = 0; i < clusters.size(); i++){
            System.out.println(clusters.get(i).getClusterName());
            System.out.println(clusters.get(i).getClusterUri());
            System.out.println(clusters.get(i).getApi());
        }
    }

    public String getLogin() {return login;}

    public String getPasswd() {return passwd;}

    private void setLogin() {this.login = cfg.getLogin();}

    private void setPasswd() {this.passwd = cfg.getPasswd();}

    public void addCluster(CCluster cluster){clusters.add(cluster);}

}
