class Operation {
    constructor(name, func) {
        this.name = name
        this.func = func
    }
}

function sum(arr) {
    return arr.reduce((n, sum) => n + sum)
}
function prod(arr) {
    return arr.reduce((n, sum) => n * sum)
}
function avg(arr) {
    let arrSum = sum(arr)
    return arrSum / arr.length
}

let operations1 = [new Operation("Sum", sum),
                   new Operation("Produkt", prod), 
                   new Operation("Medel", avg)
                  ]


let nums = [1, 2, 3, 4, 5]

function performOperations(numbers, ops) {
    ops.forEach(({name, func}) => {
        console.log(name + ": ", func(numbers))
    })
}


performOperations(nums, operations1)
