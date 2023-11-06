<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="jstl"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="./css/reset.css">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM"
	crossorigin="anonymous">
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link rel="stylesheet" href="./css/style.css">


</head>
<body>
	<a href="promocoes.jsp"> <- Voltar</a>
	<div class="box-products">
		<h3>Compras:</h3>
		<ul class="lista-viagens">
			<jstl:forEach items="${ Compras}" var="compra">
				<li class="viagem">


					<div class="m-card">
						<div class="info">
							<h1>${compra.passagem.companhia }-
								${compra.passagem.destino.pais }</h1>
							<p>Usuario: ${compra.usuario.getRg()}</p>
							<p>Passagem: ${compra.passagem.idPassagem }</p>
							<p>Valor total: ${compra.valorTotal }</p>
						</div>
						<form style="width: 80%;" action="DeleteCompraServlet"
							method="post">
							<input type="hidden" name="idPassagem"
								value="${ compra.passagem.idPassagem }">
							
							<button style="width: 50%;" type="submit">Deletar</button>
						</form>
						<form style="width: 80%;" action="AlterarCompraServlet"
							method="get">
							<input type="hidden" name="Passagem"
								value="${ compra.passagem.idPassagem }">
							
							<button style="width: 50%;" type="submit">Alterar</button>
						</form>
					</div>

				</li>
			</jstl:forEach>

		</ul>
	</div>
</body>
</html>