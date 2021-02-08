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

let operations1 = [
    { name: "Summa", func: sum },
    { name: "Produkt", func: prod },
    { name: "Medel", func: avg },
]
let operations2 = [
    { name: "Medel", func: avg }
]

let nums = [1, 2, 3, 4, 5]

function performOperations(numbers, ops) {
    ops.forEach(({name, func}) => {
        console.log(name + ": ", func(numbers))
    })
}

performOperations(nums, operations1)


