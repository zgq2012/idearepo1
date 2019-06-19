package cn.itcast;

import java.util.*;

public class DiuYang {
    public static void main(String[] args) {
        // 初始羊集合
        List list =new ArrayList<>();
        for (int i = 1; i <33 ; i++) {
            list.add(i);
        }
        // 丢羊集合
        List diuList = new ArrayList<>();

        while (true){
            // 余羊集合
            List yuList = new ArrayList<>();
            // 后不足7只羊先放置到集合
            for (int i = 0; i <list.size()-((list.size()/7)*7); i++) {
                yuList.add(list.get(i+((list.size()/7)*7)));
            }
            // 在安置前7倍数羊
            for (int i = 0; i <((list.size()/7)*7) ; i++) {
                // 每第七只羊放入丢羊集合
                if((i+1)%7==0){
                    diuList.add(list.get(i));
                }else{
                    yuList.add(list.get(i));
                }
                // 满16只就结束
                if(diuList.size()==16){
                    Collections.sort(diuList);
                    System.out.println(diuList);
                    return;
                }
            }
//            System.out.println(yuList);
            // 在给集合赋值
            list=yuList;
        }
//        System.out.println(list);

    }
    public void paixu2(){

    }
    public void paixu3(){

    }
}
