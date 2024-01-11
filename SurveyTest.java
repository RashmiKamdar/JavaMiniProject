import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
import javax.swing.JFrame;  
import javax.swing.SwingUtilities;  
import org.jfree.chart.ChartFactory;  
import org.jfree.chart.ChartPanel;  
import org.jfree.chart.JFreeChart;  
import org.jfree.chart.plot.PlotOrientation;  
import org.jfree.data.category.CategoryDataset;  
import org.jfree.data.category.DefaultCategoryDataset; 
import java.text.DecimalFormat;      
import javax.swing.WindowConstants;  
import org.jfree.chart.labels.PieSectionLabelGenerator;  
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;  
import org.jfree.chart.plot.PiePlot;  
import org.jfree.data.general.DefaultPieDataset;  
import org.jfree.data.general.PieDataset; 
import java.io.*;
import java.text.DecimalFormat;  
  
class Info
 {
   String name,city;
   int age;
   int id;
   char gender,ans;
   Date d_o_vacc;
  Scanner sc=new Scanner(System.in);
  
  
    void addInfo() throws Exception
     {
       System.out.println("Enter ID:");
       id=sc.nextInt();
       System.out.println("Enter your name: ");
       name=sc.next();
         label1:
          while(true)
           { 
             System.out.println("Enter your age: ");
             age=sc.nextInt();
              try
               {  
                if(age<=0)
                  { 
                    System.out.println("Invalid age: "); 
                    continue label1;
                  }
                else 
                  
                  break label1;
               }
             catch(ArithmeticException e)
               {
                 System.out.println("Invalid age " + e);
               } 
          }
        label2:
         while(true)
          {
            System.out.println("Enter your gender: ");
            gender=sc.next().charAt(0);
              try
               {
                 if(gender!='F' && gender != 'M')
                  {
                    System.out.println("Invalid gender, please enter gender as M or F");
                    continue label2;
                  }
                    else
                 
                    break label2;
               }
                
             catch(Exception ex)
               {
                 System.out.println("Invalid Gender " + ex);
               }
          }

            System.out.println("Enter your city name: ");
            city=sc.next();
            System.out.println("Enter the date of vaccination");
            String vdate=sc.next();
            d_o_vacc=new SimpleDateFormat("dd/mm/yyyy").parse(vdate);
             System.out.println("Do you have any symptoms of covid-19 for.eg sore throat,fever,loss of smell and taste");
      ans=sc.next().charAt(0);
       
        if(ans=='Y')
         {
           System.out.println("You are not elligible for taking covid vaccine");

         }
       
       else
         {
          System.out.println("Please select the vaccine :");
          int vn;
          System.out.println("\n \n***VACCINES***");
          System.out.println("1.Covishield");
          System.out.println("2.Covaccine");
          System.out.println("3.Sputnik");
          System.out.println("4.Johnsons");
          System.out.println("Enter the vaccine number which you would like to take:");
          vn=sc.nextInt();  
         }
         System.out.println(ans);
     }
    void getInfo() throws Exception
       {
         /*System.out.println("Id= " + id);
         System.out.println("Name = " + name);
         System.out.println("Age = " + age);
         System.out.println("Gender = " + gender);
         System.out.println("City = " + city);*/
         SimpleDateFormat formatter = new SimpleDateFormat("dd/mm/yyyy");  
         String d_o_vacc_str = formatter.format(d_o_vacc);
         //System.out.println("Vaccine date = " + d_o_vacc);
         System.out.println(id+"\t"+name+"\t"+age+"\t"+gender+"\t"+city+"\t"+d_o_vacc_str+"\t"+"corona symptoms=" + ans);
      }

  static int search_vaccinedetails(VaccineDetails vd[],int vc,String type) throws Exception
      {
        Scanner sc=new Scanner(System.in);
        int i,found=0;
        int choice;
        System.out.println("Enter the type of searching operation");
        System.out.println("1.Search by id");
        System.out.println("2.Search by name");
        System.out.println("3.Search by age");
        System.out.println("4.Search by gender");
        System.out.println("5.Search by city");
        System.out.println("6.Search by date");
        System.out.println("Enter the search number according to your requirement ");
        choice=sc.nextInt();
        switch(choice)
         {
           case 1:

        int vacc_id;
        System.out.println("Enter the id of the person whose vaccine status you want to check" + type);
        vacc_id=sc.nextInt();
while(true)
{        
for(i=0;i<vc;i++)
          {
             if(vd[i].id==vacc_id)
               {
                   found=1;
                   vd[i].getInfo();
                 }
                       //if
                   
               }//for
          
        return i++;

      } //while

 //case 1

                
           case 2:
          
        String vacc_name;
        System.out.println("Enter the name of the person whose vaccine status you want to check" + type);
        vacc_name=sc.next();
while(true)
{        
for(i=0;i<vc;i++)
          {
             if(vd[i].name.equals(vacc_name))
               {
                   found=1;
                   vd[i].getInfo();
            }
                      //if
                   
               }  //for

        return i++;
      }//while

      case 3:
         
          
        int vacc_age;
        System.out.println("Enter the age of the person whose vaccine status you want to check" + type);
        vacc_age=sc.nextInt();
while(true)
{        
for(i=0;i<vc;i++)
          {
             if(vd[i].age==vacc_age)
               {
                   found=1;
                   vd[i].getInfo();
                 }
                    
                   
               }//if
           //for
        return i++;
      }//search

                

      case 4:
       
        char vacc_gen;
        System.out.println("Enter the gender of the person whose vaccine status you want to check" + type);
        vacc_gen=sc.next().charAt(0);

        for(i=0;i<vc;i++)
          {
if(vd[i].gender==vacc_gen)
                {
                        found=1;
                        vd[i].getInfo();
                      
                  } 
               //if
          } //for
      
      //search
         
      case 5:
          
        String vacc_city;
        System.out.println("Enter the city of the person whose vaccine status you want to check" + type);
        vacc_city=sc.next();
while(true)
{        
for(i=0;i<vc;i++)
          {
             if(vd[i].city.equals(vacc_city))
                {
                   found=1;
                   vd[i].getInfo();
                }
                      
                   
               }//if
           //for
        return i++;
      }//search

      case 6:
           
        Date vacc_date;
        System.out.println("Enter the date of the person whose vaccine status you want to check" + type);
       
          String vc_date=sc.next();
       vacc_date=new SimpleDateFormat("dd/mm/yyyy").parse(vc_date);
while(true)
{        
for(i=0;i<vc;i++)
          {
            if(vd[i].d_o_vacc.equals(vc_date))
               {
                   found=1;
                   vd[i].getInfo();
                  }
                      //if
                   
               }//for
             return i++;

      }//while
//switch
   default:
                    System.out.println("Invalid Option");
                    break;
          

  }
  return 0;
}



 

class BarChartExample extends JFrame {  
  
//  private static final long serialVersionUID = 1L;  
  
 public BarChartExample(String appTitle) {  
    super(appTitle);  
  
    // Create Dataset  
    CategoryDataset dataset = createDataset();  

    //Create chart  
    JFreeChart chart=ChartFactory.createBarChart(  
        "Bar Chart Example", //Chart Title  
        "Year", // Category axis  
        "Population in Million", // Value axis  
        dataset,  
        PlotOrientation.VERTICAL,  
        true,true,false  
       );  
  
    ChartPanel panel=new ChartPanel(chart);  
    setContentPane(panel);  
  }  
  
  private CategoryDataset createDataset() {  
    DefaultCategoryDataset dataset = new DefaultCategoryDataset();  
    // int x=20;
      
  if(ans=='Y')
  {
    // Population in 2005  
    dataset.addValue(100 , "Not Vaccinated","Ratio");   
  }
  else
    // Population in 2010 
    { 
     dataset.addValue(10, "Vaccinated","Ratio");  
    dataset.addValue(90, "NotVaccinated","Ratio");  
  }
  
    return dataset;  
  }  
}
/*public class PieChartExample extends JFrame {  
 // private static final long serialVersionUID = 6294689542092367723L;  
  
  public PieChartExample(String title) {  
    super(title);  
  
    // Create dataset  
    PieDataset dataset = createDataset();  
  
    // Create chart  
    JFreeChart chart = ChartFactory.createPieChart(  
        "Pie Chart Example",  
        dataset,  
        true,   
        true,  
        false);  
  
    //Format Label  
    PieSectionLabelGenerator labelGenerator = new StandardPieSectionLabelGenerator(  
        "Vaccine {0} : ({2})", new DecimalFormat("0"), new DecimalFormat("0%"));  
    //((PiePlot) chart.getPlot()).setLabelGenerator(labelGenerator);  
      
    // Create Panel  
    ChartPanel panel = new ChartPanel(chart);  
    setContentPane(panel);  
  }  
  
  private PieDataset createDataset() {  
    Scanner sc=new Scanner(System.in);
    char ans;
    int a=40;
    int b=30;
    int c=20;
    int d=10;
    
    DefaultPieDataset dataset=new DefaultPieDataset();  
    dataset.setValue("Covishield", a);  
    dataset.setValue("Covaccine", b);  
    dataset.setValue("Sputnik", c);  
    dataset.setValue("Johnsons", d);  
  
    return dataset;  
  }  

}*/
static void sort_vaccinedetails(VaccineDetails vd[],int vc)
    {
       
        System.out.println("Select the following options for SORTING...");
         Scanner sc=new Scanner(System.in);
        int choice;
        System.out.println("Enter the type of searching operation");
       
        System.out.println("1.Sort by name");
        System.out.println("2.Sort by city");
        System.out.println("3.Sort by date");
        System.out.println("Enter the search number according to your requirement ");
        choice=sc.nextInt();
        switch(choice)
         {

       
case 1:

                for(int i=0;i<vc-1;i++)
                {
                    for(int j=i+1;j<vc;j++)
                    {
                           if(vd[i].name.compareTo(vd[j].name)>0)
                           {
                              
                            int st_id=vd[i].id;
                              vd[i].id=vd[j].id;
                              vd[j].id=st_id;


                              String st_name=vd[i].name;
                              vd[i].name=vd[j].name;
                              vd[j].name=st_name;

                              int st_age=vd[i].age;
                              vd[i].age=vd[j].age;
                              vd[j].age=st_age;

                               String st_city=vd[i].city;
                              vd[i].city=vd[j].city;
                              vd[j].city=st_city;


                              Date st_date=vd[i].d_o_vacc;
                              vd[i].d_o_vacc=vd[j].d_o_vacc;
                              vd[j].d_o_vacc=st_date;

                           }  // end of if

                    } // end of i loop
                } // end of j loop
                  System.out.println("PERSON SUCCESSFULLY SORTED BY PERSON NAME...");
                break;  

      

      case 2:

                for(int i=0;i<vc-1;i++)
                {
                    for(int j=i+1;j<vc;j++)
                    {
                           if(vd[i].city.compareTo(vd[j].city)>0)
                           {
                              
                            int st_id=vd[i].id;
                              vd[i].id=vd[j].id;
                              vd[j].id=st_id;


                              String st_name=vd[i].name;
                              vd[i].name=vd[j].name;
                              vd[j].name=st_name;

                              int st_age=vd[i].age;
                              vd[i].age=vd[j].age;
                              vd[j].age=st_age;

                               String st_city=vd[i].city;
                              vd[i].city=vd[j].city;
                              vd[j].city=st_city;


                              Date st_date=vd[i].d_o_vacc;
                              vd[i].d_o_vacc=vd[j].d_o_vacc;
                              vd[j].d_o_vacc=st_date;

                           }  // end of if

                    } // end of i loop
                } // end of j loop
                  System.out.println("PERSON SUCCESSFULLY SORTED BY PERSON CITY...");
                break;  

      case 3:
                for(int i=0;i<vc-1;i++)
                {
                    for(int j=i+1;j<vc;j++)
                    {
                           if(vd[i].d_o_vacc.compareTo(vd[j].d_o_vacc)>0)
                           {
                              
                              int st_id=vd[i].id;
                              vd[i].id=vd[j].id;
                              vd[j].id=st_id;


                              String st_name=vd[i].name;
                              vd[i].name=vd[j].name;
                              vd[j].name=st_name;

                              int st_age=vd[i].age;
                              vd[i].age=vd[j].age;
                              vd[j].age=st_age;

                               String st_city=vd[i].city;
                              vd[i].city=vd[j].city;
                              vd[j].city=st_city;


                              Date st_date=vd[i].d_o_vacc;
                              vd[i].d_o_vacc=vd[j].d_o_vacc;
                              vd[j].d_o_vacc=st_date;

                           }  // end of if

                    } // end of i loop
                } // end of j loop
                System.out.println("PERSONS SUCCESSFULLY SORTED BY MANUFACTURING DATE...");
                break;  
        
        default:System.out.println("INVALID OPTION...");
                break;    

        }// end of switch..case

    } // end of update_product()
}

