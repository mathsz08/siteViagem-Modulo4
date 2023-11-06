<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="./css/reset.css">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">  
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
                    <a href="./destinos.html">Destinos</a>
                    <a  href="promocoes.jsp">Promo��es</a>
                    <a  href="./contato.html">Contato</a></li>
                </nav>
                <a class="menu-nav-title" href="../index.html">Contrip</a></li>
                <div class="menu-nav-int">
                    <a href="./home.html">Sobre n�s</a>
                    <a class="menu-nav-login"  href="Cadastro.jsp">Cadastre-se </a>
                </div>
            </div>
        </div>
    </div>
    <div class="login">
        <div class="">
a
        </div>
        <div class="login-forms-container">
            <h2>Preencha os Dados</h2>
            <form action="entrar" method="post" class="forms">
                <center>
                    <table>
                        <tr>
                            <td style="padding: 5px;">
                                <label style="font-size: 2.3rem;" for="Login">Login</label>
                            </td>
                            <td style="padding: 5px;">
                                <input style="font-size: 2.3rem;" type="text" id="Login" placeholder="Nome de Usu�rio">
                            </td>
                        </tr>
                        <tr>
                            <td style="padding: 5px;">
                                <label style="font-size: 2.3rem;" for="Senha">Senha</label>
                            </td>
                            <td style="padding: 5px;">
                                <input style="font-size: 2.3rem;" type="password" id="Senha" placeholder="Senha">
                            </td>
                        </tr>
                    </table>
                    <button type="submit" class="button">
                        Entrar
                    </button>
                    <p style="font-size: 1.4rem; text-align: center;">
                        N�o � logado? <a href="Cadastro.jsp" style="font-size: 1.4rem;font-family: 'Yanone Kaffeesatz', sans-serif; text-decoration: underline;">Cadastre-se</a>
                    </p>
                </center>
            </form>
        </div>
        <div class="">c</div>

        <img class="login-imagem" alt="garot utilizando o computador" src="./imgs/img1.png" >
        <img class="login-imagem-2" alt="garot utilizando o computador" src="./imgs/img-2.png" >
    
    </div>
    
    
    <link href="https://fonts.googleapis.com/css2?family=Yanone+Kaffeesatz:wght@300&display=swap" rel="stylesheet">
</body>
</html>