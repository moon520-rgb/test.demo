public class miGong {
    public static int step = 1;
    public static void main(String[] args){
        int [][] map=new int [8][7];
        for(int i=0;i<8;i++){
            for(int j=0;j<7;j++){
                if((i==0)||(j==0)||(i==7)||(j==6))
                    map[i][j]=0;
                else
                    map[i][j]=1;
            }
        }
        map[3][1]=0;
        map[3][2]=0;
        T myMigong=new T ();

        myMigong.findWay(map,1,1);
    }
}

class T{
    public static void findWay(int [][]map,int i,int j)
    {

        System.out.print("---------------------------------");
        if(i==6&&j==5)
        {
            System.out.println("经过了第"+(i+1)+"行"+","+"第"+(j+1)+"列");
            for(int a=0;a<8;a++) {
                for (int b = 0; b < 7; b++) {
                    System.out.print(map[a][b] + " ");
                }
                System.out.print("\n");
            }
            return ;
        }
        if(map[i+1][j]==1){
            //map[i+1][j]=2;
            findWay(map,i+1,j);
            System.out.println("经过了第"+(i+1)+"行"+","+"第"+(j+1)+"列");
            //map[i+1][j]=1;
        }
        else if(map[i][j+1]==1){
            //map[i][j+1]=2;
            findWay(map,i,j+1);
            System.out.println("经过了第"+(i+1)+"行"+","+"第"+(j+1)+"列");
            //map[i][j+1]=1;
        }
        else if(map[i-1][j]==1){
            //map[i-1][j]=2;
            findWay(map,i-1,j);
            System.out.println("经过了第"+(i+1)+"行"+","+"第"+(j+1)+"列");
            //map[i-1][j]=1;
        }
         else if(map[i][j-1]==1){
            //map[i][j-1]=2;
            findWay(map,i,j-1);
            System.out.println("经过了第"+(i+1)+"行"+","+"第"+(j+1)+"列");
            //map[i][j-1]=1;
        }
        else
            System.out.println("路走不通了");



    }
        }
