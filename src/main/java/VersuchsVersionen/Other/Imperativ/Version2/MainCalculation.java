package VersuchsVersionen.Other.Imperativ.Version2;

public class MainCalculation {
    public static JFrameConstructionV2 jFrameConstructionV2;
    private boolean left;
    private boolean right;
    private boolean up;
    private boolean down;

    public boolean getLeft() {
        return left;
    }
    public void setLeft(boolean left) {
        this.left = left;
    }
    public boolean getRight() {
        return right;
    }
    public void setRight(boolean right) {
        this.right = right;
    }
    public boolean getUp() {
        return up;
    }
    public void setUp(boolean up) {
        this.up = up;
    }
    public boolean getDown() {
        return down;
    }
    public void setDown(boolean down) {
        this.down = down;
    }


    public MainCalculation(){
        MainCalculation.jFrameConstructionV2.reset(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0);
    }

    public MainCalculation(boolean left, boolean right, boolean up, boolean down){
        this.left = left;
        this.right = right;
        this.up = up;
        this.down = down;
    }

    public void left(){
        jFrameConstructionV2.reset(1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1);
    }
}
