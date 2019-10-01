import unit2.MasMasTask19;
import unit2.MasMasTask36;
import unit2.MasTask19;

public class Main {
    public static void main(String args[]) {
        int[] mas = new int[]{1, 23, 122, -5, 12, 12, 12, 1, 1};

        MasTask19 obj19 = new MasTask19();
        System.out.println(obj19.task(mas));

        MasMasTask19 obj19mas= new MasMasTask19();
        int[][] duoMas;
        int n=10;
        duoMas=obj19mas.task(n);
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
               System.out.print(duoMas[i][j]);
            }
            System.out.println();
        }

        MasMasTask36 obj36= new MasMasTask36();
        double[][] result;
        result=obj36.task(duoMas);
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(result[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
