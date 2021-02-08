//ovn 5 och 6

class Person {
    constructor(name, lastname) {
        this.name = name
        this.lastname = lastname
    }

    printInfo() {
        console.log(this.name + " " + this.lastname)
    }

    greet() {
        console.log(`Hello ${this.name} ${this.lastname}`)
    }
}

class Employee extends Person {
    constructor(name, lastname, company) {
        super(name, lastname)
        this._company = company
    }

    set company(c) {
        this._company = c
        console.log(c)
    }

    get company() {
        return this._company
    }

    printInfo() {
        console.log(this.name + " " + this.lastname + " works at " + this.company)
    }
}

let p1 = new Person("Thomas", "Haraldsson")
p1.printInfo()
p1.greet()


let p2 = new Employee("Thomas", "Haraldsson", "Yrgo")
p2.printInfo()

console.log("-------------\n")

const aTeacher = new Employee('John', 'Doe', 'Yrgo')
aTeacher.printInfo()
aTeacher.greet()

console.log("__________________")
console.log(p2.company)
p2.company = "Chalmers"



