package javaSE.CArray;

import java.util.Arrays;

public class MyArray {

    public static double[] reverse(double[] array){

        double[]  result =new double[array.length];
        for(int i=0;i<array.length;i++){
            result[array.length-1-i] =array[i];
        }
            return result;
    }
    public static void main(String[] args) {
        int[] a = {1,2,34,5,6,7};
        System.out.println(a.length);

        int[][] av = {{1,2},{3,4},{5,6}};
        System.out.println(Arrays.deepToString(av));
        int size = 8;

        double[] mylist = new double[size];
        mylist[0] = 3.14;
        mylist[1] = 3.45;
        mylist[2] = 4.56;
        mylist[3] = 3.67;
        mylist[0] = 1.14;
        mylist[1] = 2.45;
        mylist[2] = 5.56;
        mylist[3] = 88.67;

        double[] tem = MyArray.reverse(mylist);
        for(double t:tem)
            System.out.print(t +" ");

        System.out.println("---:"+Arrays.toString(tem));


        String str2[][] = new String[2][2];
        str2[0] = new String[2];
        str2[0][0] = new String("123");
        str2[0][1] = new String("456");
        str2[1] = new String[2];
        str2[1][0] =new String("789");
        str2[1][1] =new String("012");

        String str3[][] = {{"23","45"},{"34","sf"},{"34","afs"}};
        System.out.println("str3:"+Arrays.deepToString(str3));

        int[] arr = new int[4];
        Arrays.fill(arr,0);

        //一位数组输出
        System.out.println(Arrays.toString(arr));;

        //二维数组输出
        System.out.println(Arrays.deepToString(str2));

        Arrays.sort(mylist);

        System.out.println(Arrays.toString(mylist));

        //数组查找
        System.out.println(Arrays.binarySearch(mylist,2));





    }



}
