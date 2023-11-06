<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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


<title>Login</title>
</head>
<body style="background-color: #a2836e;">
	<div class="menubg">
		<div class="menu-nav-container">
			<div class="menu-nav">
				<nav class="menu-nav-int">
					<a href="./destinos.html">Destinos</a> <a href="./promocoes.html">Promoções</a>
					<a href="./contato.html">Contato</a>
					</li>
				</nav>
				<a class="menu-nav-title" href="../index.html">Contrip</a>
				</li>
				<div class="menu-nav-int">
					<a href="./home.html">Sobre nós</a> 
					<a class="menu-nav-login"
						href="./login.jsp">Login </a>
				</div>
			</div>
		</div>
	</div>
	<div class="login">
		<div class="">a</div>
		<div class="login-forms-container">
			<h2>Preencha os Dados</h2>
			<div class="container"></div>
			<form action="CadastroEndereco" method="post" class="forms">
			<div id="forms-usuario">
				<center>
					<table>
						<tr>
							<td style="padding: 5px;"><label style="font-size: 2.3rem;"
								for="Rg">RG</label></td>
							<td style="padding: 5px;"><input style="font-size: 2.3rem;"
								type="text" name="Rg" id="Rg" placeholder="Rg" required></td>
						</tr>
						<tr>
							<td style="padding: 5px;"><label style="font-size: 2.3rem;"
								for="Nome">Nome</label></td>
							<td style="padding: 5px;"><input style="font-size: 2.3rem;"
								type="text" name="Nome" id="Nome" placeholder="Nome de Usuário" required></td>
						</tr>
						<tr>
							<td style="padding: 5px;"><label style="font-size: 2.3rem;"
								for="Login">Login</label></td>
							<td style="padding: 5px;"><input style="font-size: 2.3rem;"
								type="text" name="Login" id="Login" placeholder="Login de Usuário" required></td>
						</tr>
						
						<tr>
							<td style="padding: 5px;"><label style="font-size: 2.3rem;"
								for="Senha">Senha</label></td>
							<td style="padding: 5px;"><input style="font-size: 2.3rem;"
								type="password" name="Senha" id="Senha" placeholder="Senha" required></td>
						</tr>
						<tr>
							<td style="padding: 5px;"><label style="font-size: 2.3rem;"
								for="Cpf">Cpf</label></td>
							<td style="padding: 5px;"><input style="font-size: 2.3rem;"
								type="text" name="Cpf" id="Cpf" placeholder="Cpf" required></td>
						</tr>
						<tr>
							<td style="padding: 5px;"><label style="font-size: 2.3rem;"
								for="DataNasc">Data Nascimento</label></td>
							<td style="padding: 5px;"><input style="font-size: 2.3rem;"
								type="date" name="DataNascimento" id="DataNasc" placeholder="Data Nascimento" required>
							</td>
						</tr>
					</table>

					<p style="font-size: 1.4rem; text-align: center;">
						Ja é cadastrado? <a href="login.jso"
							style="font-size: 1.4rem; font-family: 'Yanone Kaffeesatz', sans-serif; text-decoration: underline;">Login</a>
					</p>
				</center>
				<button class="button" type="button" onclick="proximaTela()">Proximo</button>
			</div>
			<div id="forms-endereco" style="display: none;">
				<center>
					<table>
						<tr>
						<tr>
							<td style="padding: 5px;"><label style="font-size: 2.3rem;"
								for="Cep" name="Cep">Cep</label></td>
							<td style="padding: 5px;"><input style="font-size: 2.3rem;"
								type="text" name="Cep" id="Cep" placeholder="Cep" required></td>
						</tr>
						<td style="padding: 5px;"><label style="font-size: 2.3rem;"
							for="Pais" name="Pais">Pais</label></td>
						<td style="padding: 5px;"><input style="font-size: 2.3rem;"
							type="text" name="Pais" id="Pais" placeholder="Pais" required></td>
						</tr>
						<tr>
							<td style="padding: 5px;"><label style="font-size: 2.3rem;"
								for="Cidade" name="Cidade">Cidade</label></td>
							<td style="padding: 5px;"><input style="font-size: 2.3rem;"
								type="text" name="Cidade" id="Cidade" placeholder="Cidade" required></td>
						</tr>
						<tr>
							<td style="padding: 5px;"><label style="font-size: 2.3rem;"
								for="Bairro" name="Bairro">Bairro</label></td>
							<td style="padding: 5px;"><input style="font-size: 2.3rem;"
								type="text" name="Bairro" id="Bairro" placeholder="Bairro" required></td>
						</tr>
						<tr>
							<td style="padding: 5px;"><label style="font-size: 2.3rem;"
								for="Rua" name="Rua">Rua</label></td>
							<td style="padding: 5px;"><input style="font-size: 2.3rem;"
								type="text"  id="Rua" name="Rua" placeholder="Rua" required></td>
						</tr>
						<tr>
							<td style="padding: 5px;"><label style="font-size: 2.3rem;"
								for="Numero" name="Numero">Numero</label></td>
							<td style="padding: 5px;"><input style="font-size: 2.3rem;"
								type="text" name="Numero" id="Numero" placeholder="Numero" required></td>
						</tr>
					</table>

					<p style="font-size: 1.4rem; text-align: center;">
						Ja é cadastrado? <a href="login.jsp"
							style="font-size: 1.4rem; font-family: 'Yanone Kaffeesatz', sans-serif; text-decoration: underline;">Login</a>
					</p>
				</center>
				<button class="button" type="button" onclick="voltarTela()">Voltar</button>
				<button style="margin-left: 10px;" class="button" type="submit">
					Cadastrar</button>
			</div>
			</form>

		</div>
		<div class="">c</div>

		<img class="login-imagem" alt="garot utilizando o computador"
			src="./imgs/img1.png"> 
		<img class="login-imagem-2"
			alt="garot utilizando o computador" src="./imgs/img-2.png">

	</div>
	<script src="./js/script.js"></script>


	<link
		href="https://fonts.googleapis.com/css2?family=Yanone+Kaffeesatz:wght@300&display=swap"
		rel="stylesheet">

</body>
</html>