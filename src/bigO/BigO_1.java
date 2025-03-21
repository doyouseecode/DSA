package bigO;

public class BigO_1 {
    public static void main(String[] args) {
        String[] nemo = new String[]{"nemo"};
        findNemo(nemo);
    }

    public static void findNemo(String[] nemo ){
        for (int i = 0; i < nemo.length; i++){
            if (nemo[i].equals("nemo")){
                System.out.println("Found nemo!");
            }
        }

    }
}
