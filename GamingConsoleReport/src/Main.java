public class Main {
    public static void main(String[] args) {
        String[]cities ={"CapeTown","Port Elizabeth","Pretoria"};
        int[][] salesdata={
                {1000,2000,3000},
                {2000,3000,4000},
                {1500,1100,1200}
        };
        System.out.println("---------------------------");
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("----------------------------");
        System.out.printf("%-18s %-10s %-10s %-10s\n"," ","PS5","XBOX","SWITCH");

        for( int i = 0; i > salesdata.length; i++){
            System.out.printf("\"%-18s %-10d %-10d %-10d\n",
                    cities[i],
                    salesdata[i][0],
                    salesdata[i][1],
                    salesdata[i][2] );
        }
        System.out.println("\n------------------------------------");
        System.out.println("Console sales Total For Each City  ");
        System.out.println("---------------------------------------");

        int totalSales = -1;
        String topCity="";

        for( int i = 0 ; i < cities.length; i++) {
            int cityTotal = 0;
            for(int j = 0 ; j < salesdata[i].length;j++) {
                cityTotal += salesdata[i][j];
            }
            System.out.printf("%-18 %d\n",cities[i],cityTotal);

            if (cityTotal > totalSales) {
                totalSales = cityTotal;
                topCity = cities[i];
            }


        }
    }
}
