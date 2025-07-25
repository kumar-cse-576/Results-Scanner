/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package results;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 *
 * @author klu
 */
public class EcetResults extends javax.swing.JFrame {
  public ArrayList<String> ord[] = new ArrayList[700];
  public int fail=0,cnt=0;
    /**
     * Creates new form EcetReslts
     */
    public EcetResults() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        _end = new javax.swing.JTextField();
        _srt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        _pref = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText(" LETS GO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("END VALUE");

        jLabel2.setText(" START VALUE");

        _end.setText("10250");

        _srt.setText("10001");

        jLabel3.setText(" Prefix");

        _pref.setText("42660");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(185, 185, 185)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(_srt, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_end, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_pref, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(123, 123, 123))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(105, 105, 105)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(266, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_pref, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(_srt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_end, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addComponent(jButton1)
                .addGap(126, 126, 126))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(86, 86, 86)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(253, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        System.setProperty("webdriver.chrome.driver", "D:\\#programing\\JAVA\\NetBeansProjects1\\Results\\src\\results\\chromedriver.exe");
        
        DesiredCapabilities d = new DesiredCapabilities();
        d.setAcceptInsecureCerts(true);
       
        ChromeOptions co = new ChromeOptions();
        co.merge(d);
        co.addArguments("--remote-allow-origins=*");
         System.out.println("helll");
        WebDriver driver = new ChromeDriver(co);
        System.out.println("initiating");
        driver.get("http://www.manabadi.co.in/Entrance-Exams/ap-ecet-results-andhrapradesh-engineering-common-entrance-test-results.asp");
        System.out.println("sleep started");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(ResultsScrap.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("sleep ed");
        int hl,st=Integer.parseInt(_srt.getText()),en=Integer.parseInt(_end.getText());
        
        String pref = _pref.getText(), data;
     
        for (hl = st; hl <= en;hl++) {
            
        WebElement _hln = driver.findElement(By.xpath("//*[@id=\"htno\"]"));//  //*[@id="htno"]
        WebElement _brn = driver.findElement(By.xpath("//*[@id=\"Degree\"]"));
        WebElement btn = driver.findElement(By.xpath("//*[@id=\"btnsubmit\"]"));
        WebElement _tot;
       
                
            _hln.sendKeys(pref + String.valueOf(hl));
            _brn.sendKeys("ENG");
            btn.click();
                  try {
            Thread.sleep(1100);
        } catch (InterruptedException ex) {
            Logger.getLogger(ResultsScrap.class.getName()).log(Level.SEVERE, null, ex);
        }
        
            /*
            _tot = driver.findElement(By.xpath("//*[@id=\"subhtm\"]/table[1]/tbody/tr[3]/td[2]"));
            data = _tot.getText();
            System.out.print(data + "  ");
            */
            
            
try{
         //branch   
          _tot = driver.findElement(By.xpath("//*[@id=\"subhtm\"]/table[1]/tbody/tr[4]/td[2]"));// //*[@id="subhtm"]/table[1]/tbody/tr[4]/td[2]
          
          data = _tot.getText();
           if(true){//data.equals("ELECTRONICS AND COMMUNICATION ENGINEERING")
                 ArrayList<String> l= new ArrayList<>();
                 
                  //total
            _tot = driver.findElement(By.xpath("//*[@id=\"subhtm\"]/table[1]/tbody/tr[5]/td[2]"));
            data = _tot.getText();
             l.add(data);
            System.out.print(data + ",  ");
            
             //rank
              _tot = driver.findElement(By.xpath("//*[@id=\"subhtm\"]/table[1]/tbody/tr[6]/td[2]"));
            data = _tot.getText();
             l.add(data);
            System.out.print(data + ",  ");
             //name
            _tot = driver.findElement(By.xpath("//*[@id=\"subhtm\"]/table[1]/tbody/tr[3]/td[2]"));
            data = _tot.getText();
            l.add(data);
            System.out.print(data + ",  ");
            
                        //i_rank
              _tot = driver.findElement(By.xpath("//*[@id=\"subhtm\"]/table[1]/tbody/tr[7]/td[2]"));
            data = _tot.getText();
             l.add(data);
            System.out.print(data+",  ");
            //hallticket no
                System.out.print(pref+hl+"  ");
              l.add(pref+String.valueOf(hl));
              //branch
              _tot = driver.findElement(By.xpath("/html/body/div[1]/table/tbody/tr/td[3]/table[2]/tbody/tr/td/div/div/div[1]/table[1]/tbody/tr[4]/td[2]"));
            data = _tot.getText();
            System.out.print(data+",  ");
             l.add(data);
           
         
           
            

             System.out.println("");
            ord[cnt]=l;
            cnt++;
           }
                
         //           _hln.clear();
         //   _brn.clear();
           // }
               _hln.sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME));
        
        }catch(NoSuchElementException e){
                _hln.sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME));
                }
        }
        System.out.println("list went for sorted...");
        sortList();
        System.out.println("list sorted");
        System.out.println("MARKS,  B_RANK,  NAME,  I_RANK,  HALL_T_NO");
         for (int i = cnt-1; i >=0; i--) {
             
            ArrayList<String> arrayList = ord[i];
            
            for (int j = 0; j < arrayList.size(); j++) {
                System.out.print(arrayList.get(j) + "  ");
            }
            System.out.println();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public void sortList(){
        int i,j;
         ArrayList<String> temp= new ArrayList<String>();
        for(i=0;i<cnt-1;i++)
        {
            for(j=0;j<cnt-i-1;j++){
                
                System.out.println(i+"  "+j+"  "+ord.length+"   "+cnt+" "+ord[j].get(0)+" "+ord[j+1].get(0));
                if(ord[j].get(0)==null||ord[j+1].get(0)==null){
                    System.out.println(i+"  "+j+"skipped");
                 continue;
                }
               if(Integer.parseInt(ord[j].get(0))>Integer.parseInt(ord[j+1].get(0))){
                  System.out.print("  swapping");
                  temp=ord[j];
                ord[j]=ord[j+1];
                ord[j+1]=temp;
               }
            }
        }
    }
   
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EcetResults.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EcetResults.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EcetResults.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EcetResults.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EcetResults().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField _end;
    private javax.swing.JTextField _pref;
    private javax.swing.JTextField _srt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
