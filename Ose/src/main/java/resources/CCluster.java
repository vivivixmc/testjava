package resources;

import java.util.ArrayList;

public class CCluster {
    public String Name;
    public String Uri;
    public String Api;
    ArrayList<CNamespace> NS = new ArrayList<CNamespace>();

    public String getApi() {
        return Api;
    }

    public void setApi(String api) {
        this.Api = api;
    }

    public CCluster NewCluster(String Name, String Url, String Api){
        this.Name = Name;
        this.Uri = Url;
        this.Api = Api;
        return null;
    }

    public String getClusterName(){
        return this.Name;
    }

    public String getClusterUri() {
        return Uri;
    }

    public void showAllNS(){
        for (int i = 0; i < NS.size(); i++)
            System.out.println(NS.get(i).getName());
    }

    public void showAllPods(){
        for (int i = 0; i < NS.size(); i++)
            System.out.println(NS.get(i).showAllPods());
    }

    public void addNS(CNamespace NameSpace){
        NS.add(NameSpace);
    }
}

