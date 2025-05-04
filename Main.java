public class Main{
    public static void main(String[] args){
    System.out.println(Data.MAX);
    Data d = new Data(7, 5);
    System.out.println(d);
    d.repopulate();
    System.out.println(d);
    int[][]grid={{10,50,40},{20,40,20},{30,50,30}};
    Data q = new Data(grid);
    System.out.println(q.countIncreasingCols()); //case 1
    int[][]grid2 = {{10,540,440,440},{220,450,440,190}};
    Data p = new Data(grid2);
    System.out.println(p.countIncreasingCols()); //case 2
    } 
}