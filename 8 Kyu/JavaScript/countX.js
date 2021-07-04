function countBy(x, n) {
    var z = [];
    for (let i = x; i <= n; i++){
      if(i % x == 0) z.push(i);
    }
    return z;
}

console.log(countBy(1,10))

