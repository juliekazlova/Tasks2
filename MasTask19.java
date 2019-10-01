package unit2;

public class MasTask19 {
    public int task(int[] mas){
        int[] freq=new int[mas.length];
        int[] uniq=new int[mas.length];
        int uniqNumb=0;
        int cur;
        for(int i=0; i<mas.length; i++){//заполнение массива частот
            cur=mas[i];
            boolean isUniq=true;
            for(int j=0; j<uniqNumb; j++){
                if(cur==uniq[j]){
                    freq[j]++;
                    isUniq=false;
                    break;
                }
            }//проверка на уникальность
            if(isUniq){
                uniq[uniqNumb]=cur;
                freq[uniqNumb]++;
                uniqNumb++;
            }
        }

        int maxFreq=0;
        int[] maxFreqIndex=new int[uniqNumb];
        int maxFreqIndexNumb=0;
        for(int i=0; i<uniqNumb; i++){
            if(freq[i]>maxFreq){//выбор новой максимальной частоты
                maxFreq=freq[i];
                maxFreqIndex[0]=i;
                maxFreqIndexNumb=1;
            }
            else if(freq[i]==maxFreq){//совпадение по максамальной частоте
                maxFreqIndex[maxFreqIndexNumb]=i;
                maxFreqIndexNumb++;
            }
        }//определение максимальной частоты

        int minElem=Integer.MAX_VALUE;
        for (int i=0; i<maxFreqIndexNumb; i++){
            if(uniq[maxFreqIndex[i]]<minElem){
                minElem=uniq[maxFreqIndex[i]];
            }
        }
        return minElem;
    }
}
