package resources;

public class CPod {
    String name;
    String status;
    CNamespace NS;
    int restarts = 0;

    public void newPod(String name, String status, CNamespace NS){
        this.name = name;
        this.status = status;
        this.NS = NS;
        NS.addPOD(this);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setRestarts(int restarts) {
        this.restarts = restarts;
    }

    public String getName() {
        return name;
    }

    public String getStatus() {
        return status;
    }

    public int getRestarts() {
        return restarts;
    }
}
