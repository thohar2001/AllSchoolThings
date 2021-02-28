const app = {
    data() {
        return {
            message: 'Hello World!'
        }
    },

    methods : {
        log() {
            console.log(this.message)
        }
    }
}
Vue.createApp(app).mount("#app")