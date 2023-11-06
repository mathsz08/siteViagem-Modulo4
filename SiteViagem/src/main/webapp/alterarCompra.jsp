<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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
	<form action="AlterarCompraServlet" class="form-contato-container"
		method="post">
		<div class="m-card">
			<a href="promocoes.jsp"> <- Voltar</a>
			<div class="form-contato-container-forms">
				<h3>Alterar Compra</h3>
				<div>
					<label for="Valor">Companhia: </label> 
					<input id="Valor" type="number"
						name="Valor">
				</div>
				<input id="Passagem" type="hidden"
						name="Passagem" value="${Passagem.idPassagem }">

				<button type="Submit">Enviar</button>
			</div>
			<img style="width: 20%; heigth: 20%" alt="icone formulario"
				src="./imgs/img-2.png">
		</div>
	</form>
	<form action="inserirpassagemServlet" class="form-contato-container"
		method="post">
		<div class="m-card">
			<a href="promocoes.jsp"> <- Voltar</a>
			<div class="form-contato-container-forms">
				<h3>Alterar Passagem</h3>
				<div>
					<label for="Companhia">Companhia: </label> <input id="Companhia"
						name="Companhia">
				</div>
				<div>
					<label for="Valor">Valor: </label> <input type="Number"
						name="Valor" id="Valor">
				</div>
				<div>
					<label for="LocalPartida">Local Partida: </label> <input
						name="LocalPartida" id="LocalPartida">
				</div>
				<div>
					<label for="DataIda">Data Ida e volta: </label> <input
						style="font-size: 2.3rem;" type="date" name="DataIda" id="dataIda"
						placeholder="Data Nascimento" required> <input
						style="font-size: 2.3rem;" type="date" name="DataVolta"
						id="dataVolta" placeholder="Data Nascimento" required>
				</div>
				<div>
					<label for="Destino">Destinos: </label> <select id="Destinos"
						name="Destinos" style="width: 162px;" id="destino">
						<option value="Nan">Selecione um Destino</option>
						<jstl:forEach items="${Destinos }" var="destino">
							<option value="${ destino.idDestino}">${destino.pais }</option>
						</jstl:forEach>

					</select>
				</div>

				<button type="Submit">Enviar</button>
			</div>
			<img style="width: 20%; heigth: 20%" alt="icone formulario"
				src="./imgs/img-2.png">
		</div>
	</form>
</body>
</html>