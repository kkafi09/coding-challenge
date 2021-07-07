function reverseWords(str){
      let word = str.split(" ");
      let temp = [];
      for (let i = (word.length - 1); i >= 0; i--) {
            temp.push(word[i])
      }   
      return temp.join(" ");
}

console.log(reverseWords("hello world!"), "world! hello")
console.log(reverseWords("yoda doesn't speak like this" ),  "this like speak doesn't yoda")
console.log(reverseWords("foobar"                       ),  "foobar")
console.log(reverseWords("kata editor"                  ),  "editor kata")
console.log(reverseWords("row row row your boat"        ),  "boat your row row row")