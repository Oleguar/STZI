package info.teib.lab.oleguar.lab1;
import java.util.*;
/**
 * Created by ���� on 11.10.2015.
 */
public class Reader1 {

    public void Scan(){
        System.out.println("���� ��� ������?");
        Scanner scn = new Scanner (System.in);
        int a  = scn.nextInt();
        int b = 15;
        int c = 10;
        int d = 8;
        int e = 7;
        int f = 5;
         if(a>=b)


         System.out.println("�� �� ����� �� ������ �������� ���� �� �����:���� � ��������,������� �������,����� � ������ �� �������,�������� ��� ����� ����." );
        if(a<b)
            System.out.println("�� �� ����� �� ������ �������� ���� �� �����:������� �������,����� � ������ �� �������,�������� ��� ����� ����");
        if(a<c)
            System.out.println("�� �� ����� �� ������ �������� ���� �� �����:������� �������,����� � ������ �� ������� ��� ����� ����");
        if(a<d)
            System.out.println("�� �� ����� �� ������ �������� ���� �� �����:����� � ������ �� ������� ��� ����� ����");
        if(a<e)
            System.out.println("�� �� ����� �� ������ �������� ����� � ������ ");
        if(a<f)
            System.out.println("�� ����� �� ������ ��������");

         {

        }
    }

}
