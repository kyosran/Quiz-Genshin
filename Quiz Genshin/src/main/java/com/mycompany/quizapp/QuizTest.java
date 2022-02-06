/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.quizapp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;


/**
 *
 * @author 91868
 */
public class QuizTest extends JFrame implements ActionListener {
    JLabel label;
    JRadioButton radioButtons[]=new JRadioButton[5];
    JButton btnNext,btnResult;
    ButtonGroup bg;
    int count=0,current=0,x=1,y=1,now=0;
    int m[]=new int[10];
    
    QuizTest(String s){
    super(s);
    label = new JLabel();
    add(label);
    bg=new ButtonGroup();
    for (int i=0;i<5;i++){
        radioButtons[i]=new JRadioButton();
        add(radioButtons[i]);
        bg.add(radioButtons[i]);
    }
    btnNext=new JButton("Next");
    btnResult=new JButton("Result");
    btnResult.setVisible(false);
    btnResult.addActionListener(this);
    btnNext.addActionListener(this);
    add(btnNext);
    add(btnResult);
    setData();
    label.setBounds(30,40,450,20);
    radioButtons[0].setBounds(50,80,450,20);
    radioButtons[1].setBounds(50,110,200,20);
    radioButtons[2].setBounds(50,140,200,20);
    radioButtons[3].setBounds(50,170,200,20);
    btnNext.setBounds(100,240,100,30);
    btnResult.setBounds(270,240,100,30);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(null);
    setLocation(250,100);
    setVisible(true);
    setSize(600,350);
    
    }
    
    void setData(){
        radioButtons[4].setSelected(true);
        if (current==0){
            label.setText("Q1 : Dimanakah Letak Domain Pale Flame Di Genshin ?");
            radioButtons[0].setText("Liyue");
            radioButtons[1].setText("Monstad");
            radioButtons[2].setText("Inazuma");
            radioButtons[3].setText("Natlan");
        }
        if (current==1){
            label.setText("Q2 : Apa Kombinasi Elemental Yng membuat reaksi Overload di genshin ?");
            radioButtons[0].setText("Elemen Pyro + Electro");
            radioButtons[1].setText("Elemen Hydro + Pyro");
            radioButtons[2].setText("Elemen Pyro + Cryo");
            radioButtons[3].setText("Elemen Anemo + Hydro");
        }
        if (current==2){
            label.setText("Q3 : Pilihlah Karakter Big 3 Liyue Dengan Benar ?");
            radioButtons[0].setText("Yunjin, Xiao, Dan Hutao");
            radioButtons[1].setText("Zongli, Benneth, Dan Xiao");
            radioButtons[2].setText("Xiao, Ganyu, Dan Hutao");
            radioButtons[3].setText("Xinqiu, dan Chongyun");
        }
        if (current==3){
            label.setText("Q4 : Jenis Vision Apakah Yang Dimiliki Karakter Xiao");
            radioButtons[0].setText("Anemo");
            radioButtons[1].setText("Geo");
            radioButtons[2].setText("Pyro");
            radioButtons[3].setText(" Cryo");
        }
        if (current==4){
            label.setText("Q5 : Banner Apa Saja Yang Akan Keluar Di Update Genshin Impact 2.5");
            radioButtons[0].setText("Yunjin, dan Xiao");
            radioButtons[1].setText("Diluc");
            radioButtons[2].setText("Kazuha, dan Kokomi");
            radioButtons[3].setText("Yae Miko, Raiden Shogun, dan Kokomi");
        }
        if (current==5){
            label.setText("Q6 : Kapan Genshin Impact Dirilis? ");
            radioButtons[0].setText("28 September 2020");
            radioButtons[1].setText("29 September 2021");
            radioButtons[2].setText("30 Oktober 2020;");
            radioButtons[3].setText("1 Januari 2020");
        }
        if (current==6){
            label.setText("Q7 : Jika Saya Menggabungkan Elemen Cryo Dan Pyro Reaksi Apakah Yang Akan Terjadi? ");
            radioButtons[0].setText("Overload");
            radioButtons[1].setText("Melt");
            radioButtons[2].setText("Swirl");
            radioButtons[3].setText("Semua Salah");
        }
        if (current==7){
            label.setText("Q8 : Apakah Benar Hutao Memiliku Vision Cryo");
            radioButtons[0].setText("Benar");
            radioButtons[1].setText("Sedikit Benar");
            radioButtons[2].setText("1 dan 2 Benar");
            radioButtons[3].setText("Salah");
        }
        if (current==8){
            label.setText("Q9 : Apakah Celestail Yang Menghancurkan Peradaban Khaenriah ");
            radioButtons[0].setText("Netral");
            radioButtons[1].setText("Salah");
            radioButtons[2].setText("Benar");
            radioButtons[3].setText("1 dan 2 Benar");
        }
        if (current==9){
            label.setText("Q10 : Berasal dari Manakah Karakter Dainsleaf");
            radioButtons[0].setText("Khaenriah");
            radioButtons[1].setText("Inazuma");
            radioButtons[2].setText("Monstad");
            radioButtons[3].setText("Inazuma");
        }
        label.setBounds(30,40,450,20);
        for(int i=0,j=0;i<=90;i+=30,j++){
            radioButtons[j].setBounds(50,80+i,200,20);
        }
    
    }
    boolean checkAns(){
        if(current==0){
            return(radioButtons[1].isSelected());
        }
         if(current==1){
            return(radioButtons[0].isSelected());
        }
         if(current==2){
            return(radioButtons[2].isSelected());
        }
          if(current==3){
            return(radioButtons[0].isSelected());
        }
           if(current==4){
            return(radioButtons[3].isSelected());
        }
            if(current==5){
            return(radioButtons[0].isSelected());
        }
             if(current==6){
            return(radioButtons[1].isSelected());
        }
           if(current==7){
            return(radioButtons[3].isSelected());
        }
         if(current==8){
            return(radioButtons[2].isSelected());
        }
         if(current==9){
            return(radioButtons[0].isSelected());
        }
        
       
        
        return false;
    }
    public static void main(String[]ards){
        new QuizTest("Simple Quiz App by but___pizz");
    }
    
   @Override
    public void actionPerformed(ActionEvent e){
//        throw new UnsupportedOperationException("Not supported yet.");
        if(e.getSource()==btnNext){
            if(checkAns())
                count=count +1;
            current++;
            setData();
            if(current==9){
                btnNext.setEnabled(false);
                btnResult.setVisible(true);
                btnResult.setText("Result");
            }
        }
        if(e.getActionCommand().equals("Result")){
            if(checkAns())
                count=count +1;
            current++;
            JOptionPane.showMessageDialog(this, "Correct Answers are"+count);
            System.exit(0);
        }
        
    }
    
}
