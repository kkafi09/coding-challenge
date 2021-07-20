// Return an array
function fizzbuzz(n)
{
  var result = [];
  for(let i = 1; i <= n; i++){
    if (i % 3 == 0 && i % 5 == 0){
      result.push("Fizz buzz");
    } else if (i % 3 == 0){
      result.push("Fizz");
    } else if(i % 5 == 0){
      result.push("Buzz")
    } else{
      result.push(i)
    }
  }
  return result;
}

console.log(fizzbuzz(10))

