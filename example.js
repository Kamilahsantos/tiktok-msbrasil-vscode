// Importa o módulo HTTP do Node.js
const http = require('http');

// Define a porta em que o servidor irá escutar
const port = 3000;

// Cria o servidor
const server = http.createServer((req, res) => {
  // Define o cabeçalho da resposta
  res.statusCode = 200;
  res.setHeader('Content-Type', 'text/plain');
  
  // Envia a resposta
  res.end('Olá, Kamila Code!\n');
});

// Inicia o servidor
server.listen(port, () => {
  console.log(`Olá KamilaCode, o servidor está rodando em http://localhost:${port}/`);
});