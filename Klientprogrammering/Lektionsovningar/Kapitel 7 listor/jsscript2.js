let numlist = [1, 2, 3, 4 , 5, 6, 7, 8, 9, 10]

let strList = numlist.map(x => String(x))

for(let str of strList) {
    console.log(str);
    console.log(typeof(str))
}