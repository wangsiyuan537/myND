import Vue from 'vue'
import App from './App.vue'
import router from './router'
import store from './store'
import ElementUI from 'element-ui'
import uploader from 'vue-simple-uploader'
import 'element-ui/lib/theme-chalk/index.css'
import './assets/style/base.styl'
import '@/router/before.js'
import all from '@/libs/globalFunction.js'

Vue.use(ElementUI)
Vue.use(uploader)

Vue.config.productionTip = false
Vue.use(all);

new Vue({
  router,
  store,
  render: h => h(App)
}).$mount('#app')
