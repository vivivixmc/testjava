package resources;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CCluster {
    public String Name;
    public String Uri;
    ArrayList<CNamespace> NS = new ArrayList<CNamespace>();


    public void NewCluster(String Name, String Url){
        this.Name = Name;
        this.Uri = Url;
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

