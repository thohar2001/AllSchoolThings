const app = {
    data() {
        return {
            numbers: []
        }
    },

    methods: {
        addNumber() {
        let number = Math.floor(Math.random() * 100) + 1
        this.numbers.push(number)
     }
    }
}

Vue.createApp(app).mount("#app")