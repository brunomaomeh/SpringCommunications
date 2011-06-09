<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%@ include file="/template/header.jsp" %> 

	<div align="center">
		<div id="container">
			<h1>
				Menssageria
			</h1>
			<form action="<c:url value="/mensageriaTopico/consultaTopico"/>" name="form" method="get">
				<div align="right">
					<button type="submit" id="submit">Consulta no Topico</button>
				</div>
			</form>
		</div>
	</div>
	
<%@ include file="/template/footer.jsp" %> 