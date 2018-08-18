<jsp:useBean id="addcode" scope="page" class="com.assignment.nissan.addcode"/>
<%	
	String first_num = request.getParameter("t1");
	String second_num = request.getParameter("t2");
	
	String ans=addcode.func(first_num,second_num);
	out.print(ans);

%>