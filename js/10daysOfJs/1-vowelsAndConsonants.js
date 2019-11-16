'use strict';

const vowels = ['a', 'e', 'i', 'o', 'u']

/*
 * Complete the vowelsAndConsonants function.
 * Print your output using 'console.log()'.
 */
function vowelsAndConsonants(inputString) {
    if (!inputString) {
        return;
    }
    if (typeof inputString !== 'string') {
        throw new Error(`vowelsAndConsonants input must be a string, got ${typeof inputString}`);
    }

    var notVowels = [];

    for (let letter of inputString) {
        if (vowels.indexOf(letter) > -1) {
            process.stdout.write(`${letter}\n`);
        } else {
            notVowels.push(letter);
        }
    }

    // now print non-vowels
    for (let letter of notVowels) {
        process.stdout.write(`${letter}\n`);
    }
}

vowelsAndConsonants('javascriptloops');
