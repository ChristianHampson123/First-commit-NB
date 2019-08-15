/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 *
 * @author chris
 */
public class login extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
          response.sendRedirect("index3.html");
        
    public class MyOnlineStore {
    public static void main(String[]args) throws SQLException {
        Connection myConn = null;
        Statement myStmt = null;
        ResultSet myRs= null;
        Scanner sInput = new Scanner(System.in);
        System.out.println("Hello User. Do you wish to create a new account or sign in");
        String sNew = sInput.next();
        sNew.toLowerCase();
        switch(sRecurring)
            {
            case ("sign in"):
                System.out.println("Please enter your username and password");
                System.out.println("username");
                String user = sInput.next();
                System.out.println("password");
                String pass =sInput.next();
               myRs = myStmt.executeQuery("select * from Online_sellers");
               if ((user.equals(user_name) && (pass.equals(user_password)))) {
                   System.out.println("Right, Do you wish to change your etting ");;
                } else {
                   System.out.println("404, sorry we can not find that username );
                 }
            break;
            case ("new account"):
                  System.out.println("Welcome new user, Please be patient with us and enter your username");
                  String Username= sInput.next();
                  System.out.println("Thank you now ,Please enter your password");
                  String password = sInput.next();
                    try {
                        myConn = DriverManager.getConnection("jdbc:mysql://localhost:8080/index","Christian","chris123");
                        myStmt = myConn.createStatement();
            
                        myRs = myStmt.executeQuery("SELECT userOs_name,\n" +
                                                    "      userOs_password,\n" +    
                                                    "FROM   Onlinne_sellers\n" +
                                                    "WHERE  EXISTS (SELECT 1\n" +
                                                    "               FROM   userOs_name\n" +
                                                    "               WHERE  userOs_password = password\n");
                                                    
                        PreparedStatement prepstmt = myConn.prepareStatement("insert into Online_sellers(userSo_name,userSo_password)values(?,?)");
                        prepstmt.setString(1,Username);
                        prepstmt.setString(2,password);
                        prepstmt.executeUpdate();
                        System.out.println("Wow new information new you");
                        myConn.getOnline_sellers.getuserOs_name;
                        myConn.getOnline-sellers.getuserOs_password;
                                
                  while (myRs.next()){
                        System.out.println(myRs.getString("userSo_name")+", "+myRs.getString("userOs_password"));
                        }
            
//            System.out.println("You are beenig updated right now");
//            int i = prepstmt.executeUpdate();
//            System.out.println(i);
//            while (myRs.next()){
//             System.out.println(myRs.getString("userOs_name")+", "+myRs.getString("userOs_password"));
//            }
            
            
                    System.out.println("Ohh no , Do you want to remove this account");
                    String sdelete =sInput.next();
            
                    if (sdelete.equalsIgnoreCase("yes")){
                        System.out.println("Im sorry to lose you , is there anything we can do to keep you here?");
                        prepstmt =myConn.prepareStatement("delete from Online_sellers where userOs_name =('"+Username+"')");
                        int i = prepstmt.executeUpdate();
                        System.out.println(""+i+":( you have be successfully removed ");
           
                } catch(Exception exc) {
                    exc.printStackTrace();
            } finally {
                if (myRs != null){
                    myRs.close();
                }
                if (myStmt != null){
                    myStmt.close();
                }
                if (myConn != null){
                    myConn.close();
                }
              break;
                
        if (request.UserProduct("Buyers_role")|| request.UserProduct("Sellers_role")){
        session.setAttribute("UserRole","Buyers_role");
        UserName username = new UserName();
        int product_id =UserName.searchAction(Orders.getPro().getName().toString);
        session.setAttribute("sessSelctedPar",String.valueOf(product_id));
            System.out.println("The Parnterid is "+String .valueOf(product_id));
            
        }
                
                
         
    }
  }
}      
          
          
        }
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
