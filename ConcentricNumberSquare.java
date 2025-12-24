class ConcentricNumberSquare{
    static void patternConcentricNumberSquare (int n){
        for(int i=n;i>=1;i--){
            for(int j=n;j>=i;j--){
                System.out.print(j+" ");
            }
            for(int l=1;l<=(i-1)*2-1;l++){
                System.out.print(i+" ");
            }
            for(int k=i;k<=n;k++){
                if(k==1){
                    continue;
                }
                System.out.print(k+" ");
            }
            System.out.println();
        }
        for(int i=2;i<=n;i++){
           for(int j=n;j>=i;j--){
                System.out.print(j+" ");
            }
            for(int l=1;l<=(i-1)*2-1;l++){
                System.out.print(i+" ");
            }
            for(int k=i;k<=n;k++){
                if(k==1){
                    continue;
                }
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.println("ConcentricNumberSquare 2n-1 * 2n-1 ");
        patternConcentricNumberSquare(3);
        System.out.println("---------------------");
        
        patternConcentricNumberSquare(5);
    }
}
