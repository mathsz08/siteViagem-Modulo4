<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="jstl"%>
<!DOCTYPE html>
<html lang="en">
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


<title>Promoções</title>
</head>
<body>
	<header>
		<div class="header-backimg"></div>
		<div class="hidden-nav">
			<div class="dropdown-header">
				<center>
					<img src="./imgs/icon_menu.png">
				</center>
				<ul class="dropdown-content-header">
					<li><a href="home.html">Sobre nós/a></li>
					<li><a href="destinos.html">Destinos</a></li>
					<li><a href="#">Promoções</a></li>
					<li><a href="contato.html">Contato</a></li>
					<li><a href="login.jsp">${sessionScope.Usuario.nome} <img
							alt="icone login"
							style="height: 20px; width: 20px; border: 1px solid black; border-radius: 50%;"
							src="./imgs/user.png">
					</a></li>

				</ul>
			</div>
		</div>
		<ul class="header-nav">
			<li><a style="background-color: transparent;"
				href="../index.html"><img class="header-nav-logo"
					src="./imgs/airplane.png" alt="Logo Empresa"></a></li>
			<li><a href="home.html">Sobre nós</a></li>
			<li><a href="destinos.html">Destinos</a></li>
			<li><a href="#">Promoções</a></li>
			<li><a href="contato.html">Contato</a></li>
			<li><a href="login.html">${sessionScope.Usuario.nome} <img
					alt="icone login"
					style="height: 20px; width: 20px; border: 1px solid black; border-radius: 50%;"
					src="./imgs/user.png">
			</a></li>
		</ul>

		<ul class="header-content">
			<li>
				<h2>Promoções</h2>
				<p>Encontre aqui sua viagem dos sonhos por valores acessiveis e
					invista em uma aventura unica, prazerosa e edificante.</p>
			</li>
		</ul>
	</header>
	<main class="main-promocoes">
		<div class="filtro-box">
			<h3>Localizações</h3>
			<hr>
			<div class="filtro-box-lugares">
				<div class="dropdown">
					<p class="frst-child">Europa</p>
					<div class="dropdown-content">
						<hr>
						<div class="filtro">
							<input type="checkbox" name="alemanha" id="alemanha"> <label
								for="alemanha">Alemanha</label>
						</div>
						<hr>
						<div class="filtro">
							<input type="checkbox" name="Portugal" id="Portugal"> <label
								for="Portugal">Portugal</label>
						</div>
						<hr>
						<div class="filtro">
							<input type="checkbox" name="Italia" id="Italia"> <label
								for="Italia">Italia</label>
						</div>
						<hr>
						<div class="filtro">
							<input type="checkbox" name="Franca" id="Franca"> <label
								for="Franca">França</label>
						</div>


					</div>
				</div>
				<div class="dropdown">
					<p class="frst-child">Asia</p>
					<div class="dropdown-content">
						<hr>
						<div class="filtro">
							<input type="checkbox" name="Japão" id="Japão"> <label
								for="Japão">Japão</label>
						</div>
						<hr>
						<div class="filtro">
							<input type="checkbox" name="China" id="China"> <label
								for="China">China</label>
						</div>
						<hr>
						<div class="filtro">
							<input type="checkbox" name="India" id="India"> <label
								for="India">India</label>
						</div>
						<hr>
						<div class="filtro">
							<input type="checkbox" name="Franca" id="Franca"> <label
								for="Franca">Coreia</label>
						</div>


					</div>
				</div>
				<div class="dropdown">
					<p class="frst-child">America</p>
					<div class="dropdown-content">
						<hr>
						<div class="filtro">
							<input type="checkbox" name="Brasil" id="Brasil"> <label
								for="Brasil">Brasil</label>
						</div>
						<hr>
						<div class="filtro">
							<input type="checkbox" name="Chile" id="Chile"> <label
								for="Chile">Chile</label>
						</div>
						<hr>
						<div class="filtro">
							<input type="checkbox" name="Italia" id="México"> <label
								for="Italia">Canada</label>
						</div>
						<hr>
						<div class="filtro">
							<input type="checkbox" name="Franca" id="Estados Unidos">
							<label for="Franca">Mexico</label>
						</div>


					</div>
				</div>
				<div class="dropdown">
					<p class="frst-child">Nacionais</p>
					<div class="dropdown-content">
						<hr>
						<div class="filtro">
							<input type="checkbox" name="Brasil" id="Brasil"> <label
								for="Brasil">Fernando de Noronha</label>
						</div>
						<hr>
						<div class="filtro">
							<input type="checkbox" name="Chile" id="Chile"> <label
								for="Chile">Foz do Iguaçul</label>
						</div>
						<hr>
						<div class="filtro">
							<input type="checkbox" name="Italia" id="México"> <label
								for="Italia">Angra dos Reis</label>
						</div>
						<hr>
						<div class="filtro">
							<input type="checkbox" name="Franca" id="Estados Unidos">
							<label for="Franca">Alter do Chão</label>
						</div>


					</div>
				</div>


			</div>

			<div class="filtro-box-valores">
				<h3>Valores</h3>
				<hr>
				<div>
					<label for="Valores">Insira o valor maximo: </label> <input
						type="range" min="1" max="100" value="50"
						class="filtro-box-valores-slider" id="valores">
				</div>
			</div>

			<div class="filtro-box-tipo">
				<h3>Tipo de Voo</h3>
				<hr>
				<div class="filtro-box-tipo-container">
					<input type="checkbox" name="ida-only" id="ida-only"> <label
						for="ida-only">Somente Ida</label>
				</div>
				<div class="filtro-box-tipo-container">
					<input type="checkbox" name="ida-volta" id="ida-volta"> <label
						for="ida-volta">Ida e Volta</label>

				</div>
			</div>
			<div style="margin:10px" class="filtro-box-tipo">
				<a
					style="border: 1px solid black; padding: 10px; border-radius: 10px; font-size: 2rem; margin-top: 10px; text-decoration: none"
					href="cadastrarViagem.jsp">Cadastrar nova viagem</a>
			</div>
			</br>

			<div style="margin:10px" class="filtro-box-tipo">
				<a
					style="border: 1px solid black; padding: 10px; border-radius: 10px; font-size: 2rem; margin-top: 10px; text-decoration: none"
					href="lerPassagemServlet">Cadastrar nova passagem</a>
			</div>
			</br>
			<div style="margin:10px" class="filtro-box-tipo">
				<a
					style="border: 1px solid black; padding: 10px; border-radius: 10px; font-size: 2rem; margin-top: 10px; text-decoration: none"
					href="readComprasServlet">Vizualizar Compras</a>
			</div>


		</div>

		<div class="box-products">
			<h3>Destinos:</h3>
			<ul class="lista-viagens">
				<jstl:forEach items="${ sessionScope.Passagens}" var="viagem">
					<li class="viagem">


						<div class="m-card">
							<div class="info">
								<h4>${viagem.destino.cidade }</h4>
								<hr>
								<p>Valor: ${viagem.valor } | Companhia: ${viagem.companhia }
								</p>
								<p>Aeroporto: ${viagem.destino.aeroporto }</p>
								<div class="sub-card">
									<div class="sub-info">
										<p></p>
										<p>Partida: ${viagem.localPartida }</p>
									</div>
									<form style="width: 80%;" action="InserirCompraServlet" method="post">
										<input type="hidden" name="idPassagem" value="${ viagem.idPassagem }" >
										<button style=" width: 50%;" type="submit">Comprar</button>
									</form>
								</div>
							</div>
						</div>
					</li>
				</jstl:forEach>
				
			</ul>
		</div>

	</main>
	<hr style="color: #674d3c; margin: 0px;">
	<footer>
		<div class="info-footer">
			<h4>Veja Também:</h4>
			<ul>
				<li><a href="/home.html">Home</a></li>
				<li><a href="destinos.html">Destinos</a></li>
				<li><a href="#">Promoções</a></li>
				<li><a href="contato.html">Contato</a></li>
			</ul>
		</div>
		<div class="info-footer-social-media">
			<h4>Nos siga nas redes sociais:</h4>
			<div class="info-footer-logos-container">

				<img src="./imgs/instagram.png" alt="logo instagram"> <img
					src="./imgs/facebook.png" alt="logo facebook"> <img
					src="./imgs/twitter.png" alt="logo twitter">

			</div>
		</div>
	</footer>
	<link
		href="https://fonts.googleapis.com/css2?family=Yanone+Kaffeesatz:wght@300&display=swap"
		rel="stylesheet">
</body>
</html>