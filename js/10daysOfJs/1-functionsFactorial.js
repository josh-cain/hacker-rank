'use strict';

function factorial(number) {
    if (number === 1) {
        return 1;
    }

    return number * factorial(number - 1);
}

process.stdout.write(`${factorial(4)}`);
