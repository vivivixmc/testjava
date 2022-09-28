package resources;


import java.util.ArrayList;

public class CNamespace {
    public String name;
    public CCluster cluster;
    ArrayList<CDeployConfig> CDC = new ArrayList<CDeployConfig>();
    ArrayList<CDeployment> CD = new ArrayList<CDeployment>();
    ArrayList<CPod> CP = new ArrayList<CPod>();

    public void newNS(String name, CCluster cluster){
        this.name = name;
        this.cluster = cluster;
        cluster.addNS(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String showAllPods(){
        String buffer = "";
        for (int i = 0; i < CP.size(); i++){

            buffer+= CP.get(i).getName().toString() + "\n";}
        return buffer;
    }

    public void addPOD(CPod pod){
        CP.add(pod);
    }
}
