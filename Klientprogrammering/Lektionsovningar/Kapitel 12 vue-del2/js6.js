const app = {
    data() {
        return {
            currJoke: ''
        }
    },

    methods: {
        async getJoke() {
            return fetch('https://icanhazdadjoke.com', 
                                {headers: {'Accept': 'application/json'}})
                                .then(resp => resp.json())  
                                .then(json => this.currJoke = json.joke)
        }
    },

    mounted() {
        this.getJoke()
    }
}

Vue.createApp(app).mount("#app")