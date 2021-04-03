# language: pt
Funcionalidade: Acessando o site https://www.gama.academy/
	Testando o acesso no site da Gama Academy
	
	Cenario: Testando acesso ao curso Product Management	
		Dado que eu estou no site da gama academy "https://www.gama.academy/"
		E clico na opcao para fechar a propaganda
		E clico em Product Management
		E abro uma nova aba
		E clico na opcao QUERO ME INSCREVER
		E clico na opcao para fechar o popup
		Entao devo ver o valor
		E o botao QUERO ME MATRICULAR
		
	Cenario: Testando acesso ao Dev Full Stack
		Dado que eu estou no site da gama academy "https://www.gama.academy/"
		E clico na opcao para fechar a propaganda
		E clico na opcao DEV FULL STACK
		E abro uma nova aba
		Entao devo ver as opcoes
    |Crie seu portfólio!| 
    |Acompanhamento de Carreira|
    |Professores de surf que sabem surfar!|
    |Estude na Melhor Startup de Educação|	