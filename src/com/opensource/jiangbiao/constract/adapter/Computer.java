package com.opensource.jiangbiao.constract.adapter;

public class Computer {


    //设置插座
    Socket socket;

    public void setSocket(Socket socket){
        this.socket = socket;
    }

    public void start(){
        if(socket.getPin()==3){

            System.out.println("电脑：我需要2个引脚的插线板");
        }else if(socket.getPin()==2){
            socket.provideElectricity();
            System.out.println("电脑：我得到了2个引脚的插线板");
            System.out.println("电脑：我插上电开始启动了");
        }
    }
}
