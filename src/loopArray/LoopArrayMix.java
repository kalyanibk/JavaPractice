package loopArray;

public class LoopArrayMix {

	public static void main(String[] args) {
		int[] savingAmount= new int[10];
		
		        savingAmount[0]=230000;
				savingAmount[1]=300000;
				savingAmount[2]=450000;
				savingAmount[3]=50000;
				savingAmount[4]=264000;
				savingAmount[5]=210000;
				savingAmount[6]=60000;
				savingAmount[7]=654000;
				savingAmount[8]=800000;
				savingAmount[9]=2000;
				
				for(int i=0;i<10;i++) {
					if(savingAmount[i]>=200000) {
					System.out.println("Insert to database-->"+savingAmount[i]);
				}
				}
	}

}
