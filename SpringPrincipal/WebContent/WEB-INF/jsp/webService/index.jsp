<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%@ include file="/template/header.jsp" %> 

	<div align="center">
		<div id="container">
			<h1>Web-Service</h1>
			<form action="<c:url value="/webService/consome"/>" name="form" method="post">
				valor consumido: <b>${valorConsumido}</b>
				<div align="right">
					<button type="submit" id="submit">Consumir</button>
				</div>
			</form>
		</div>
	</div>

<%@ include file="/template/footer.jsp" %> 