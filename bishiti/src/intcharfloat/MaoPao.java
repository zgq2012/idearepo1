package intcharfloat;

import java.util.Arrays;
import java.util.Date;

// 简单的冒泡排序
public class MaoPao {
    public static void main(String[] args) {
        // 随机给出一个数组
        int[] arr={21,32,4,25,633,32,4,25};
        // 创建时间对象，记录排序耗时
        // 1、调用冒泡排序方法
       /* long time1 =new Date().getTime();
        maopao(arr);
        long time2 = new Date().getTime();
        System.out.println("冒泡排序耗时："+(time2-time1));
        // 输出
        System.out.println(Arrays.toString(arr));*/

        // 2、调用插入排序,
        long time3 = new Date().getTime();
        chaRuSort(arr);
        long time4 = new Date().getTime();
        System.out.println("插入排序耗时："+(time4-time3));
        // 输出
        System.out.println(Arrays.toString(arr));

        // 3、调用选择排序，每一次选择数组中最小的值，放到前面，选择次数n-1，比较次数
        // 优势，不占用额外的内存空间，数据规模越小越好
        /*long time5 = new Date().getTime();
        selectSort(arr);
        long time6 = new Date().getTime();
        System.out.println(time6);
        System.out.println("选择排序耗时："+(time6-time5));
        System.out.println(Arrays.toString(arr));*/
    }

    // 创建一个选择排序，每次一个循环，找到最小值然后放到前面（交换），依次执行
    private static int[] selectSort(int[] arr) {
        System.out.println("selectSort:"+Arrays.toString(arr));
        // 循环次数n-1次
        for (int i = 0; i <arr.length-1 ; i++) {
            // 定义遍量记录最小值的索引
            int min=i;
            // 开始循环往后面比较n-i次，次数由j的初始值来控制，比较到最后一个值，故j <arr.length
            for (int j = i+1; j <arr.length ; j++) {
                // 与记录的最小值判断大小
                if(arr[min]>arr[j]){
                    // 如果大于就进行索引交换
                    min=j;
                }
            }
            // 每此循环完之后将最小值放到前面去，即将min的值与当前i的值交换
            if(i!=min){
                int tmp=arr[i];
                arr[i]=arr[min];
                arr[min]=tmp;
            }
        }
        return arr;
    }

    // 创建一个插入排序，每一个循环进行与前面排好序的队列比较，插入在应当的位置
    private static int[] chaRuSort(int[] arr) {
        System.out.println("chaRuSort:"+Arrays.toString(arr));
        // 遍历数组循环找出最小值，插入排序循环次数位n-1
        for (int i = 1; i <arr.length ; i++) {
            // 记录该次循环中的比较值，即要插入的值
            int temp=arr[i];
            // 循环前i个数，进行比较，准备插入值
            int j=i;
            // 从前面拍好序的最后开始逐一往前面比较
            while(j>0&&temp<arr[j-1]){
                // 前面的大于后面就进行赋值交换，即当前索引位的值替换位前一索引位的值
                arr[j]=arr[j-1];
                // 然后使j--，直到j=0；
                j--;
            }
            // 最后通过j与i判断，前面的元素是否有小于当前arr[i]的，
            if(j!=i){
                // 不等于就代表存在交换，
                arr[j]=temp;
            }
        }
        return arr;
    }

    // 创建一个冒泡排序方法，遍历数组，每个元素从左往右逐一比较
    private static int[] maopao(int[] arr) {
        // 定义一个中间变量，交换
        int temp;
        // 定义一个变量来展示数组剩余的元素是否已经是排序好的,如果排完序最后显示为true
        boolean status=true;
        // 冒牌排序循环次数，为n-1次，
        for (int i = 1; i <arr.length ; i++) {
            // 在每一个元素的循环里，进行逐次比较，次数n-i次
            for(int j=0;j<arr.length-i;j++){
                // 判断相邻元素大小
                if(arr[j]>arr[j+1]){
                    // 如果前一位的元素大于后一位的元素就执行交换
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    // 执行一次交换就表示要排序
                    status=false;
                }
            }
            if(status){
                // 表示该次循环没有进行过交换，即已经是排序好的
                break;
            }
        }
        return arr;
    }
    // 添加
    public void paixu(){}
    //
    public void paixu2(){
        paixu();
    }
    public void paixu3(){
        paixu();
    }
}
