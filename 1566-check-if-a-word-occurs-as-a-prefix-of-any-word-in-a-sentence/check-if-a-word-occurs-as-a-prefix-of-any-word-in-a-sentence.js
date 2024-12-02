/**
 * @param {string} sentence
 * @param {string} searchWord
 * @return {number}
 */
var isPrefixOfWord = function(sentence, searchWord) {
    const word=sentence.split(' ');
    for(let a=0;a<word.length;a++){
        if(word[a].startsWith(searchWord))return a+1;
    }
    return -1;
};