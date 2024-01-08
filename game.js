const numeroAleatorio = Math.floor(Math.random() * 10) + 1;

let tentativas = 3;

console.log("Bem-vindo ao jogo de adivinhação! Você tem 3 tentativas para adivinhar um número entre 1 e 10.");

process.stdin.on('data', function(data) {
  const numeroEscolhido = Number(data);

  if (numeroEscolhido === numeroAleatorio) {
    console.log('Parabéns, você acertou o número!');
    process.exit();
  } else {
    tentativas--;

    if (tentativas > 0) {
      console.log(`Errado! Você ainda tem ${tentativas} tentativas.`);
    } else {
      console.log(`Game over! O número era ${numeroAleatorio}.`);
      process.exit();
    }
  }
});