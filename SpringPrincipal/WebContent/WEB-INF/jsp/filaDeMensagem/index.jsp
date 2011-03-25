<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%@ include file="/template/header.jsp" %> 
	
	<div align="center">
		<div id="container">
			<h1>Fila de Mensagem</h1>
			<form action="<c:url value="/filaDeMensagem/envia"/>" name="form" method="post">
				<label for="valor">valor: </label> 
				<input id="mensagem" type="text" name="mensagem" value="${mensagem }" />
				<div align="right">
					<button type="submit" id="submit">Enviar Mensagem Para a Fila</button>
				</div>
			</form>
		</div>
	</div>

<%@ include file="/template/footer.jsp" %> 