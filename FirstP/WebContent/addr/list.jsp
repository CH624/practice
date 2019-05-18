<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*, ch.addr.model.AddrDTO"%>

	<center>
		<h1>
			Address List with MVC
		</h1>
		<table border='1' cellpadding='7' cellspacing='2' width='50%'>
		    <tr>
			    <th>번호</th>
				<th>이름</th>
				<th>주소</th>
				<th>날짜</th>
				<th>삭제</th>
			</tr>
<%
	ArrayList<AddrDTO> list = (ArrayList<AddrDTO>)request.getAttribute("list");
	for(AddrDTO dto : list){
%>
			<tr>
			    <td align='center'><%=dto.getSeq() %></td>
				<td><%=dto.getName() %></td>
				<td><%=dto.getAddr() %></td>
				<td><%=dto.getRdate() %></td>
				<td align='center'><a href='addr.do?seq=<%=dto.getSeq()%>'>삭제</a></td>
			</tr>
<%
	}
%>
	</table>
	<br>
		<a href=''>글쓰기</a>
		&nbsp;&nbsp;&nbsp;&nbsp;
		<a href='./'>인덱스</a>
	</center>
