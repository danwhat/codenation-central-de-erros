# Central de Erros
API para gerenciamento de logs de erros. Desafio prático Aceleração Codenation com apoio da Conta Azul.

# Tecnologias Utilizadas
- Java
- Spring Boot
- Maven
- PostgreSQL
- Swagger
- Oauth2

# Instalação

# Documentação da API:

Caso prefira, você pode acessar a documentação do swagger acessando a url `http://localhost:8080/swagger-ui.html`

## Tabela de Endpoints

 **/user - POST** - Rota para criação de usuário. 
Recebe  através do **body** da requisição o email e senha, e cria um novo usuário.
```json
// Corpo da requisição:
   {
   	"name":"Nome",
   	"email": "contato@email.com",
   	"password": "senha123"
   }
```
 **/oauth/token - POST** - Rota de autenticação. Solicitação de token. 
Recebe  através do **body** da requisição o email e senha, e cria um novo usuário.
```json
// Corpo da requisição:
	*Colocar a estrutura aqui*
```

**GET - /log/** - Rota para listagem de Logs com paginação.
 Exemplificar utilização dos filtros, sort e paginação.

 **GET - /log/id** - Rota para exibir um Log especifico.

**POST - /log** - Rota para criação de Log. 
```json
// Corpo da requisição:
{
  "level":"error",
  "description":"Crash while server update",
  "log":"...",
  "origin":"Frontend Client",
  "date":"2021-04-07T16:11:26.485",
  "quantity":3
}
```
# Equipe
**Dan**  - github - linkedin
**Denner** - github - linkedin
**Mell** - github - linkedin
**Pedro** - github - linkedin
