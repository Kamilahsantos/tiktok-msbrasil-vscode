let board = [' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '];
let currentPlayer = 'X';

function printBoard() {
    console.log(
        '\n' +
        ' ' + board[0] + ' | ' + board[1] + ' | ' + board[2] + '\n' +
        ' ---------\n' +
        ' ' + board[3] + ' | ' + board[4] + ' | ' + board[5] + '\n' +
        ' ---------\n' +
        ' ' + board[6] + ' | ' + board[7] + ' | ' + board[8] + '\n'
    );
}

function checkWin() {
    const winConditions = [
        [0, 1, 2],
        [3, 4, 5],
        [6, 7, 8],
        [0, 3, 6],
        [1, 4, 7],
        [2, 5, 8],
        [0, 4, 8],
        [2, 4, 6]
    ];

    for (let condition of winConditions) {
        if (board[condition[0]] === currentPlayer &&
            board[condition[1]] === currentPlayer &&
            board[condition[2]] === currentPlayer) {
            return true;
        }
    }

    return false;
}

function makeMove(index) {
    if (board[index] === ' ') {
        board[index] = currentPlayer;
        printBoard();

        if (checkWin()) {
            console.log(`O jogador ${currentPlayer} venceu!`);
            process.exit();
        }

        currentPlayer = currentPlayer === 'X' ? 'O' : 'X';
    } else {
        console.log('Esta posição já está ocupada. Tente novamente.');
    }
}

console.log('Jogo da Velha - Os jogadores devem alternar as jogadas, inserindo o índice da posição (0-8) onde desejam jogar.');
printBoard();

process.stdin.on('data', function(data) {
    const index = Number(data);
    makeMove(index);
});