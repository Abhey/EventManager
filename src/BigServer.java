
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abhey Rana
 */
public class BigServer implements Runnable {
    public static Thread t;
    public static Server Abhey;
    public static int z=0;
    public static int access=1;
    public BigServer(String str){
        t=new Thread(this,str);
        t.start();
    }
    public static void main(String args[]){
        String Username=JOptionPane.showInputDialog("Enter Username for mysql server");
        String Password=JOptionPane.showInputDialog("Enter Password for mysql server");
        Server.User=Username;
        Server.Password=Password;
        Abhey=new Server();
        if(access==1){
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        Abhey.setVisible(true);
        }
    }
    public void Interrupt() throws IOException{
        t.interrupt();
        Abhey.server.close();
    }
    @Override public void run(){
        if(z==0)
            z=1;
        else{
            try {
                Abhey.server=new ServerSocket(8080);
            } catch (IOException ex) {
                Logger.getLogger(BigServer.class.getName()).log(Level.SEVERE, null, ex);
            }
            while(true){
            try{
                Socket Sock=Abhey.server.accept();
                Thread t=new Thread(new Work(Sock,Abhey.reqCount),"Thread"+Abhey.reqCount);
                t.start();
                Abhey.reqCount++;
            }
            catch(java.net.SocketException e){
                break;
            }
            catch(Exception e){
                System.out.println("Error Occurred:"+e);
            }
          }
        }
    }
}
