// when website is loaded, it will retrieve a random joke
window.addEventListener('load', (evt) => {
    getJoke(evt)
})

// handles fails when fetching jokes
function handleErrors(resp) {
    if(!resp.ok) {
        console.log(resp)
        throw new Error(resp.status)
    }
    return resp
}

// Class that contains methods to fetch jokes
class JokeService {
    getRandom() {
        return fetch('/api/fortune')
            .then(handleErrors)
            .then(resp => resp.json())
            .then(json => json.fortune)
    }
    getShort() {
        return fetch('/api/short')
            .then(handleErrors)
            .then(resp => resp.json())
            .then(json => json.fortune)
    }
    getShower() {
        return fetch('/api/showerthought')
            .then(handleErrors)
            .then(resp => resp.json())
            .then(json => json.fortune)
    }
    getTraditional() {
        return fetch('/api/traditional')
            .then(handleErrors)
            .then(resp => resp.json())
            .then(json => json.fortune)
    }

    search(query) {
        query = encodeURIComponent(query);
        return fetch(`/api/query?q=${query}`)
            .then(resp => {
                if (!resp.ok) {
                    throw new Error(resp.status)
                }
                return resp.json()
            })
    }
}

let oldJokes = []
let currentJokes = []

function updateJokes() {
    for (let para of oldJokes) {
        console.log(oldJokes)
        document.body.removeChild(para)
    }

    for (let para of currentJokes) {
        document.body.appendChild(para)
    }
}

//on failed fetch, display the following text
let errorJoke = document.getElementById('errorjoke')
errorJoke.innerText = 'Could not fetch joke! Try again later.'

const aJokeService = new JokeService
//text is assigned inner text of the button in getJoke()
let text
let matches = document.getElementById('matches')

async function getJoke(evt) {
    matches.style.display = 'none'
    errorJoke.style.display = 'none'

    // remove previous searched jokes
    if (searchedJokes.length > 0) {
        searchedJokes.length = 0
        for (let para of Array.from(document.getElementsByTagName('p'))) {
            document.body.removeChild(para)
        }
    }
    if (evt.target.innerText !== undefined) {
        text = evt.target.innerText
    }
    else {
        text = 'Random'
    }
    if (text === 'Random') {
        try {
            resp = await aJokeService.getRandom()
            addJoke(resp)
        }
        catch(error) {
            errorJoke.style.display = 'block'
        }
    }
    else if (text === 'Short') {
        try {
            resp = await aJokeService.getShort()
            addJoke(resp)
        }
        catch(error) {
            errorJoke.style.display = 'block'
        }
    }
    else if (text === 'Shower') {
        try {
            resp = await aJokeService.getShower()
            addJoke(resp)
        }
        catch(error) {
            errorJoke.style.display = 'block'
        }
    }

    else if (text === 'Traditional') {
        try {
            resp = await aJokeService.getTraditional()
            addJoke(resp)
        }
        catch(error) {
            errorJoke.style.display = 'block'
        }
    }
    else {
        try {
            resp = await aJokeService.getRandom()
            addJoke(resp)
        }
        catch(error) {
            errorJoke.style.display = 'block'
        }
    }

    if (currentJokes.length >= 10) {
        updateJokes()
        currentJokes.pop()
        oldJokes = Array.from(document.getElementsByTagName('p'))
    }
}

let p

function addJoke(resp) {
    p = document.createElement('p')
    p.innerText = text + " Joke!\n\n" + resp
    document.body.appendChild(p)
    currentJokes.unshift(p)
}

let form = document.getElementById('form')
form.addEventListener('submit', searchJoke)
let searchedJokes = []

async function searchJoke(evt) {
    //prevent page refresh when submitting form
    evt.preventDefault()
    errorJoke.style.display = 'none'
    matches.style.display = 'block'
    
    oldJokes = Array.from(document.getElementsByTagName('p'))
    for (let para of oldJokes) {
        document.body.removeChild(para)
    }
    let search = document.getElementById('query').value

    try {
        resp = await aJokeService.search(search)
    
        let max = 0
        for (let joke of Array.from(resp)) {
            p = document.createElement('p')
            p.innerText = joke.fortune
            document.body.appendChild(p)
            searchedJokes.unshift(p)
            max++
            if (max === 30) {
                break;
            }
        }
        matches.innerText = "Matches: " + resp.length + " (showing " + max + ")"
        currentJokes.length = 0
    }
    catch(error) {
        if(Number(error.message) === 400) {
            console.log(error + " \nquery too short.")
            matches.innerText = "Search needs to be atleast 3 letters long!"
        }
        else {
            matches.innerText = "Server appears to be down... Try again later."
            console.log(error)
        } 
    }
}

let buttons = document.getElementsByClassName('buttons')
for (let button of buttons) {
    button.addEventListener('click', (evt) => getJoke(evt))
}

