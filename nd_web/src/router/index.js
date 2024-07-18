import Vue from 'vue'
import VueRouter from 'vue-router'  //  引入vue-router模块
import Home from '../views/Home.vue'  //  引入Home页面对应的文件

Vue.use(VueRouter)  //  将VueRouter挂载在Vue上

// 创建路由列表

const routes = [
  {
    path: '/',  //  路由路径，即浏览器地址栏中显示的URL
    name: 'Home', //  路由名称
    component: Home //  路由所使用的页面
  },
  {
    path: '/login', //  登录页面
    name: 'Login',
    component: () => import(/* webpackChunkName: "login" */ '../views/Login.vue')
  },
  {
    path: '/register', //  注册页面
    name: 'Register',
    component: () => import(/* webpackChunkName: "register" */ '../views/Register.vue')
  },
  {
    path: '*',  //  404页面
    name: 'Error_404',
    component: () => import(/* webpackChunkName: "error_404" */ '../views/Error_404.vue')
  }
]

// 创建路由实例
const router = new VueRouter({
  mode: 'history',  //  HTML5 History 模式
  base: process.env.BASE_URL,
  routes
})

export default router