class VaccineDetails extends Info 
 {
  
   void vaccine() throws Exception
    {
      addInfo();
     
      Scanner sc=new Scanner(System.in); 
     
         getInfo();
    } //vaccine()
 } //VaccineDetails

   
class SurveyTest 
 {
  public static void main(String args[]) throws Exception
    {   
      
        Scanner sc=new Scanner(System.in);

        VaccineDetails vd[]=new VaccineDetails[50];
        int vc=0,id=0,i;
    

      
       while(true)
        {
         System.out.println("*****Operations*****");
         System.out.println("1-add");
         System.out.println("2-total vaccines");
         System.out.println("3-search");
       
         System.out.println("4-sort");
         System.out.println("5-display");
         System.out.println("6-bar graph");
         System.out.println("7-pie chart");
         System.out.println("8-exit");
         System.out.println("Enter the operation number which you would like to perform:");
         int choice=sc.nextInt();
         switch(choice)
           {
             case 1:
                 vd[id]=new VaccineDetails();
                 vd[id].addInfo();
                 id++;
                 vc++;
                 break;

             case 2:
           System.out.println("Total vaccines = " + vc);
                 break;

             case 3:
                  int vacc_id=VaccineDetails.search_vaccinedetails(vd,vc,"Searched"); 
                    for(int j=0;j<vc;j++)
               {   
                  if(vacc_id<vc) 
                          {    
                            System.out.println("person is FOUND and details are as follows\n");
                            System.out.println("ID\t NAME\t AGE\t GENDER\t CITY\t VACC. DATE");
                            vd[j].getInfo();
				                    
                          }

                        else 
                           { 
                           System.out.println("Person not found");
                     break;
                   }
                
             break;
            }   
             case 4:
               
                        VaccineDetails.sort_vaccinedetails(vd,vc);
                       
                        break;

             case 5:
                  if(vc==0)
                        {
                             System.out.println("There is no such person in the database");   
                        }    
                        else
                        {    
                            System.out.println("person Details are as follows\n");
                             System.out.println("ID\t NAME\t AGE\t GENDER\t CITY\t VACC. DATE");
                            for(i=0;i<vc;i++)
                            {    
                            vd[i].getInfo();
                            }
                        }
                 break;

          case 6:

                  SwingUtilities.invokeAndWait(()->{  
      BarChartExample example=new BarChartExample("Bar Chart Window");  
      example.setSize(800, 400);  
      example.setLocationRelativeTo(null);  
      //example.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);  
      example.setVisible(true); 
     
    });  
       break; 

              case 7: 
   /* SwingUtilities.invokeLater(() -> {  
      PieChartExample example = new PieChartExample("Pie Chart Example");
      example.setSize(800, 400);  
      example.setLocationRelativeTo(null);  
     // example.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);  
      example.setVisible(true);  
    });  
  
         break;  */ 


          case 8:
                  System.out.println("End of Program");
                  System.exit(0);
                  break;     
           } // switch
        }//while
     } //main
 } 
 //SurveyTest


                         
     
        