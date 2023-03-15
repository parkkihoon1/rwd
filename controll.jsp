
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.*" %>
<%@ page import="mvc.model.BoardDAO"%>
<%@ page import="mvc.model.BoardDTO" %>
<%
    request.setCharacterEncoding("utf-8");

    //컨트롤러 요청 파라미터
    String action = request.getParameter("action");

    BoardDAO dao = new BoardDAO();
    BoardDTO addressBookDTO = new BoardDTO();

    //검색
    if(action.equals("search")){
    String part = request.getParameter("part");
    String keyword = request.getParameter("keyword");
    ArrayList<BoardDTO> datas = dao.getDBListBySearch(part, keyword);
    request.setAttribute("part", part);
    request.setAttribute("keyword", keyword);
    request.setAttribute("datas", datas);
    pageContext.forward("list.jsp");
    }

    else{
    out.println("<script>alert('action 파라미터를 확인해 주세요 !!!')</script>");
    }
%>