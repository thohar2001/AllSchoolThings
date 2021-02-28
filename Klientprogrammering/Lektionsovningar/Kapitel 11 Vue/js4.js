const app = {
    data() {
        return {
            message: 'Hello World!',
            number: 100
        }
    }
}
Vue.createApp(app).mount("#app")