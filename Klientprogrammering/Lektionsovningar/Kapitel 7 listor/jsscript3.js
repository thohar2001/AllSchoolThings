let string = "Hello. My name is Jonas. Weezer wrote a song about me once upon a time in Finland"

let stringList = string.split(' ').filter(x => x.length >= 4)

for(let elem of stringList) {
    console.log(elem)
}