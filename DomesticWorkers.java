
package DomesticWorkers;
import java.util.Scanner;
class moathaf{
String nameMoathaf;
double bassalary;
double honeshour;
String whanborth;
float  ageMoathaf;
String cityMoathaf;
String addressMoathaf;
//eng\raghad waleed
}
public class DomesticWorkers {
   static  Scanner in = new Scanner(System.in); 
    public static void main(String[] args) {   
            alkiarat();
            System.out.print("ادخل رقم :");
               int choice=in.nextInt();    
         do{
         switch (choice) {     
            case 1:
               moathafInfo();
                break;   
            case 2:
                calculatenetsalary();
                break; 
            case 3:
                calculatetarget();
                break;
                 case 0:
                     System.out.println("الخروج من البرنامج ");
                break;
           default:
                throw new AssertionError();}}while(choice!=0);
         System.out.println("لقد تم الخروج من البرنامج ");
          in.close();
} 
    public static void calculatenetsalary( ){
    double x=.02; 
    double bassalary;
    double   honeshour;
    int t;
      
    
           do{    
                System.out.println("اذا كنت تريد المواصلة اختر (1)");
        System.out.println("اذا كنت تريد الخروج اختر (0)");
                t=in.nextInt();
                if(t==1){
               System.out.println("ادخل راتب  الموظف");
                bassalary=in.nextDouble();
                 System.out.println("************************************************");
                System.out.println("ادخل عدد ساعات العمل");
                honeshour=in.nextDouble();
                 System.out.println("************************************************");
                System.out.println("الان سيتم حساب المكافأه +الضريبة");
   
       if( bassalary>=50000){ 
       x=.05;
       }
       double e=50.0;
       double taxas =bassalary *x;
       double incen =e*honeshour;
        if(honeshour>=15){
       incen+=500;
       }
        
       double netsalary= bassalary- taxas+incen;
       printdetails(bassalary ,taxas,incen,netsalary);}
                
           }while(t!=0);
           System.out.println("تم الخروج من البرنامج");
          in.close();
    
}
public static void printdetails(double x,double taxas,double incen,double netsalary ){ 
        System.out.println("salary Datails:");
        System.out.println("------------------");
        System.out.println("your base salary:  10000");
        System.out.println("taxes :"+x);
         System.out.println("salary after tax :" +taxas);
        System.out.println(" incentive:"+incen);
          System.out.println("------------------");
        System.out.println("not salary :"+netsalary+"$");
         System.out.println("target deatils:"); }

public static void calculatetarget(){ 
    System.out.println("ادخل مبلغ الاستثمار المراد الاستثمار به : ");
    double akrameh=in.nextDouble();
         double sels=.05;
         double selsw= akrameh;
      for (int i = 1; i < 12; i++) {
     
                System.out.println("month"+i+":"+"   "+ (int) selsw);
                 selsw = akrameh+( akrameh*sels);
         akrameh=selsw;}}
public static void moathafInfo(){
     System.out.println("ادخل عدد الموظفين ");
        int size=in.nextInt();
        
    moathaf moathafInfo[]=new moathaf[size];
    for (int i = 0; i <moathafInfo.length ; i++) {
           moathafInfo[i] =new moathaf();
            System.out.println("************************************************");
            System.out.println((i+1)+"ادخل اسم الموظف");
           moathafInfo[i] .nameMoathaf=in.next();
            System.out.println("ادخل راتب الموظف");
              moathafInfo[i] .bassalary =in.nextDouble();
               System.out.println("ادخل عدد ساعات العمل ");
                moathafInfo[i] .honeshour=in.nextDouble();
                System.out.println("ادخل تاريخ ميلاد الموظف كامل ");
                 moathafInfo[i] .whanborth=in.next();
                 System.out.println("ادخل عمر الموظف");
                  moathafInfo[i] .ageMoathaf=in.nextFloat();
                   System.out.println("ادخل جنسية العاملة ");
                  moathafInfo[i] .cityMoathaf=in.next();                 
                   System.out.println("ادخل عنوان سكن الموظف");
                    moathafInfo[i] .addressMoathaf=in.next();
                    
               System.out.println("************************************************");      
        }for (int i = 0; i <moathafInfo.length ; i++) {
            
            System.out.println("moathaf"+(i+1)+":");
             System.out.println("-----------------------");
            System.out.println("His name:"+moathafInfo[i] .nameMoathaf);
             System.out.println("-----------------------");
            System.out.println("His bassalary: "+moathafInfo[i] .bassalary);
             System.out.println("-----------------------");
            System.out.println("His honeshour"+ moathafInfo[i] .honeshour);
             System.out.println("-----------------------");
            System.out.println("His dete borth:"+ moathafInfo[i] .whanborth);
            System.out.println("-----------------------");
            System.out.println("His cantry :"+moathafInfo[i] .cityMoathaf);
             System.out.println("-----------------------");           
            System.out.println("His  age:"+moathafInfo[i] .ageMoathaf);
             System.out.println("-----------------------");
            System.out.println("His address :"+ moathafInfo[i] .addressMoathaf);
            System.out.println("************************************************");    
        }
}
public static void alkiarat(){
    System.out.println("************************************************");
         System.out.println("---------- السلام عليكم ورحمة الله وبركاته----------");
         System.out.println("************************************************");
         System.out.println("\t----------(-3-0-1-2)اختر رقم----------");
          System.out.println("************************************************");
          System.out.println("للخروج النهائي من البرنامج(0)");
         System.out.println("************************************************");
         System.out.println("لادخال بيانات الموظفين  (1)");
          System.out.println("************************************************");
          System.out.println("لحساب الظريبة وحساب الاكراميه(2)");
         System.out.println("************************************************");
         System.out.println("لمعرفة الاستثمار المالي   (3)");
         System.out.println("************************************************");



}

}