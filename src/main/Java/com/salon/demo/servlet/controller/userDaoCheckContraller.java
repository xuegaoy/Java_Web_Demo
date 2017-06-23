package com.salon.demo.servlet.controller;


        import java.io.IOException;

        import javax.servlet.RequestDispatcher;
        import javax.servlet.ServletException;
        import javax.servlet.http.HttpServlet;
        import javax.servlet.http.HttpServletRequest;
        import javax.servlet.http.HttpServletResponse;

        import com.salon.demo.servlet.entity.User;
        import com.salon.demo.servlet.service.userDaoService;



public class userDaoCheckContraller extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private userDaoService cku = new userDaoService();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public userDaoCheckContraller() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doPost(request, response);
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        String nameString=request.getParameter("uname");
        String passwordString=request.getParameter("upwd");
        RequestDispatcher rd = null;
        String forward = null;
        if (nameString==null||passwordString==null) {
            request.setAttribute("msg", "用户密码为空");
            rd=request.getRequestDispatcher("/15/error.jsp");
            rd.forward(request,response);

        }else {
            User user = new User();
            user.setName(nameString);
            user.setPassword(passwordString);
            boolean bool = cku.check(user);

            if (bool) {
                forward="/15/Success.jsp";
            }else {
                request.setAttribute("msg", "用戶名密碼輸入錯誤");
                forward="/15/error.jsp";
            }
            rd=request.getRequestDispatcher(forward);
            rd.forward(request, response);
        }
    }

}

