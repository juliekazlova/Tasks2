package unit2;

public class MasMasTask36 {
    public double[][] task(int[][] mas){
        double[][] result=new double[mas.length][mas.length];
        for(int i=1; i<mas.length-1; i++){
            for(int j=1; j<mas.length-1; j++){
                result[i][j]=(mas[i-1][j]+mas[i][j-1]+mas[i][j+1]+mas[i+1][j])/4;
            }
        }

        for(int i=0; i<mas.length; i++){
            result[0][i]=mas[0][i];
            result[mas.length-1][i]=mas[mas.length-1][i];
            result[i][0]=mas[i][0];
            result[mas.length-1][i]=mas[mas.length-1][i];
        }
        return result;
    }
}
