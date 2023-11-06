<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="./css/reset.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">  
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link rel="stylesheet" href="./css/style.css">
    
</head>
	<body style="background-color: #fff2df;">
	<center >
		<form action="inserrirDestinoServlet" class="form-contato-container" method="post">
                    <div class="m-card" >
                    <a href="promocoes.jsp"> <- Voltar</a>
                        <div class="form-contato-container-forms">
                            <h3>Cadastre um destino</h3>
                            <p>oi ${sessionScope.Usuario.nome	} </p>
                           
                            <div>
                                <label for="Cidade">Cidade: </label>
                                <input id="Cidadde" name="Cidade">
                            </div>
                            <div>
                                <label for="Pais">Pais: </label>
                                <input name="Pais" id="Pais">
                            </div>
                            <div>
                                <label for="Aeroporto">Aeroporto: </label>
                                <input name="Aeroporto" id="titulo">
                            </div>
                           
                            
                            <button>Enviar</button>
                        </div>
                        <img style="width:20%;heigth:20%" alt="icone formulario" src="./imgs/img-2.png">
                    </div>
                </form>
        	</center>
		<link href="https://fonts.googleapis.com/css2?family=Yanone+Kaffeesatz:wght@300&display=swap" rel="stylesheet">
	</body>
</html>