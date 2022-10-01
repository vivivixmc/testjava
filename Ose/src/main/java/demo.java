
import configuration.config;
import configuration.jsonparser;
import resources.CCluster;
import resources.CNamespace;
import resources.CPod;

public class demo {
    public static void main(String[] args) {

        config asd = new config();
        asd.authData();
        asd.setClusters(asd);
        asd.getClusters();



//        CCluster PROMM = new CCluster();
//        PROMM.NewCluster("Prom-M","https://google.com");
//
//        CNamespace AA = new CNamespace();
//        AA.newNS("AA",PROMM);
//        CPod AAaa = new CPod();
//        AAaa.newPod("AAaa","ok",AA);
//        CPod AAbb = new CPod();
//        AAbb.newPod("AAbb","ok",AA);
//        CPod AAcc = new CPod();
//        AAcc.newPod("AAcc","ok",AA);
//
//        CNamespace BB = new CNamespace();
//        BB.newNS("BB",PROMM);
//        CPod BBaa = new CPod();
//        BBaa.newPod("BBaa","ok",BB);
//
//        PROMM.showAllNS();
//        System.out.println(AA.showAllPods());
//        PROMM.showAllPods();



    }
}
