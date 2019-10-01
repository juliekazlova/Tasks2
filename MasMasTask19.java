package unit2;

public class MasMasTask19 {
    public int[][] task(int n){
        if(n%2==1)return null;

        int[][] mas=new int[n][n];
        for(int i=0; i<n/2; i++){
            for(int j=i; j<n/2; j++){
                mas[i][j]=mas[i][n-1-j]=mas[n-1-i][j]=mas[n-1-i][n-1-j]=1;
            }
        }
        return mas;
    }
}
