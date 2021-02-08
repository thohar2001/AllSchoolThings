function sumOfList(list) {
    let sum = 0;
    for(let x of list) {
        sum = sum + x;
    }
    return sum;
}

console.log(sumOfList([1,4,5]))