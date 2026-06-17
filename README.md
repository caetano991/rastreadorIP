# 📍 Rastreador de IP (IP Tracker API)

> API REST desenvolvida em Java com Spring Boot voltada para a geolocalização dinâmica de endereços IP públicos. O sistema consome serviços globais de mapeamento, processa os dados brutos e os entrega de forma limpa e estruturada.

---

## 🚀 Funcionalidades Principais

### 🌐 1. Consumo de API Externa em Tempo Real
O sistema atua como um intermediário inteligente. Ele não armazena localmente as coordenadas do mundo inteiro; em vez disso:
* Conecta-se via protocolo HTTP com provedores de geolocalização (como a *IP-API*).
* Transmite o IP enviado pelo usuário de forma segura e assíncrona.

### 🔄 2. Tratamento e Filtragem de Dados (Desserialização)
As APIs externas costumam retornar dezenas de informações que seu sistema pode não precisar (como fusos horários complexos ou códigos postais). 
* Filtra os dados brutos em formato **JSON**.
* Converte e mapeia apenas as propriedades essenciais para o usuário final, utilizando a biblioteca **Jackson** para evitar quebras no sistema por dados desconhecidos.

### 🚪 3. Endpoint Unificado
* Exposição de uma rota simples e intuitiva (`/rastrear`) via método **GET**.
* Captura dinâmica do IP diretamente pelos parâmetros da URL (*Query Parameters*).

---

## 🛠️ Tecnologias & Ferramentas

O projeto foi desenhado seguindo a arquitetura padrão de mercado (Controller -> Service -> DTO):

| Camada / Função | Tecnologia / Ferramenta |
| :--- | :--- |
| **Linguagem Principal** | Java 17+ |
| **Framework Base** | Spring Boot 3.x (Spring Web) |
| **Cliente HTTP (Mensageiro)** | RestTemplate |
| **Manipulação de JSON** | Jackson (`@JsonIgnoreProperties`) |
| **Controle de Versão** | Git e GitHub |
| **Testes de Requisição** | Insomnia |

---

## 📸 Demonstração do Fluxo de Dados

### 1. Envio da Requisição (Interface do Desenvolvedor)
> O teste de rota feito através do **Insomnia**, disparando uma requisição GET para o servidor local passando o IP de teste no parâmetro.
<img width="1436" height="807" alt="{78D1C590-55DA-4FCD-BB7B-495BBA6A9431}" src="https://github.com/user-attachments/assets/13d41075-72b8-4562-8a66-b507510df2b5" />


### 2. Resposta Estruturada (JSON)
Quando o sistema processa o IP, a resposta retornada na tela limpa os dados excessivos e exibe um objeto direto:

#### JSON
{
	"city": "Ashburn",
	"country": "United States",
	"isp": "Google LLC",
	"regionName": "Virginia",
	"status": "success"
}

🔧 Como Executar o Projeto Localmente
Pré-requisitos
Java JDK 17 ou superior instalado.

Maven instalado (ou o próprio wrapper do Maven incluso no projeto).

Uma ferramenta para testar a rota (como Insomnia, Postman ou o próprio navegador).

Passo a Passo
Clone o repositório:

Bash
git clone [https://github.com/SEU_USUARIO/NOME_DO_REPOSITORIO.git](https://github.com/SEU_USUARIO/NOME_DO_REPOSITORIO.git)
cd NOME_DO_REPOSITORIO
Compile o projeto e baixe as dependências:

Bash
./mvnw clean install
(No Windows, use mvnw.cmd clean install)

Inicie a aplicação Spring Boot:

Bash
./mvnw spring-boot:run
Como Testar:
Abra o seu navegador ou o Insomnia e faça uma requisição GET para o seguinte endereço (substituindo o 8.8.8.8 pelo IP que você desejar rastrear):

http://localhost:8080/rastrear?ip=8.8.8.8

👨‍💻 Autor
Estudante de Análise e Desenvolvimento de Sistemas (ADS) no SENAI. Desenvolvedor focado em entender a fundo a arquitetura de software, integrações de sistemas e o ecossistema Java/Spring.
