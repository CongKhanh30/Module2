package algorithm.boiChungNhoNhat;

import algorithm.uocChungLonNhat.TimUocChungLonNhat;

public class TimBoiChungNhoNhat extends TimUocChungLonNhat {
    public static int timBCNN(int a, int b) {
        int ucln = timUCLN(a, b);
        int bcnn = (a * b) / ucln;
        return bcnn;
    }

}
