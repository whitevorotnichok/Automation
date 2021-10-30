package CMSOIL;

public class Delivery {
    public static void main(String[] args) {

        int[] newOilLevel = {0,0,0,0,0};
        int oilLevel = 30;
        int[][] spent = {{15,10,20,15,15},
                      {12,15,10,15,15}};
        int[] del = {20,20,0,20,0};

        for (int row=0; row< spent[0].length; row++)
        {
             for (int col=0; col< spent[1].length; col++)
             {
                 oilLevel=spent[0][row];
                 spent[0][row]=spent[1][col];
                 spent[1][col]=oilLevel;
             }
        }
        for(int )
        System.out.println();







        for (int i=0; i<newOilLevel.length; i++){
        System.out.print(spent[i]+" ");}




    }

}
